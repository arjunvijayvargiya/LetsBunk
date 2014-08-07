package com.example.letsbunk;



import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.Toast;
public class TimeTable extends Activity {
	TextView sub1text1,sub1text2,sub1text3,sub1text4;
	TextView sub2text1,sub2text2,sub2text3,sub2text4;
	TextView sub3text1,sub3text2,sub3text3,sub3text4;
	TextView sub4text1,sub4text2,sub4text3,sub4text4;
	
	TextView sub5text1,sub5text2,sub5text3,sub5text4;
	TextView sub6text1,sub6text2,sub6text3,sub6text4;
	TextView sub7text1,sub7text2,sub7text3,sub7text4;
	TextView sub8text1,sub8text2,sub8text3,sub8text4;
	
	TextView sub9text1,sub9text2,sub9text3,sub9text4;
	TextView sub10text1,sub10text2,sub10text3,sub10text4;
	TextView sub11text1,sub11text2,sub11text3,sub11text4;
	TextView sub12text1,sub12text2,sub12text3,sub12text4;

	public static final String MyPREFERENCES = "MyPrefs" ;
	
	 public static final String Subject1text1 = "s1t1";
	 public static final String Subject1text2 = "s1t2"; 
	 public static final String Subject1text3 = "s1t3"; 
	 public static final String Subject1text4 = "s1t4"; 
	 
	 public static final String Subject2text1 = "s2t1"; 
	 public static final String Subject2text2 = "s2t2"; 
	 public static final String Subject2text3 = "s2t3"; 
	 public static final String Subject2text4 = "s2t4"; 
	 
	 public static final String Subject3text1 = "s3t1"; 
	 public static final String Subject3text2 = "s3t2"; 
	 public static final String Subject3text3 = "s3t3"; 
	 public static final String Subject3text4 = "s3t4";
	 
	 public static final String Subject4text1 = "s4t1"; 
	 public static final String Subject4text2 = "s4t2"; 
	 public static final String Subject4text3 = "s4t3"; 
	 public static final String Subject4text4 = "s4t4"; 
	 
	 public static final String Subject5text1 = "s5t1"; 
	 public static final String Subject5text2 = "s5t2"; 
	 public static final String Subject5text3 = "s5t3"; 
	 public static final String Subject5text4 = "s5t4"; 
	 
	 public static final String Subject6text1 = "s6t1"; 
	 public static final String Subject6text2 = "s6t2"; 
	 public static final String Subject6text3 = "s6t3"; 
	 public static final String Subject6text4 = "s6t4"; 
	 
	 public static final String Subject7text1 = "s7t1"; 
	 public static final String Subject7text2 = "s7t2"; 
	 public static final String Subject7text3 = "s7t3"; 
	 public static final String Subject7text4 = "s7t4"; 
	 
	 public static final String Subject8text1 = "s8t1"; 
	 public static final String Subject8text2 = "s8t2"; 
	 public static final String Subject8text3 = "s8t3"; 
	 public static final String Subject8text4 = "s8t4"; 
	 
	 public static final String Subject9text1 = "s9t1"; 
	 public static final String Subject9text2 = "s9t2"; 
	 public static final String Subject9text3 = "s9t3"; 
	 public static final String Subject9text4 = "s9t4"; 
	 
	 public static final String Subject10text1 = "s10t1"; 
	 public static final String Subject10text2 = "s10t2"; 
	 public static final String Subject10text3 = "s10t3"; 
	 public static final String Subject10text4 = "s10t4"; 
	 
	 public static final String Subject11text1 = "s11t1"; 
	 public static final String Subject11text2 = "s11t2"; 
	 public static final String Subject11text3 = "s11t3"; 
	 public static final String Subject11text4 = "s11t4"; 
	 
	 public static final String Subject12text1 = "s12t1"; 
	 public static final String Subject12text2 = "s12t2"; 
	 public static final String Subject12text3 = "s12t3"; 
	 public static final String Subject12text4 = "s12t4"; 
	 
