package com.dy.anotherapp;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
	Intent serviceIntent;
    //利用显示意图启动其他应用的服务
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		serviceIntent = new Intent();
		//设置组建名字，指明被启动的程序的包名+被启动的服务类的名字（最好全路径）
		serviceIntent.setComponent(new ComponentName("com.dy.startservicefromanother", "com.dy.startservicefromanother.AppService"));
		findViewById(R.id.btn_startService).setOnClickListener(this);
		findViewById(R.id.btn_stopService).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.btn_startService:
				//设置组建名字，指明被启动的程序的包名+被启动的服务类的名字（最好全路径）
				startService(serviceIntent);
				break;
			case R.id.btn_stopService:
				stopService(serviceIntent);
				break;
		}

	}
}
