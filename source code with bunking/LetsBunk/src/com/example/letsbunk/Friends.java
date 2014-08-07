package com.example.letsbunk;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;





import android.app.Activity;
import android.app.ListActivity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract;
import android.widget.SimpleCursorAdapter;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Friends extends Activity {
	Button f1ad,f1al,f2ad,f2al,f1bunkee,f2bunkee;

	SimpleCursorAdapter adapter;

	static final int READ_BLOCK_SIZE = 100;
	TextView tv1,tv2;
	private static final String TAG = Friends.class.getSimpleName();
	private static final int REQUEST_CODE_PICK_CONTACTS = 1;
	private Uri uriContact;
	private String contactID;
	String contactNumber1,contactNumber2;
	public static final String MyPREFERENCES = "MyPrefs" ;
	SharedPreferences sharedpreferences;
	String contactName1,contactName2;
	int select;
	String sendersname;




	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.friends);
		filereader();
		
		tv1=(TextView) findViewById(R.id.fr1);
	f1ad=(Button) findViewById(R.id.f1add);
	f1al=(Button) findViewById(R.id.f1ale);
	tv2=(TextView) findViewById(R.id.fr2);
	f2ad=(Button) findViewById(R.id.f2add);
	f2al=(Button) findViewById(R.id.f2ale);
	f1bunkee=(Button) findViewById(R.id.f1bunkee);
	f2bunkee=(Button) findViewById(R.id.f2bunkee);

	sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);


	if (sharedpreferences.contains("contactnum1"))
	{
	   tv1.setText(sharedpreferences.getString("contactnum1", ""));

	}
	if (sharedpreferences.contains("contactnum2"))
	{
	   tv2.setText(sharedpreferences.getString("contactnum2", ""));

	}
	if (sharedpreferences.contains("cn1"))
	{
	   contactNumber1=sharedpreferences.getString("cn1", "");

	}
	if (sharedpreferences.contains("cn2"))
	{
	 contactNumber2=sharedpreferences.getString("cn2", "");

	}

	f1al.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			try
			{SmsManager sms = SmsManager.getDefault();
			sms.sendTextMessage(contactNumber1, null,sendersname+"has alerted you",
			null, null);
			Toast.makeText(getApplicationContext(), "alerted Successfully",Toast.LENGTH_LONG).show();
			}catch(Exception e)
			{
				Toast.makeText(getApplicationContext(), "Please select a contact",Toast.LENGTH_LONG).show();
			}
		}
	});
f1bunkee.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			try
			{SmsManager sms = SmsManager.getDefault();
			sms.sendTextMessage(contactNumber1, null,sendersname+"is bunking today",
			null, null);
			Toast.makeText(getApplicationContext(), "bunked Successfully",Toast.LENGTH_LONG).show();
			}catch(Exception e)
			{
				Toast.makeText(getApplicationContext(), "Please select a contact",Toast.LENGTH_LONG).show();
			}
		}
	});
