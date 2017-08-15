package com.senssun.www.mymathtransfordemo001;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import static android.content.Context.MODE_PRIVATE;


public class AppsLocalConfig {/***SharedPreferences***/

	public static final int INTEGER_TYPE = 1;
	public static final int BOOLEAN_TYPE = 2;
	public static final int FLOAT_TYPE = 3;
	public static final int LONG_TYPE = 4;
	public static final int STRING_TYPE = 5;


	public static Object readConfig(Context context, String fileName,
			String key, Object defValue, int valueType) {
		SharedPreferences preferences = context.getSharedPreferences(fileName,
				MODE_PRIVATE);
		Object result = null;
		switch (valueType) {
			case INTEGER_TYPE: {
				result = preferences.getInt(key, (Integer) defValue);
				break;
			}
			case BOOLEAN_TYPE: {
				result = preferences.getBoolean(key, (Boolean) defValue);
				break;
			}
			case FLOAT_TYPE: {
				result = preferences.getFloat(key, (Float) defValue);
				break;
			}
			case LONG_TYPE: {
				result = preferences.getLong(key, (Long) defValue);
				break;
			}
			case STRING_TYPE: {
				result = preferences.getString(key, (String) defValue);
				break;
			}
		}
		return result;
	}
	
//	AppsLocalConfig.saveConfig(mContext, "loginFile",
//            "memberId", memberId,
//            AppsLocalConfig.STRING_TYPE, true);
	public static void saveConfig(Context context, String fileName, String key,
			Object value, int valueType, boolean isCommit) {
		SharedPreferences preferences = context.getSharedPreferences(fileName,
				MODE_PRIVATE);
		Editor editor = preferences.edit();
		switch (valueType) {
			case INTEGER_TYPE: {
				editor.putInt(key, (Integer) value);
				break;
			}
			case BOOLEAN_TYPE: {
				editor.putBoolean(key, (Boolean) value);
				break;
			}
			case FLOAT_TYPE: {
				editor.putFloat(key, (Float) value);
				break;
			}
			case LONG_TYPE: {
				editor.putLong(key, (Long) value);
				break;
			}
			case STRING_TYPE: {
				editor.putString(key, (String) value);
				break;
			}
		}
		if(isCommit)
			editor.commit();
	}
	
	public static void saveConfig(Context context, String fileName, String key,
			Object value, int valueType, boolean useDefValue,Object defValue) {
		SharedPreferences preferences = context.getSharedPreferences(fileName,
				MODE_PRIVATE);
		Editor editor = preferences.edit();
		switch (valueType) {
			case INTEGER_TYPE: {	
				if(useDefValue)
					editor.putInt(key, (Integer) value);
				else
					editor.putInt(key, (Integer)defValue);
				break;
			}
			case BOOLEAN_TYPE: {
				if(useDefValue)
					editor.putBoolean(key, (Boolean) value);
				else
					editor.putBoolean(key, (Boolean) defValue);
				
				break;
			}
			case FLOAT_TYPE: {
				if(useDefValue)
					editor.putFloat(key, (Float) value);
				else
					editor.putFloat(key, (Float) defValue);
				break;
			}
			case LONG_TYPE: {
				if(useDefValue)
					editor.putLong(key, (Long) value);
				else
					editor.putLong(key, (Long) defValue);
				break;
			}
			case STRING_TYPE: {
				if(useDefValue)
					editor.putString(key, (String) value);
				else
					editor.putString(key, (String) defValue);
				break;
			}
		}
		editor.commit();
	}
}
