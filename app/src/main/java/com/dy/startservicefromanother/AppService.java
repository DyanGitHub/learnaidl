package com.dy.startservicefromanother;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * 作者： Dyan on 2016/8/15 11:03
 * 描述：
 */
public class AppService extends Service {
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		Log.d("dy", " AppService start");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d("dy", " AppService stop");
	}
}
