package com.darwinsys.tel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ALDSRedirector extends BroadcastReceiver {
	final static String DIAL_PAUSE = ",,";
    @Override
    public void onReceive(Context context, Intent intent) {
    	if (!PrefsActivity.isEnabled(context)) {
    		return;
    	}
        final String oldNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
        ALDSSite site = null;
        if ((site = findNearbySite()) == null) {
        	Toast.makeText(context, "No ALDS in range", 1).show();
        	return;
        }
        String newNumber = site.getLocalNumber();
        this.setResultData(newNumber);
        String msg = 
        	"Redirecting outgoing call to " + oldNumber + " via " + site.getLocationName();
        Toast.makeText(context, msg, 1).show();
    }

	private ALDSSite findNearbySite() {
		// Get rough location from GPS Tower Provider
		for (ALDSSite s : ALDSSite.values()) {
			// geometry calculations needed
		}
		return null;
	}

}