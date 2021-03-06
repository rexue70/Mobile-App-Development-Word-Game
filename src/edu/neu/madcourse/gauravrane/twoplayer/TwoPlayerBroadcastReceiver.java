package edu.neu.madcourse.gauravrane.twoplayer;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;

public class TwoPlayerBroadcastReceiver extends WakefulBroadcastReceiver{
	static final String TAG = "TwoPlayer";
	
	public void onReceive(Context context, Intent intent){
		 ComponentName comp = new ComponentName(context.getPackageName(),
	                TwoPlayerBroadcastService.class.getName());
	        
	     // Start the service, keeping the device awake while it is launching.
	     startWakefulService(context, (intent.setComponent(comp)));
	     setResultCode(Activity.RESULT_OK);
	}
}
