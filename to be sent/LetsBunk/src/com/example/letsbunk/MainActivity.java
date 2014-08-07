package com.example.letsbunk;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {
Button b,tt,breq;
EditText etname,etphn,etrnm;
String name,phone,rollnum;
static final int READ_BLOCK_SIZE = 100;
String status;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b=(Button) findViewById(R.id.btnRegister);
		tt=(Button) findViewById(R.id.btntimetable);
		breq=(Button) findViewById(R.id.btnreq);
		etname=(EditText) findViewById(R.id.registerName);
		etphn=(EditText) findViewById(R.id.registerEmail);
		etrnm=(EditText) findViewById(R.id.registerPassword);
	     
		
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//name=etname.getText().toString();
				//phone=etname.getText().toString();
				//rollnum=etname.getText().toString();
				Filewriting();
				if((etname.getText().toString()).equals(""))
				{
					Toast.makeText(getApplicationContext(),"Please Add Name", Toast.LENGTH_LONG).show();
					
				}
				else if((etphn.getText().toString()).equals(""))
				{
					Toast.makeText(getApplicationContext(),"Please Add Phone Number", Toast.LENGTH_LONG).show();
				}
				else if((etrnm.getText().toString()).equals(""))
				{
					Toast.makeText(getApplicationContext(),"Please Add roll No", Toast.LENGTH_LONG).show();
				}
				
				else
					 {
					 Filewritingstatus();
					Intent i=new Intent(MainActivity.this,Dashboard.class);
			          startActivity(i);
			          overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
			          //slide from right to left
			          //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
					}
				
				
				
			}
		});
tt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//name=etname.getText().toString();
				//phone=etname.getText().toString();
				//rollnum=etname.getText().toString();
				Intent i=new Intent(MainActivity.this,Timetableshowcase.class);
				startActivity(i);
				overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
				
			}
		});
breq.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//name=etname.getText().toString();
		//phone=etname.getText().toString();
		
			Intent i=new Intent(MainActivity.this,TimeTable.class);
	          startActivity(i);
	          overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
			
		
	}
});
      
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
private void Filewriting()
	//---writing to files---
	{try
	{
	if (IsExternalStorageAvailableAndWriteable()) {
	//---external Storage---
	File extStorage =
	getExternalFilesDir(null);
	File file = new File(extStorage, "name.txt");
	FileOutputStream fOut = new
	FileOutputStream(file);
	OutputStreamWriter osw = new
	OutputStreamWriter(fOut);
	//---write the string to the file---
	name=etname.getText().toString();
	osw.write(name);
	osw.flush();
	osw.close();
	//---display file saved message---
	
	}
	}
	catch (IOException ioe)
	{
	ioe.printStackTrace();
	}
	}
private void Filewritingstatus()
//---writing to files---
{try
{
if (IsExternalStorageAvailableAndWriteable()) {
//---external Storage---
File extStorage =
getExternalFilesDir(null);
File file = new File(extStorage, "status.txt");
FileOutputStream fOut = new
FileOutputStream(file);
OutputStreamWriter osw = new
OutputStreamWriter(fOut);
//---write the string to the file---
status="1";
osw.write(status);
osw.flush();
osw.close();
//---display file saved message---

}
}
catch (IOException ioe)
{
ioe.printStackTrace();
}
}
}


