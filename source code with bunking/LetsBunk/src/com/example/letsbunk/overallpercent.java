package com.example.letsbunk;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class overallpercent extends Activity {
	 int percent;
	   int attended1=0,attended2=0,attended3=0,attended4=0,attended5=0,attended6=0,attended7=0,attended8=0,attended9=0,attended10=0,attended11=0,attended12=0;
	   int taken1=0,taken2=0,taken3=0,taken4=0,taken5=0,taken6=0,taken7=0,taken8=0,taken9=0,taken10=0,taken11=0,taken12=0;
	   Intent i;
	   private ProgressBar progress1;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			 setContentView(R.layout.overallpercent);
			i = getIntent();
		    Bundle b = i.getExtras();
			 TextView tv1=(TextView) findViewById(R.id.View1);
			 TextView tv2=(TextView) findViewById(R.id.View2);
		    if(!b.getString("Subject1Name").equals(""))
		    {	taken1=Integer.parseInt(b.getString("sub1taken"));
	        attended1=Integer.parseInt(b.getString("sub1attended"));}
		    if(!b.getString("Subject2Name").equals(""))
		    {
	        taken2=Integer.parseInt(b.getString("sub2taken"));
	        attended2=Integer.parseInt(b.getString("sub2attended"));}
		    
		    if(!b.getString("Subject3Name").equals(""))
		    {
	        taken3=Integer.parseInt(b.getString("sub3taken"));
	        attended3=Integer.parseInt(b.getString("sub3attended"));
		    }
		    
		    if(!b.getString("Subject4Name").equals(""))
		    {
	        taken4=Integer.parseInt(b.getString("sub4taken"));
	        attended4=Integer.parseInt(b.getString("sub4attended"));
		    }
		    
		    if(!b.getString("Subject5Name").equals(""))
		     {
		    taken5=Integer.parseInt(b.getString("sub5taken"));
	        attended5=Integer.parseInt(b.getString("sub5attended"));
		     }
		    
		    if(!b.getString("Subject6Name").equals(""))
		    {
	        taken6=Integer.parseInt(b.getString("sub6taken"));
	        attended6=Integer.parseInt(b.getString("sub6attended"));
		    }
		    
		    if(!b.getString("Subject7Name").equals(""))
	        {
		    	taken7=Integer.parseInt(b.getString("sub7taken"));
	            attended7=Integer.parseInt(b.getString("sub7attended"));
	        }
		    
		    if(!b.getString("Subject8Name").equals(""))
	        {
		    	taken8=Integer.parseInt(b.getString("sub8taken"));
	            attended8=Integer.parseInt(b.getString("sub8attended"));
	        }
	        
	        if(!b.getString("Subject9Name").equals(""))
	        { taken9=Integer.parseInt(b.getString("sub9taken"));
	        attended9=Integer.parseInt(b.getString("sub9attended"));
	        }
	        
	        if(!b.getString("Subject10Name").equals(""))
	        {	
	        taken10=Integer.parseInt(b.getString("sub10taken"));
	        attended10=Integer.parseInt(b.getString("sub10attended"));
	        }
	        
	        if(!b.getString("Subject11Name").equals(""))
	        {
	        	taken11=Integer.parseInt(b.getString("sub11taken"));
	        attended11=Integer.parseInt(b.getString("sub11attended"));
	        }
	        
	        if(!b.getString("Subject12Name").equals(""))
	        {
	        taken12=Integer.parseInt(b.getString("sub12taken"));
	        attended12=Integer.parseInt(b.getString("sub12attended"));
	        }
	        if((taken1+taken2+taken3+taken4+taken5+taken6+taken7+taken8+taken9+taken10+taken11+taken12)==0)
	        {
	          tv1.setText("No classes has been taken");
	          percent=0;
	        }
	        else
	        {
	        progress1=(ProgressBar) findViewById(R.id.progressBar1);	
	        percent=(attended1+attended2+attended3+attended4+attended5+attended6+attended7+attended8+attended9+attended10+attended11+attended12);
	        percent=(percent*100)/(taken1+taken2+taken3+taken4+taken5+taken6+taken7+taken8+taken9+taken10+taken11+taken12);
	        progress1.setProgress(percent);
		    progress1.setMax(100);
		    tv2.setText(""+percent+"%");
	        }
		}
}