	 SharedPreferences sharedpreferences;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.timetable);
	
		      sub1text1=(TextView) findViewById(R.id.sub1Text1);
			 sub1text2=(TextView) findViewById(R.id.sub1text2);
		       sub1text3=(TextView) findViewById(R.id.sub1text3);
			sub1text4=(TextView) findViewById(R.id.sub1text4);
			  sub2text1=(TextView) findViewById(R.id.sub2Text1);
			  sub2text2=(TextView) findViewById(R.id.sub2text2);
			    sub2text3=(TextView) findViewById(R.id.sub2text3);
			    sub2text4=(TextView) findViewById(R.id.sub2text4);
			    sub3text1=(TextView) findViewById(R.id.sub3Text1);
			    sub3text2=(TextView) findViewById(R.id.sub3text2);
			    sub3text3=(TextView) findViewById(R.id.sub3text3);
			    sub3text4=(TextView) findViewById(R.id.sub3text4);
			    sub4text1=(TextView) findViewById(R.id.sub4Text1);
			    sub4text2=(TextView) findViewById(R.id.sub4text2);
			    sub4text3=(TextView) findViewById(R.id.sub4text3);
			    sub4text4=(TextView) findViewById(R.id.sub4text4);
			    sub5text1=(TextView) findViewById(R.id.sub5Text1);
			    sub5text2=(TextView) findViewById(R.id.sub5text2);
			    sub5text3=(TextView) findViewById(R.id.sub5text3);
			    sub5text4=(TextView) findViewById(R.id.sub5text4);
			    sub6text1=(TextView) findViewById(R.id.sub6Text1);
			    sub6text2=(TextView) findViewById(R.id.sub6text2);
			    sub6text3=(TextView) findViewById(R.id.sub6text3);
			    sub6text4=(TextView) findViewById(R.id.sub6text4);
			    sub7text1=(TextView) findViewById(R.id.sub7Text1);
			    sub7text2=(TextView) findViewById(R.id.sub7text2);
			    sub7text3=(TextView) findViewById(R.id.sub7text3);
			    sub7text4=(TextView) findViewById(R.id.sub7text4);
			    sub8text1=(TextView) findViewById(R.id.sub8Text1);
			    sub8text2=(TextView) findViewById(R.id.sub8text2);
			    sub8text3=(TextView) findViewById(R.id.sub8text3);
			    sub8text4=(TextView) findViewById(R.id.sub8text4);
			    sub9text1=(TextView) findViewById(R.id.sub9Text1);
			    sub9text2=(TextView) findViewById(R.id.sub9text2);
			    sub9text3=(TextView) findViewById(R.id.sub9text3);
			    sub9text4=(TextView) findViewById(R.id.sub9text4);
			    sub10text1=(TextView) findViewById(R.id.sub10Text1);
			    sub10text2=(TextView) findViewById(R.id.sub10text2);
			    sub10text3=(TextView) findViewById(R.id.sub10text3);
			    sub10text4=(TextView) findViewById(R.id.sub10text4);
			    sub11text1=(TextView) findViewById(R.id.sub11Text1);
			    sub11text2=(TextView) findViewById(R.id.sub11text2);
			    sub11text3=(TextView) findViewById(R.id.sub11text3);
			    sub11text4=(TextView) findViewById(R.id.sub11text4);
			    sub12text1=(TextView) findViewById(R.id.sub12Text1);
			    sub12text2=(TextView) findViewById(R.id.sub12text2);
			    sub12text3=(TextView) findViewById(R.id.sub12text3);
			    sub12text4=(TextView) findViewById(R.id.sub12text4);
		
			    
			  
		sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		

	      if (sharedpreferences.contains(Subject1text1))
	      {
	         sub1text1.setText(sharedpreferences.getString(Subject1text1, ""));

	      }
	      if (sharedpreferences.contains(Subject1text2))
	      {
	         sub1text2.setText(sharedpreferences.getString(Subject1text2, ""));

	      }
	      if (sharedpreferences.contains(Subject1text3))
	      {
	         sub1text3.setText(sharedpreferences.getString(Subject1text3, ""));

	      }
	      if (sharedpreferences.contains(Subject1text4))
	      {
	         sub1text4.setText(sharedpreferences.getString(Subject1text4, ""));

	      }
	      
	      
	      
	 

           if (sharedpreferences.contains(Subject2text1))
	      {
	         sub2text1.setText(sharedpreferences.getString(Subject2text1, ""));

	      }
	      if (sharedpreferences.contains(Subject2text2))
	      {
	         sub2text2.setText(sharedpreferences.getString(Subject2text2, ""));

	      }
	      if (sharedpreferences.contains(Subject2text3))
	      {
	         sub2text3.setText(sharedpreferences.getString(Subject2text3, ""));

	      }
	      if (sharedpreferences.contains(Subject2text4))
	      {
	         sub2text4.setText(sharedpreferences.getString(Subject2text4, ""));

	      }
	      

	      
	      if (sharedpreferences.contains(Subject3text1))
	      {
	         sub3text1.setText(sharedpreferences.getString(Subject3text1, ""));

	      }
	      if (sharedpreferences.contains(Subject3text2))
	      {
	         sub3text2.setText(sharedpreferences.getString(Subject3text2, ""));

	      }
	      if (sharedpreferences.contains(Subject3text3))
	      {
	         sub3text3.setText(sharedpreferences.getString(Subject3text3, ""));

	      }
	      if (sharedpreferences.contains(Subject3text4))
	      {
	         sub3text4.setText(sharedpreferences.getString(Subject3text4, ""));

	      }
	      
	      
	      if (sharedpreferences.contains(Subject4text1))
	      {
	         sub4text1.setText(sharedpreferences.getString(Subject4text1, ""));

	      }
	      if (sharedpreferences.contains(Subject4text2))
	      {
	         sub4text2.setText(sharedpreferences.getString(Subject4text2, ""));

	      }
	      if (sharedpreferences.contains(Subject4text3))
	      {
	         sub4text3.setText(sharedpreferences.getString(Subject4text3, ""));

	      }
	      if (sharedpreferences.contains(Subject4text4))
	      {
	         sub4text4.setText(sharedpreferences.getString(Subject4text4, ""));

	      }
	      
	      
	      if (sharedpreferences.contains(Subject5text1))
	      {
	         sub5text1.setText(sharedpreferences.getString(Subject5text1, ""));

	      }
	      if (sharedpreferences.contains(Subject5text2))
	      {
	         sub5text2.setText(sharedpreferences.getString(Subject5text2, ""));

	      }
	      if (sharedpreferences.contains(Subject5text3))
	      {
	         sub5text3.setText(sharedpreferences.getString(Subject5text3, ""));

	      }
	      if (sharedpreferences.contains(Subject5text4))
	      {
	         sub5text4.setText(sharedpreferences.getString(Subject5text4, ""));

	      }
	      
	      
	      
	      if (sharedpreferences.contains(Subject6text1))
	      {
	         sub6text1.setText(sharedpreferences.getString(Subject6text1, ""));

	      }
	      if (sharedpreferences.contains(Subject6text2))
	      {
	         sub6text2.setText(sharedpreferences.getString(Subject6text2, ""));

	      }
	      if (sharedpreferences.contains(Subject6text3))
	      {
	         sub6text3.setText(sharedpreferences.getString(Subject6text3, ""));

	      }
	      if (sharedpreferences.contains(Subject6text4))
	      {
	         sub6text4.setText(sharedpreferences.getString(Subject6text4, ""));

	      }
	      
	      
	      if (sharedpreferences.contains(Subject7text1))
	      {
	         sub7text1.setText(sharedpreferences.getString(Subject7text1, ""));

	      }
	      if (sharedpreferences.contains(Subject7text2))
	      {
	         sub7text2.setText(sharedpreferences.getString(Subject7text2, ""));

	      }
	      if (sharedpreferences.contains(Subject7text3))
	      {
	         sub7text3.setText(sharedpreferences.getString(Subject7text3, ""));

	      }
	      if (sharedpreferences.contains(Subject7text4))
	      {
	         sub7text4.setText(sharedpreferences.getString(Subject7text4, ""));

	      }
	      
	      
	      
	      if (sharedpreferences.contains(Subject8text1))
	      {
	         sub8text1.setText(sharedpreferences.getString(Subject8text1, ""));

	      }
	      if (sharedpreferences.contains(Subject8text2))
	      {
	         sub8text2.setText(sharedpreferences.getString(Subject8text2, ""));

	      }
	      if (sharedpreferences.contains(Subject8text3))
	      {
	         sub8text3.setText(sharedpreferences.getString(Subject8text3, ""));

	      }
	      if (sharedpreferences.contains(Subject8text4))
	      {
	         sub8text4.setText(sharedpreferences.getString(Subject8text4, ""));

	      }

	      
	      
	      if (sharedpreferences.contains(Subject9text1))
	      {
	         sub9text1.setText(sharedpreferences.getString(Subject9text1, ""));

	      }
	      if (sharedpreferences.contains(Subject9text2))
	      {
	         sub9text2.setText(sharedpreferences.getString(Subject9text2, ""));

	      }
	      if (sharedpreferences.contains(Subject9text3))
	      {
	         sub9text3.setText(sharedpreferences.getString(Subject9text3, ""));

	      }
	      if (sharedpreferences.contains(Subject9text4))
	      {
	         sub9text4.setText(sharedpreferences.getString(Subject9text4, ""));

	      }
	      
	      
	      
	      if (sharedpreferences.contains(Subject10text1))
	      {
	         sub10text1.setText(sharedpreferences.getString(Subject10text1, ""));

	      }
	      if (sharedpreferences.contains(Subject10text2))
	      {
	         sub10text2.setText(sharedpreferences.getString(Subject10text2, ""));

	      }
	      if (sharedpreferences.contains(Subject10text3))
	      {
	         sub10text3.setText(sharedpreferences.getString(Subject10text3, ""));

	      }
	      if (sharedpreferences.contains(Subject10text4))
	      {
	         sub10text4.setText(sharedpreferences.getString(Subject10text4, ""));

	      }
	      
	      
	      
	      
	      if (sharedpreferences.contains(Subject11text1))
	      {
	         sub11text1.setText(sharedpreferences.getString(Subject11text1, ""));

	      }
	      if (sharedpreferences.contains(Subject11text2))
	      {
	         sub11text2.setText(sharedpreferences.getString(Subject11text2, ""));

	      }
	      if (sharedpreferences.contains(Subject11text3))
	      {
	         sub11text3.setText(sharedpreferences.getString(Subject11text3, ""));

	      }
	      if (sharedpreferences.contains(Subject11text4))
	      {
	         sub11text4.setText(sharedpreferences.getString(Subject11text4, ""));

	      }
	      
	      
	      
	      
	      if (sharedpreferences.contains(Subject12text1))
	      {
	         sub12text1.setText(sharedpreferences.getString(Subject12text1, ""));

	      }
	      if (sharedpreferences.contains(Subject12text2))
	      {
	         sub12text2.setText(sharedpreferences.getString(Subject12text2, ""));

	      }
	      if (sharedpreferences.contains(Subject12text3))
	      {
	         sub12text3.setText(sharedpreferences.getString(Subject12text3, ""));

	      }
	      if (sharedpreferences.contains(Subject12text4))
	      {
	         sub12text4.setText(sharedpreferences.getString(Subject12text4, ""));

	      }
	}
		
	
	public void showtoast(View ClickedButton)
	{
		
		
			

	    String Sub1text1=sub1text1.getText().toString().trim();
	 	String Sub1text2=sub1text2.getText().toString();
	  String Sub1text3=sub1text3.getText().toString().trim();
	 	String Sub1text4=sub1text4.getText().toString().trim();
	 	String Sub2text1=sub2text1.getText().toString().trim();
	   String Sub2text2=sub2text2.getText().toString();
		String Sub2text3=sub2text3.getText().toString().trim();
		String Sub2text4=sub2text4.getText().toString().trim();
		String Sub3text1=sub3text1.getText().toString().trim();
		String Sub3text2=sub3text2.getText().toString().trim();
		String Sub3text3=sub3text3.getText().toString().trim();
		String Sub3text4=sub3text4.getText().toString().trim();
		String Sub4text1=sub4text1.getText().toString().trim();
		String Sub4text2=sub4text2.getText().toString().trim();
		String Sub4text3=sub4text3.getText().toString().trim();
		String Sub4text4=sub4text4.getText().toString().trim();
		String Sub5text1=sub5text1.getText().toString().trim();
		String Sub5text2=sub5text2.getText().toString().trim();
		String Sub5text3=sub5text3.getText().toString().trim();
		String Sub5text4=sub5text4.getText().toString().trim();
		String Sub6text1=sub6text1.getText().toString().trim();
		String Sub6text2=sub6text2.getText().toString().trim();
		String Sub6text3=sub6text3.getText().toString().trim();
		String Sub6text4=sub6text4.getText().toString().trim();
		String Sub7text1=sub7text1.getText().toString().trim();
		String Sub7text2=sub7text2.getText().toString().trim();
		String Sub7text3=sub7text3.getText().toString().trim();
		String Sub7text4=sub7text4.getText().toString().trim();
		String Sub8text1=sub8text1.getText().toString().trim();
		String Sub8text2=sub8text2.getText().toString().trim();
		String Sub8text3=sub8text3.getText().toString().trim();
		String Sub8text4=sub8text4.getText().toString().trim();
		String Sub9text1=sub9text1.getText().toString().trim();
		String Sub9text2=sub9text2.getText().toString().trim();
		String Sub9text3=sub9text3.getText().toString().trim();
		String Sub9text4=sub9text4.getText().toString().trim();
		String Sub10text1=sub10text1.getText().toString().trim();
		String Sub10text2=sub10text2.getText().toString().trim();
		String Sub10text3=sub10text3.getText().toString().trim();
		String Sub10text4=sub10text4.getText().toString().trim();
		String Sub11text1=sub11text1.getText().toString().trim();
		String Sub11text2=sub11text2.getText().toString().trim();
		String Sub11text3=sub11text3.getText().toString().trim();
		String Sub11text4=sub11text4.getText().toString().trim();
		String Sub12text1=sub12text1.getText().toString().trim();
		String Sub12text2=sub12text2.getText().toString().trim();
		String Sub12text3=sub12text3.getText().toString().trim();
		String Sub12text4=sub12text4.getText().toString().trim();
	
		
		
		 String msg="";
		    	String st="",line="";
		    	int c=0;
		    	if(!Sub1text1.equals("") && (Sub1text2.equals("")||Sub1text3.equals("")||Sub1text4.equals("")))
		    	{	msg="Empty entries are not allowed for subject1"; c++; }
		    	
		    	
		    	else if(!Sub2text1.equals("")&&(Sub2text2.equals("")||Sub2text3.equals("")||Sub2text4.equals("")))
		    	{	msg="Empty entries are not allowed for subject2";  c++;}

		    	else if(!Sub3text1.equals("")&&(Sub3text2.equals("")||Sub3text3.equals("")||Sub3text4.equals("")))
		    	{ msg="Empty entries are not allowed for subject3";  c++;  }
		    	
		    	else if(!Sub4text1.equals("")&&(Sub4text2.equals("")||Sub4text3.equals("")||Sub4text4.equals("")))
		    	{	msg="Empty entries are not allowed for subject4"; c++; }
		    	
		    	else if(!Sub5text1.equals("")&&(Sub5text2.equals("")||Sub5text3.equals("")||Sub5text4.equals("")))
		    	{	msg="Empty entries are not allowed for subject5"; c++; }
		    	
		    	else if(!Sub6text1.equals("")&&(Sub6text2.equals("")||Sub6text3.equals("")||Sub6text4.equals("")))
		    	{	msg="Empty entries are not allowed for subject6";  c++;}
		    	
		    	else if(!Sub7text1.equals("")&&(Sub7text2.equals("")||Sub7text3.equals("")||Sub7text4.equals("")))
		    	{	msg="Empty entries are not allowed for subject7"; c++; }
		    	
		    	else if(!Sub8text1.equals("")&&(Sub8text2.equals("")||Sub8text3.equals("")||Sub8text4.equals("")))
		    	{	msg="Empty entries are not allowed for subject8"; c++; }
		    	
		    	else if(!Sub9text1.equals("")&&(Sub9text2.equals("")||Sub9text3.equals("")||Sub9text4.equals("")))
		    	{	msg="Empty entries are not allowed for subject9"; c++; }
		    
		    	
		    	else if(!Sub10text1.equals("")&&(Sub10text2.equals("")||Sub10text3.equals("")||Sub10text4.equals("")))
		    	{	msg="Empty entries are not allowed for subject10"; c++; }
		    	
		    	else if(!Sub11text1.equals("")&&(Sub11text2.equals("")||Sub11text3.equals("")||Sub11text4.equals("")))
		    	{	msg="Empty entries are not allowed for subject11"; c++; }
		    	
		    	else if(!Sub12text1.equals("")&&(Sub12text2.equals("")||Sub12text3.equals("")||Sub12text4.equals("")))
		    	{	msg="Empty entries are not allowed for subject12";  c++; }
		    	
		    	if(c>0)
		    	{ 
		    	Toast Message1=Toast.makeText(this,msg,Toast.LENGTH_LONG);
		    	 Message1.show();
		    	} 
		    	else
		    	{
		    		
		    	Editor editor = sharedpreferences.edit();
		    	 
		    	 editor.putString(Subject1text1, Sub1text1);
		         editor.putString(Subject1text2, Sub1text2);
		        editor.putString(Subject1text3, Sub1text3);
		         editor.putString(Subject1text4, Sub1text4);
		        
		         editor.putString(Subject2text1, Sub2text1);
		         editor.putString(Subject2text2, Sub2text2);
		         editor.putString(Subject2text3, Sub2text3);
		         editor.putString(Subject2text4, Sub2text4);
		         
		         editor.putString(Subject3text1, Sub3text1);
		         editor.putString(Subject3text2, Sub3text2);
		         editor.putString(Subject3text3, Sub3text3);
		         editor.putString(Subject3text4, Sub3text4);
		         
		         editor.putString(Subject4text1, Sub4text1);
		         editor.putString(Subject4text2, Sub4text2);
		         editor.putString(Subject4text3, Sub4text3);
		         editor.putString(Subject4text4, Sub4text4);
		         
		         editor.putString(Subject5text1, Sub5text1);
		         editor.putString(Subject5text2, Sub5text2);
		         editor.putString(Subject5text3, Sub5text3);
		         editor.putString(Subject5text4, Sub5text4);
		         
		         editor.putString(Subject6text1, Sub6text1);
		         editor.putString(Subject6text2, Sub6text2);
		         editor.putString(Subject6text3, Sub6text3);
		         editor.putString(Subject6text4, Sub6text4);
		         
		         editor.putString(Subject7text1, Sub7text1);
		         editor.putString(Subject7text2, Sub7text2);
		         editor.putString(Subject7text3, Sub7text3);
		         editor.putString(Subject7text4, Sub7text4);
		         
		         editor.putString(Subject8text1, Sub8text1);
		         editor.putString(Subject8text2, Sub8text2);
		         editor.putString(Subject8text3, Sub8text3);
		         editor.putString(Subject8text4, Sub8text4);
		         
		         editor.putString(Subject9text1, Sub9text1);
		         editor.putString(Subject9text2, Sub9text2);
		         editor.putString(Subject9text3, Sub9text3);
		         editor.putString(Subject9text4, Sub9text4);
		         
		         editor.putString(Subject10text1, Sub10text1);
		         editor.putString(Subject10text2, Sub10text2);
		         editor.putString(Subject10text3, Sub10text3);
		         editor.putString(Subject10text4, Sub10text4);
		         
		         editor.putString(Subject11text1, Sub11text1);
		         editor.putString(Subject11text2, Sub11text2);
		         editor.putString(Subject11text3, Sub11text3);
		         editor.putString(Subject11text4, Sub11text4);
		         
		         editor.putString(Subject12text1, Sub12text1);
		         editor.putString(Subject12text2, Sub12text2);
		         editor.putString(Subject12text3, Sub12text3);
		         editor.putString(Subject12text4, Sub12text4);
		         
		         editor.commit(); 
		         Toast Message1=Toast.makeText(this,"Submitted Successfully",Toast.LENGTH_LONG);
		    	 Message1.show();
		    	}
		     
	}
	
	
	public void showpercent(View v)
	{
		

	    String Sub1text1=sub1text1.getText().toString().trim();
	 	String Sub1text2=sub1text2.getText().toString().trim();
	  String Sub1text3=sub1text3.getText().toString().trim();
	 	String Sub1text4=sub1text4.getText().toString().trim();
	 	String Sub2text1=sub2text1.getText().toString().trim();
	   String Sub2text2=sub2text2.getText().toString().trim();
		String Sub2text3=sub2text3.getText().toString().trim();
		String Sub2text4=sub2text4.getText().toString().trim();
		String Sub3text1=sub3text1.getText().toString().trim();
		String Sub3text2=sub3text2.getText().toString().trim();
		String Sub3text3=sub3text3.getText().toString().trim();
		String Sub3text4=sub3text4.getText().toString().trim();
		String Sub4text1=sub4text1.getText().toString().trim();
		String Sub4text2=sub4text2.getText().toString().trim();
		String Sub4text3=sub4text3.getText().toString().trim();
		String Sub4text4=sub4text4.getText().toString().trim();
		String Sub5text1=sub5text1.getText().toString().trim();
		String Sub5text2=sub5text2.getText().toString().trim();
		String Sub5text3=sub5text3.getText().toString().trim();
		String Sub5text4=sub5text4.getText().toString().trim();
		String Sub6text1=sub6text1.getText().toString().trim();
		String Sub6text2=sub6text2.getText().toString().trim();
		String Sub6text3=sub6text3.getText().toString().trim();
		String Sub6text4=sub6text4.getText().toString().trim();
		String Sub7text1=sub7text1.getText().toString().trim();
		String Sub7text2=sub7text2.getText().toString().trim();
		String Sub7text3=sub7text3.getText().toString().trim();
		String Sub7text4=sub7text4.getText().toString().trim();
		String Sub8text1=sub8text1.getText().toString().trim();
		String Sub8text2=sub8text2.getText().toString().trim();
		String Sub8text3=sub8text3.getText().toString().trim();
		String Sub8text4=sub8text4.getText().toString().trim();
		String Sub9text1=sub9text1.getText().toString().trim();
		String Sub9text2=sub9text2.getText().toString().trim();
		String Sub9text3=sub9text3.getText().toString().trim();
		String Sub9text4=sub9text4.getText().toString().trim();
		String Sub10text1=sub10text1.getText().toString().trim();
		String Sub10text2=sub10text2.getText().toString().trim();
		String Sub10text3=sub10text3.getText().toString().trim();
		String Sub10text4=sub10text4.getText().toString().trim();
		String Sub11text1=sub11text1.getText().toString().trim();
		String Sub11text2=sub11text2.getText().toString().trim();
		String Sub11text3=sub11text3.getText().toString().trim();
		String Sub11text4=sub11text4.getText().toString().trim();
		String Sub12text1=sub12text1.getText().toString().trim();
		String Sub12text2=sub12text2.getText().toString().trim();
		String Sub12text3=sub12text3.getText().toString().trim();
		String Sub12text4=sub12text4.getText().toString().trim();

		
		 String msg="";
	    	String st="",line="";
	    	int c=0;
	    	if(!Sub1text1.equals("") && (Sub1text2.equals("")||Sub1text3.equals("")||Sub1text4.equals("")))
	    	{	msg="Empty entries are not allowed for subject1"; c++; }
	    	
	    	
	    	else if(!Sub2text1.equals("")&&(Sub2text2.equals("")||Sub2text3.equals("")||Sub2text4.equals("")))
	    	{	msg="Empty entries are not allowed for subject2";  c++;}

	    	else if(!Sub3text1.equals("")&&(Sub3text2.equals("")||Sub3text3.equals("")||Sub3text4.equals("")))
	    	{ msg="Empty entries are not allowed for subject3";  c++;  }
	    	
	    	else if(!Sub4text1.equals("")&&(Sub4text2.equals("")||Sub4text3.equals("")||Sub4text4.equals("")))
	    	{	msg="Empty entries are not allowed for subject4"; c++; }
	    	
	    	else if(!Sub5text1.equals("")&&(Sub5text2.equals("")||Sub5text3.equals("")||Sub5text4.equals("")))
	    	{	msg="Empty entries are not allowed for subject5"; c++; }
	    	
	    	else if(!Sub6text1.equals("")&&(Sub6text2.equals("")||Sub6text3.equals("")||Sub6text4.equals("")))
	    	{	msg="Empty entries are not allowed for subject6";  c++;}
	    	
	    	else if(!Sub7text1.equals("")&&(Sub7text2.equals("")||Sub7text3.equals("")||Sub7text4.equals("")))
	    	{	msg="Empty entries are not allowed for subject7"; c++; }
	    	
	    	else if(!Sub8text1.equals("")&&(Sub8text2.equals("")||Sub8text3.equals("")||Sub8text4.equals("")))
	    	{	msg="Empty entries are not allowed for subject8"; c++; }
	    	
	    	else if(!Sub9text1.equals("")&&(Sub9text2.equals("")||Sub9text3.equals("")||Sub9text4.equals("")))
	    	{	msg="Empty entries are not allowed for subject9"; c++; }
	    
	    	
	    	else if(!Sub10text1.equals("")&&(Sub10text2.equals("")||Sub10text3.equals("")||Sub10text4.equals("")))
	    	{	msg="Empty entries are not allowed for subject10"; c++; }
	    	
	    	else if(!Sub11text1.equals("")&&(Sub11text2.equals("")||Sub11text3.equals("")||Sub11text4.equals("")))
	    	{	msg="Empty entries are not allowed for subject11"; c++; }
	    	
	    	else if(!Sub12text1.equals("")&&(Sub12text2.equals("")||Sub12text3.equals("")||Sub12text4.equals("")))
	    	{	msg="Empty entries are not allowed for subject12";  c++; }
	    	
	    	if(c>0)
	    	{ 
	    	Toast Message1=Toast.makeText(this,msg,Toast.LENGTH_LONG);
	    	 Message1.show();
	    	} 
	    	else
	    	{
	    		
	    	Editor editor = sharedpreferences.edit();
	    	 
	    	 editor.putString(Subject1text1, Sub1text1);
	         editor.putString(Subject1text2, Sub1text2);
	        editor.putString(Subject1text3, Sub1text3);
	         editor.putString(Subject1text4, Sub1text4);
	        
	         editor.putString(Subject2text1, Sub2text1);
	         editor.putString(Subject2text2, Sub2text2);
	         editor.putString(Subject2text3, Sub2text3);
	         editor.putString(Subject2text4, Sub2text4);
	         
	         editor.putString(Subject3text1, Sub3text1);
	         editor.putString(Subject3text2, Sub3text2);
	         editor.putString(Subject3text3, Sub3text3);
	         editor.putString(Subject3text4, Sub3text4);
	         
	         editor.putString(Subject4text1, Sub4text1);
	         editor.putString(Subject4text2, Sub4text2);
	         editor.putString(Subject4text3, Sub4text3);
	         editor.putString(Subject4text4, Sub4text4);
	         
	         editor.putString(Subject5text1, Sub5text1);
	         editor.putString(Subject5text2, Sub5text2);
	         editor.putString(Subject5text3, Sub5text3);
	         editor.putString(Subject5text4, Sub5text4);
	         
	         editor.putString(Subject6text1, Sub6text1);
	         editor.putString(Subject6text2, Sub6text2);
	         editor.putString(Subject6text3, Sub6text3);
	         editor.putString(Subject6text4, Sub6text4);
	         
	         editor.putString(Subject7text1, Sub7text1);
	         editor.putString(Subject7text2, Sub7text2);
	         editor.putString(Subject7text3, Sub7text3);
	         editor.putString(Subject7text4, Sub7text4);
	         
	         editor.putString(Subject8text1, Sub8text1);
	         editor.putString(Subject8text2, Sub8text2);
	         editor.putString(Subject8text3, Sub8text3);
	         editor.putString(Subject8text4, Sub8text4);
	         
	         editor.putString(Subject9text1, Sub9text1);
	         editor.putString(Subject9text2, Sub9text2);
	         editor.putString(Subject9text3, Sub9text3);
	         editor.putString(Subject9text4, Sub9text4);
	         
	         editor.putString(Subject10text1, Sub10text1);
	         editor.putString(Subject10text2, Sub10text2);
	         editor.putString(Subject10text3, Sub10text3);
	         editor.putString(Subject10text4, Sub10text4);
	         
	         editor.putString(Subject11text1, Sub11text1);
	         editor.putString(Subject11text2, Sub11text2);
	         editor.putString(Subject11text3, Sub11text3);
	         editor.putString(Subject11text4, Sub11text4);
	         
	         editor.putString(Subject12text1, Sub12text1);
	         editor.putString(Subject12text2, Sub12text2);
	         editor.putString(Subject12text3, Sub12text3);
	         editor.putString(Subject12text4, Sub12text4);
	         
	         editor.commit(); 
		
		
		Intent t=new Intent(TimeTable.this,percentlist.class);
		 t.putExtra("Subject1Name",Sub1text1);
		 if(!Sub1text2.equals(""))
		 t.putExtra("sub1taken",Sub1text2);
		 else
	     t.putExtra("sub1taken","0");
		 if(!Sub1text3.equals(""))
			 t.putExtra("sub1attended",Sub1text3);
			 else
		     t.putExtra("sub1attended","0");
		 if(!Sub1text4.equals(""))
			 t.putExtra("sub1percent",Sub1text4);
			 else
		     t.putExtra("sub1percent","0");
		 
		
		 
		 t.putExtra("Subject2Name",Sub2text1);
	     if(!Sub2text2.equals(""))
	     t.putExtra("sub2taken",Sub2text2);
	     else
	     t.putExtra("sub2taken","0");
	     if(!Sub2text3.equals(""))
			 t.putExtra("sub2attended",Sub2text3);
			 else
		     t.putExtra("sub2attended","0");
	     if(!Sub2text4.equals(""))
			 t.putExtra("sub2percent",Sub2text4);
			 else
		     t.putExtra("sub2percent","0");
	     
	     
	     t.putExtra("Subject3Name",Sub3text1);
	     if(!Sub3text2.equals(""))
	     t.putExtra("sub3taken",Sub3text2);
	     else
	     t.putExtra("sub3taken","0");
	     if(!Sub3text3.equals(""))
			 t.putExtra("sub3attended",Sub3text3);
			 else
		     t.putExtra("sub3attended","0");
	     if(!Sub3text4.equals(""))
			 t.putExtra("sub3percent",Sub3text4);
			 else
		     t.putExtra("sub3percent","0");
	     
	     
	     t.putExtra("Subject4Name",Sub4text1);
	     if(!Sub4text2.equals(""))
	     t.putExtra("sub4taken",Sub4text2);
	     else
	     t.putExtra("sub4taken","0");
	     if(!Sub4text3.equals(""))
			 t.putExtra("sub4attended",Sub4text3);
			 else
		     t.putExtra("sub4attended","0");
	     if(!Sub4text4.equals(""))
			 t.putExtra("sub4percent",Sub4text4);
			 else
		     t.putExtra("sub4percent","0");
	     
	     
	     t.putExtra("Subject5Name",Sub5text1);
	     if(!Sub5text2.equals(""))
	     t.putExtra("sub5taken",Sub5text2);
	     else
	     t.putExtra("sub5taken","0");
	     if(!Sub5text3.equals(""))
			 t.putExtra("sub5attended",Sub5text3);
			 else
		     t.putExtra("sub5attended","0");
	     if(!Sub5text4.equals(""))
			 t.putExtra("sub5percent",Sub5text4);
			 else
		     t.putExtra("sub5percent","0");
	     
	     
	     t.putExtra("Subject6Name",Sub6text1);
	     if(!Sub6text2.equals(""))
	     t.putExtra("sub6taken",Sub6text2);
	     else
	     t.putExtra("sub6taken","0");
	     if(!Sub6text3.equals(""))
			 t.putExtra("sub6attended",Sub6text3);
			 else
		     t.putExtra("sub6attended","0");
	     if(!Sub6text4.equals(""))
			 t.putExtra("sub6percent",Sub6text4);
			 else
		     t.putExtra("sub6percent","0");
	     
	     
	     t.putExtra("Subject7Name",Sub7text1);
	     if(!Sub7text2.equals(""))
	     t.putExtra("sub7taken",Sub7text2);
	     else
	     t.putExtra("sub7taken","0");
	     if(!Sub7text3.equals(""))
			 t.putExtra("sub7attended",Sub7text3);
			 else
		     t.putExtra("sub7attended","0");
	     if(!Sub7text4.equals(""))
			 t.putExtra("sub7percent",Sub7text4);
			 else
		     t.putExtra("sub7percent","0");
	     
	     
	     t.putExtra("Subject8Name",Sub8text1);
	     if(!Sub8text2.equals(""))
	     t.putExtra("sub8taken",Sub8text2);
	     else
	     t.putExtra("sub8taken","0");
	     if(!Sub8text3.equals(""))
			 t.putExtra("sub8attended",Sub8text3);
			 else
		     t.putExtra("sub8attended","0");
	     if(!Sub8text4.equals(""))
			 t.putExtra("sub8percent",Sub8text4);
			 else
		     t.putExtra("sub8percent","0");
	     
	     
	     t.putExtra("Subject9Name",Sub9text1);
	     if(!Sub9text2.equals(""))
	     t.putExtra("sub9taken",Sub9text2);
	     else
	     t.putExtra("sub9taken","0");
	     if(!Sub9text3.equals(""))
			 t.putExtra("sub9attended",Sub9text3);
			 else
		     t.putExtra("sub9attended","0");
	     if(!Sub9text4.equals(""))
			 t.putExtra("sub9percent",Sub9text4);
			 else
		     t.putExtra("sub9percent","0");
	     
	     
	     t.putExtra("Subject10Name",Sub10text1);
	     if(!Sub10text2.equals(""))
	     t.putExtra("sub10taken",Sub10text2);
	     else
	     t.putExtra("sub10taken","0");
	     if(!Sub10text3.equals(""))
			 t.putExtra("sub10attended",Sub10text3);
			 else
		     t.putExtra("sub10attended","0");
	     if(!Sub10text4.equals(""))
			 t.putExtra("sub10percent",Sub10text4);
			 else
		     t.putExtra("sub10percent","0");
	     
	     
	     t.putExtra("Subject11Name",Sub11text1);
	     if(!Sub11text2.equals(""))
	     t.putExtra("sub11taken",Sub11text2);
	     else
	     t.putExtra("sub11taken","0");
	     if(!Sub11text3.equals(""))
			 t.putExtra("sub11attended",Sub11text3);
			 else
		     t.putExtra("sub11attended","0");
	     if(!Sub11text4.equals(""))
			 t.putExtra("sub11percent",Sub11text4);
			 else
		     t.putExtra("sub11percent","0");
	     
	     t.putExtra("Subject12Name",Sub12text1);
	     if(!Sub12text2.equals(""))
	     t.putExtra("sub12taken",Sub12text2);
	     else
	     t.putExtra("sub12taken","0");
	     if(!Sub12text3.equals(""))
			 t.putExtra("sub12attended",Sub12text3);
			 else
		     t.putExtra("sub12attended","0");
	     if(!Sub12text4.equals(""))
			 t.putExtra("sub12percent",Sub12text4);
			 else
		     t.putExtra("sub12percent","0");
	     
	     startActivity(t);
	    	}
	}

		// TODO Auto-generated method stub
	


@Override
public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
}

}
