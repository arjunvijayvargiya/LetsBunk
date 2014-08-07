package com.example.letsbunk;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;



import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class Inbox extends Activity  {
	 String contact1,contact2;
	static TextView tv;
	 ListView lViewSMS;
	 ArrayAdapter adapter;
	 static final int READ_BLOCK_SIZE = 100;
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.inbox);
	        tv=(TextView) findViewById(R.id.messagebox);
             filereader1();
             filereader2();
	        lViewSMS = (ListView) findViewById(R.id.listViewSMS);

	        if(fetchInbox()!=null)
	        {
	        	adapter = new ArrayAdapter(getApplicationContext(),R.layout.row, fetchInbox());
	        	lViewSMS.setAdapter(adapter);
	        }
	      
	    }

	    public ArrayList fetchInbox()
	    {
	    	ArrayList sms = new ArrayList();

	    	Uri uriSms = Uri.parse("content://sms/inbox");
	    	Cursor cursor = getContentResolver().query(uriSms, new String[]{"_id", "address", "date", "body"},null,null,null);

	    	cursor.moveToFirst();
	    	while  (cursor.moveToNext())
	    	{
	    		   String address = cursor.getString(1);
	    		   String body = cursor.getString(3);
	    		   String date =  cursor.getString(cursor.getColumnIndex("date"));
	    		   Long timestamp = Long.parseLong(date);    
	    		   Calendar calendar = Calendar.getInstance();
	    		   calendar.setTimeInMillis(timestamp);
	    		   Date finaldate = calendar.getTime();
	    		   String smsDate = finaldate.toString();
	    		 
	    		  

	    		   System.out.println("======&gt; Mobile number =&gt; "+address);
	    		   System.out.println("=====&gt; SMS Text =&gt; "+body);
                  // Toast.makeText(getApplicationContext(), contact1,Toast.LENGTH_LONG).show();
	    		   if(address.equals(contact1))
	    		   {   
                	   sms.add("PHONE: "+ address +" MESSAGE: "+body+" DATE: "+smsDate);
	    		   }
	    		   if(address.equals(contact2))
	    		   {   
	    			   sms.add("PHONE: "+ address +" MESSAGE: "+body+" DATE: "+smsDate);
	    		   }
	    		   
                  // sms.add("Address=&gt; "+address+"n SMS =&gt; "+body);
	    	}
	    	cursor.close();
	    	return sms;
	    	

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
		    public void filereader1()
		    {
		    	//---reading from files---
		    	try
		    	{if (IsExternalStorageAvailableAndWriteable()) {
		    		//---External Storage---
		    		File extStorage =
		    		getExternalFilesDir(null);
		    		File file = new File(extStorage, "friend1.txt");
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
		    		contact1=s;
		    		}
		    		}
		    		catch (IOException ioe) {
		    		ioe.printStackTrace();
		    		}
		    }
		    public void filereader2()
		    {
		    	//---reading from files---
		    	try
		    	{if (IsExternalStorageAvailableAndWriteable()) {
		    		//---External Storage---
		    		File extStorage =
		    		getExternalFilesDir(null);
		    		File file = new File(extStorage, "friend2.txt");
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
		    		contact2=s;
		    		}
		    		}
		    		catch (IOException ioe) {
		    		ioe.printStackTrace();
		    		}
		    }
		    @Override
		    protected void onResume() {
		    	// TODO Auto-generated method stub
		    	super.onResume();
		    	if(fetchInbox()!=null)
		        { ListView lViewSMS = (ListView) findViewById(R.id.listViewSMS);
		        	ArrayAdapter adapter = new ArrayAdapter(this, R.layout.row, fetchInbox());
		        	lViewSMS.setAdapter(adapter);
		        }
		    }
		    public static void updateMessageBox(String msg)
		    {   
		    	tv.append(msg);
		    }

		   
}
