package com.apps.interestingapps.speeddial;

import java.util.Arrays;
import java.util.HashSet;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;

import com.apps.interestingapps.speeddial.common.DatabaseHelper;
import com.apps.interestingapps.speeddial.common.SpeedDialConstants;

public class SpeedDialContentProvider extends ContentProvider {

	private DatabaseHelper databaseHelper;

	private static final Uri CONTENT_URI = Uri.parse("content://"
			+ SpeedDialConstants.AUTHORITY + "/"
			+ SpeedDialConstants.CONTENT_PROVIDER_BASE_PATH);

	public static final String CONTENT_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE
			+ "/speedDialContatcts";
	public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE
			+ "/speedDialContatct";

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getType(Uri uri) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean onCreate() {
		databaseHelper = DatabaseHelper.getInstance(getContext());
		return false;
	}

	@Override
	public Cursor query(Uri uri,
			String[] projection,
			String selection,
			String[] selectionArgs,
			String sortOrder) {

		SQLiteQueryBuilder queryBuilder = new SQLiteQueryBuilder();
		checkColumns(projection);

		queryBuilder.setTables(SpeedDialConstants.CONTACT_TABLE);

		SQLiteDatabase db = databaseHelper.getWritableDatabase();
		Cursor cursor = queryBuilder.query(db, projection, selection,
				selectionArgs, null, null, sortOrder);
		// Make sure that potential listeners are getting notified
		cursor.setNotificationUri(getContext().getContentResolver(), uri);
		return cursor;
	}

	@Override
	public int update(Uri uri,
			ContentValues values,
			String selection,
			String[] selectionArgs) {
		throw new UnsupportedOperationException();
	}

	private void checkColumns(String[] projection) {
		String[] available = { SpeedDialConstants.ID_COLUMN,
				SpeedDialConstants.NAME_COLUMN,
				SpeedDialConstants.PHONE_NUMBER_COLUMN,
				SpeedDialConstants.SPEED_DIAL_NUMBER_COLUMN };
		if (projection != null) {
			HashSet<String> requestedColumns = new HashSet<String>(Arrays
					.asList(projection));
			HashSet<String> availableColumns = new HashSet<String>(Arrays
					.asList(available));
			// Check if all columns which are requested are available
			if (!availableColumns.containsAll(requestedColumns)) {
				throw new IllegalArgumentException("Unknown columns in projection");
			}
		}
	}
}