f2bunkee.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		try
		{SmsManager sms = SmsManager.getDefault();
		sms.sendTextMessage(contactNumber2, null,sendersname+"is bunking today",
		null, null);
		Toast.makeText(getApplicationContext(), "bunked Successfully",Toast.LENGTH_LONG).show();
		}catch(Exception e)
		{
			Toast.makeText(getApplicationContext(), "Please select a contact",Toast.LENGTH_LONG).show();
		}
		}
});
	f1ad.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		     select=1;
			startActivityForResult(new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI), REQUEST_CODE_PICK_CONTACTS);
		}
	});
	f2al.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			try
			{SmsManager sms = SmsManager.getDefault();
			sms.sendTextMessage(contactNumber2, null,sendersname+"has alerted you",
			null, null);
			Toast.makeText(getApplicationContext(), "alerted Successfully",Toast.LENGTH_LONG).show();
			}catch(Exception e)
			{
				Toast.makeText(getApplicationContext(), "Please select a contact",Toast.LENGTH_LONG).show();
			}
			}
	});
	f2ad.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		    select=2;
			startActivityForResult(new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI), REQUEST_CODE_PICK_CONTACTS);
		}
	});
		
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    super.onActivityResult(requestCode, resultCode, data);

	    if (requestCode == REQUEST_CODE_PICK_CONTACTS && resultCode == RESULT_OK) {
	        Log.d(TAG, "Response: " + data.toString());
	        uriContact = data.getData();

	        retrieveContactName();
	        retrieveContactNumber();
	        //retrieveContactPhoto();

	    }
	}
	private void retrieveContactNumber() {
		 
	    

	    // getting contacts ID
	    Cursor cursorID = getContentResolver().query(uriContact,
	            new String[]{ContactsContract.Contacts._ID},
	            null, null, null);

	    if (cursorID.moveToFirst()) {

	        contactID = cursorID.getString(cursorID.getColumnIndex(ContactsContract.Contacts._ID));
	    }

	    cursorID.close();

	    Log.d(TAG, "Contact ID: " + contactID);

	    // Using the contact ID now we will get contact phone number
	    Cursor cursorPhone = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
	            new String[]{ContactsContract.CommonDataKinds.Phone.NUMBER},

	            ContactsContract.CommonDataKinds.Phone.CONTACT_ID + " = ? AND " +
	                    ContactsContract.CommonDataKinds.Phone.TYPE + " = " +
	                    ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE,

	            new String[]{contactID},
	            null);

	    if (cursorPhone.moveToFirst()) {
	        Editor low=sharedpreferences.edit();
	    	if(select==1)
	    	{
	    		contactNumber1=cursorPhone.getString(cursorPhone.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
	    		Filewriting1(); 
	    		low.putString("cn1",contactNumber1);
	    	     low.commit();
	    	
	    	}
	        else if(select==2)		
	           {
	        	contactNumber2=cursorPhone.getString(cursorPhone.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
	        	Filewriting2(); 
	        	low.putString("cn2",contactNumber2);
	   	        low.commit();
	           
	           }
	    }

	    cursorPhone.close();

	    //Log.d(TAG, "Contact Phone Number: " + contactNumber);
	   // Toast.makeText(getApplicationContext(), contactNumber,Toast.LENGTH_LONG).show();
	}

	private void retrieveContactName() {

	    

	    // querying contact data store
	    Cursor cursor = getContentResolver().query(uriContact, null, null, null, null);

	    if (cursor.moveToFirst()) {
	    	Editor editor = sharedpreferences.edit();
	        // DISPLAY_NAME = The display name for the contact.
	        // HAS_PHONE_NUMBER =   An indicator of whether this contact has at least one phone number.
	       if(select==1)
	         {
	    	   contactName1 = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
	    	   tv1.setText(contactName1);
	    	   
	    		 
	    		 editor.putString("contactnum1",contactName1);
	    	     editor.commit();
	         }
	       else if(select==2)
	    	   {
	    	   contactName2 = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
	    	   tv2.setText(contactName2);
	    	  
	  		 
	  		 editor.putString("contactnum2",contactName2);
	  	     editor.commit();
	    	   }
	    }

	    cursor.close();


	   
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
			sendersname=s;
			}
			}
			catch (IOException ioe) {
			ioe.printStackTrace();
			}
	}
	private void Filewriting1()
	//---writing to files---
	{try
	{
	if (IsExternalStorageAvailableAndWriteable()) {
	//---external Storage---
	File extStorage =
	getExternalFilesDir(null);
	File file = new File(extStorage, "friend1.txt");
	FileOutputStream fOut = new
	FileOutputStream(file);
	OutputStreamWriter osw = new
	OutputStreamWriter(fOut);
	//---write the string to the file---

	osw.write(contactNumber1);
	//Toast.makeText(getApplicationContext(), contactNumber1, Toast.LENGTH_LONG).show();
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
	private void Filewriting2()
	//---writing to files---
	{try
	{
	if (IsExternalStorageAvailableAndWriteable()) {
	//---external Storage---
	File extStorage =
	getExternalFilesDir(null);
	File file = new File(extStorage, "friend2.txt");
	FileOutputStream fOut = new
	FileOutputStream(file);
	OutputStreamWriter osw = new
	OutputStreamWriter(fOut);
	//---write the string to the file---

	osw.write(contactNumber2);
	//Toast.makeText(getApplicationContext(), contactNumber2, Toast.LENGTH_LONG).show();
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

