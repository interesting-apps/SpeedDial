package com.apps.interestingapps.speeddial.common;

public class SpeedDialConstants {

	/*
	 * The request code to pick contacts
	 */
	public static final int PICK_CONTACT_REQUEST = 1;
	
	public static final String CONTACT_TABLE = "speed_dial_contact";
	public static final String ID_COLUMN = "_id";
	public static final String NAME_COLUMN = "NAME";
	public static final String SPEED_DIAL_NUMBER_COLUMN = "SPEED_DIAL_NUMBER";
	public static final String PHONE_NUMBER_COLUMN = "PHONE_NUMBER";
	public static final String DATABASE_NAME = "speed_dial_database_3.db";
	public static final int DATABASE_VERSION = 20;
	public static final String DB_PATH = "/data/data/com.apps.interestingapps.speeddial/databases/";
	public static final String PREFERENCES_FILE_NAME = "preferences";
	public static final String APP_PACKAGE = "com.apps.interestingapps.speeddial";
	public static final String WIDGET_APP_PACKAGE = "com.apps.interestingapps.speeddialwidget";
	public static final String AUTHORITY = "com.apps.interestingapps.speeddial.contentprovider";
	public static final String CONTENT_PROVIDER_BASE_PATH = "SpeedDialContacts";

}
