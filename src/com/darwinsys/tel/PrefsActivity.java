package com.darwinsys.tel;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

public class PrefsActivity extends PreferenceActivity {

		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        addPreferencesFromResource(R.xml.prefs);
		}
		
		public static boolean isEnabled(Context context) {
			return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("enabled", true);
		}
}
