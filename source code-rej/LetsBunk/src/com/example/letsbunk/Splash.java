package com.example.letsbunk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;

public class Splash extends Activity {
	private static int SPLASH_TIME_OUT = 3000;
	static final int READ_BLOCK_SIZE = 100; 
	String status="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        filereader();
        new Handler().postDelayed(new Runnable() {
 
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */
 
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
            	if(status.equals("1"))
            	{ Intent i = new Intent(Splash.this, Dashboard.class);
                startActivity(i);
                 finish();
            	}
            	else
            	   { Intent i = new Intent(Splash.this, MainActivity.class);
                   startActivity(i);
                   finish();
            	}
            	
            }
        }, SPLASH_TIME_OUT);
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

public void filereader()
{
	//---reading from files---
	try
	{if (IsExternalStorageAvailableAndWriteable()) {
		//---External Storage---
		File extStorage =
		getExternalFilesDir(null);
		File file = new File(extStorage, "status.txt");
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
		status=s;
		}
		}
		catch (IOException ioe) {
		ioe.printStackTrace();
		}
}
}
