package com.example.letsbunk;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Homedash extends Activity {
ImageView b1,b2;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
    setContentView(R.layout.homedash);
    b1=(ImageView) findViewById(R.id.imagesettings);
    b1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i=new Intent(Homedash.this,Settings.class);
			startActivity(i);
		}
	});
    b2=(ImageView) findViewById(R.id.imagetimbi);
    b2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			try{
				PackageManager pm = getPackageManager();
			
			Intent intent = pm.getLaunchIntentForPackage("com.gabrielittner.timetable");
			startActivity(intent);
			overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out);
			}catch(Exception e)
			{
				Intent i = new Intent(android.content.Intent.ACTION_VIEW);
				i.setData(Uri.parse(
				"market://details?id=com.gabrielittner.timetable&hl=en"));
				startActivity(i);
				overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out);
			}
		}
	});
    
}

}
