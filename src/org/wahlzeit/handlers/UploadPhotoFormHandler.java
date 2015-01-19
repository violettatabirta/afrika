/*
 * Copyright (c) 2006-2009 by Dirk Riehle, http://dirkriehle.com
 *
 * This file is part of the Wahlzeit photo rating application.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 */

package org.wahlzeit.handlers;

import java.util.*;
import java.io.*;

import org.wahlzeit.location.AfrikaPhoto;
import org.wahlzeit.location.AfrikaResidents;
import org.wahlzeit.location.AfrikaVegetation;
import org.wahlzeit.location.AfrikaWater;
import org.wahlzeit.model.*;
import org.wahlzeit.services.*;
import org.wahlzeit.utils.*;
import org.wahlzeit.webparts.*;

/**
 * 
 * @author dirkriehle
 *
 */
public class UploadPhotoFormHandler extends AbstractWebFormHandler {

	/**
	 *
	 */
	public UploadPhotoFormHandler() {
		initialize(PartUtil.UPLOAD_PHOTO_FORM_FILE, AccessRights.USER);
	}

	/**
	 * 
	 */
	protected void doMakeWebPart(UserSession us, WebPart part) throws AssertionError, IllegalStateException, IllegalArgumentException {
		Map<String, Object> args = us.getSavedArgs();
		part.addStringFromArgs(args, UserSession.MESSAGE);

		part.maskAndAddStringFromArgs(args, Photo.TAGS);

		String afrikaResidents = "";
		String afrikaVegetation = "";
		String afrikaWater = "";

		for (int i = 0; i < AfrikaResidents.toArray().length; i++) {
			afrikaResidents += "<option " + "value=\""
					+ AfrikaResidents.toArray()[i] + "\"" + " selected" + ">"
					+ AfrikaResidents.toArray()[i] + "</option>";
		}

		for (int i = 0; i < AfrikaVegetation.toArray().length; i++) {
			afrikaVegetation += "<option " + "value=\""
					+ AfrikaVegetation.toArray()[i] + "\"" + " selected" + ">"
					+ AfrikaVegetation.toArray()[i] + "</option>";
		}

		for (int i = 0; i < AfrikaWater.toArray().length; i++) {
			afrikaWater += "<option " + "value=\"" + AfrikaWater.toArray()[i]
					+ "\"" + " selected" + ">" + AfrikaWater.toArray()[i]
					+ "</option>";
		}

		part.addString("residents", afrikaResidents);
		part.addString("vegetation", afrikaVegetation);
		part.addString("water", afrikaWater);
	}

	/**
	 * 
	 */
	protected String doHandlePost(UserSession us, Map args) {
		String tags = us.getAndSaveAsString(args, Photo.TAGS);
		String mapcode = us.getAndSaveAsString(args, "mapcode");
		String gpslocation = us.getAndSaveAsString(args, "gpslocation");
		String vegetation = us.getAndSaveAsString(args, "vegetationId");
		String residents = us.getAndSaveAsString(args, "residentsId");
		String water = us.getAndSaveAsString(args, "waterId");

		if (!StringUtil.isLegalTagsString(tags)) {
			us.setMessage(us.cfg().getInputIsInvalid());
			return PartUtil.UPLOAD_PHOTO_PAGE_NAME;
		}

		try {
			PhotoManager pm = PhotoManager.getInstance();
			String sourceFileName = us.getAsString(args, "fileName");
			File file = new File(sourceFileName);
			AfrikaPhoto photo = (AfrikaPhoto) pm.createPhoto(file);

			String targetFileName = SysConfig.getBackupDir().asString()
					+ photo.getId().asString();
			createBackup(sourceFileName, targetFileName);

			User user = (User) us.getClient();
			user.addPhoto(photo);

			photo.setTags(new Tags(tags));

			if (!mapcode.isEmpty()) {
				photo.setLocationVal(mapcode);
			} else if (!gpslocation.isEmpty()) {
				photo.setLocationVal(gpslocation);
			} else {
				photo.setLocationVal("-26.432632, 34.522164");
			}

			photo.setPopulation(residents);
			photo.setVegetation(vegetation);
			photo.setWater(water);

			pm.savePhoto(photo);

			StringBuffer sb = UserLog.createActionEntry("UploadPhoto");
			UserLog.addCreatedObject(sb, "Photo", photo.getId().asString());
			UserLog.log(sb);

			us.setTwoLineMessage(us.cfg().getPhotoUploadSucceeded(), us.cfg()
					.getKeepGoing());
		} catch (Exception ex) {
			SysLog.logThrowable(ex);
			us.setMessage(us.cfg().getPhotoUploadFailed());
		}

		return PartUtil.UPLOAD_PHOTO_PAGE_NAME;
	}

	/**
	 * 
	 */
	protected void createBackup(String sourceName, String targetName) {
		try {
			File sourceFile = new File(sourceName);
			InputStream inputStream = new FileInputStream(sourceFile);
			File targetFile = new File(targetName);
			OutputStream outputStream = new FileOutputStream(targetFile);
			// @FIXME IO.copy(inputStream, outputStream);
		} catch (Exception ex) {
			SysLog.logSysInfo("could not create backup file of photo");
			SysLog.logThrowable(ex);
		}
	}
}
