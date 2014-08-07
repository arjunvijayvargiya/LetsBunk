package com.example.letsbunk;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class Dashboard extends TabActivity {
	static final int READ_BLOCK_SIZE = 100;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.dashboard);
	//filereadin();
	   Resources res = getResources(); // Resource object to get Drawables
       TabHost tabHost = getTabHost();  // The activity TabHost
       TabHost.TabSpec spec;  // Resusable TabSpec for each tab
       Intent intent;  // Reusable Intent for each tab

       // Creating an Intent to launch an Activity for the tab (to be reused)
       intent = new Intent().setClass(this, Homedash.class);
       // Initializing a TabSpec for each tab and adding it to the TabHost
       spec = tabHost.newTabSpec("Home").setIndicator("Home",res.getDrawable(R.drawable.homeb)).setContent(intent);
       tabHost.addTab(spec);
       
       intent = new Intent().setClass(this, Friends.class);
       // Initializing a TabSpec for each tab and adding it to the TabHost
       spec = tabHost.newTabSpec("Home").setIndicator("Friends",res.getDrawable(R.drawable.friendsb)).setContent(intent);
       tabHost.addTab(spec);
       
       intent = new Intent().setClass(this, TimeTable.class);
       // Initializing a TabSpec for each tab and adding it to the TabHost
       spec = tabHost.newTabSpec("Percentage").setIndicator("Peracentage",res.getDrawable(R.drawable.percentageb)).setContent(intent);
       tabHost.addTab(spec);
       
       intent = new Intent().setClass(this, Inbox.class);
       // Initializing a TabSpec for each tab and adding it to the TabHost
       spec = tabHost.newTabSpec("Inbox").setIndicator("Inbox",res.getDrawable(R.drawable.mail)).setContent(intent);
       tabHost.addTab(spec);
       
       intent = new Intent().setClass(this, Timetableshowcase.class);
       // Initializing a TabSpec for each tab and adding it to the TabHost
       spec = tabHost.newTabSpec("Timetable").setIndicator("Timetable",res.getDrawable(R.drawable.calender)).setContent(intent);
       tabHost.addTab(spec);
       
       
       

       
       
       
  tabHost.setCurrentTab(0);
	
	
}
	
	private void filereadin() {
		// TODO Auto-generated method stub
		//---reading from files---
		try
		{if (IsExternalStorageAvailableAndWriteable()) {
			//---External Storage---
			File extStorage =
			getExternalFilesDir(null);
			File file = new File(extStorage, "name.txt");
			FileInputStream fIn = new FileInputStream(file);
			InputStreamReader isr = new
			InputStreamReader(fIn);
			char[] inputBuffer = new char[READ_BLOCK_SIZE];
			String s = "";
			int charRead;
			while ((charRead = isr.read(inputBuffer))>0)
			{
			//---convert the chars to a String---
			String readString =
			String.copyValueOf(inputBuffer, 0,
			charRead);
			s += readString;
			inputBuffer = new char[READ_BLOCK_SIZE];
			}
			isr.close();
			Toast.makeText(getBaseContext(),
		        s,
			Toast.LENGTH_LONG).show();
			}
			}
			catch (IOException ioe) {
			ioe.printStackTrace();
			}
		

	}
	public boolean IsExternalStorageAvailableAndWriteable() {
		boolean externalStorageAvailable = false;
		boolean externalStorageWriteable = false;
		String state = Environment.getExternalStorageState();
		if (Environment.MEDIA_MOUNTED.equals(state)) {
		//---you can read and write the media---
		externalStorageAvailable = externalStorageWriteable = true;
		} else if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
		//---you can only read the media---
		externalStorageAvailable = true;
		externalStorageWriteable = false;
		} else {
		//---you cannot read nor write the media---
		externalStorageAvailable = externalStorageWriteable = false;
		}
		return externalStorageAvailable && externalStorageWriteable;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
