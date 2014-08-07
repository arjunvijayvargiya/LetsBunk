package com.example.letsbunk;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class percent extends Activity{
private ProgressBar progress1,progress2,progress3,progress4,progress5,progress6,progress7,progress8,progress9,progress10,progress11,progress12;
	  
	
	@Override
	   protected void onCreate(Bundle savedInstanceState) 
	{
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.percent);
	      
	      int per1,per2,per3,per4,per5,per6,per7,per8,per9,per10,per11,per12;
	      Intent i = getIntent();
	      Bundle b = i.getExtras();
	      
	     
	     /*********************FOR SUBJECT1*******************************************************/ 
	      progress1=(ProgressBar) findViewById(R.id.progressBar1);
	      String sb1=b.getString("Subject1Name");
	      if(sb1.equals(""))
	      {
	    	  progress1.setVisibility(ProgressBar.GONE);   
	      }
	      else
	      {	  
	            TextView s1=(TextView) findViewById(R.id.View1);
	            int taken1=Integer.parseInt(b.getString("sub1taken"));
	            int attended1=Integer.parseInt(b.getString("sub1attended"));
	            int sub1percentage=Integer.parseInt(b.getString("sub1percent"));
	            if(taken1==0)
	           {
	    	   s1.setText("No classes of "+sb1+" has been taken");
	    	   per1=0; progress1.setProgress(per1);
			      progress1.setMax(100);
	           }
	           else
	            { 
	        	TextView s11=(TextView) findViewById(R.id.percentView1);   
	            per1 = (attended1 * 100) / taken1;
	            progress1.setProgress(per1);
		        progress1.setMax(100);
		          if(per1<sub1percentage)
		          {
		        	  s1.setText("Short Attendence in "+sb1);	
		          }
		         else
		          {
		          s1.setText(sb1);
	              }
		         s11.setText(""+per1+"%");
	            }
	      }
		  
	     
	     
	      
	      /*********************FOR SUBJECT2*******************************************************/  
	      progress2=(ProgressBar) findViewById(R.id.progressBar2);
	      String sb2=b.getString("Subject2Name");
	      if(sb2.equals(""))
	      {
	    	  progress2.setVisibility(ProgressBar.GONE);   
	      }
	      else
	      {	  
	    	  
	            TextView s2=(TextView) findViewById(R.id.View2);
	            s2.setText(sb2);
	            int sub2percentage=Integer.parseInt(b.getString("sub2percent"));
	            int taken2=Integer.parseInt(b.getString("sub2taken"));
	            int attended2=Integer.parseInt(b.getString("sub2attended"));
	            if(taken2==0)
	           {
	    	   s2.setText("No classes of "+sb2+" has been taken");
	    	   per2=0; progress2.setProgress(per2);
			      progress2.setMax(100);
	           }
	           else
	            { 
	        	TextView s22=(TextView) findViewById(R.id.percentView2);    
	            per2 = (attended2 * 100) / taken2;
	            progress2.setProgress(per2);
		        progress2.setMax(100);
		        
		        if(per2<sub2percentage)
		          {
		        	  s2.setText("Short Attendence in "+sb2);	
		          }
		         else
		          {
		          s2.setText(sb2);
	              }
		        s22.setText(""+per2+"%");
	           }
	      }
	      
	      
	      
	      
	      
	      /*********************FOR SUBJECT3*******************************************************/  
	      progress3=(ProgressBar) findViewById(R.id.progressBar3);
	      String sb3=b.getString("Subject3Name");
	      if(sb3.equals(""))
	      {
	    	  progress3.setVisibility(ProgressBar.GONE);   
	      }
	      else
	      {	  
	            TextView s3=(TextView) findViewById(R.id.View3);
	            s3.setText(sb3);
	            int sub3percentage=Integer.parseInt(b.getString("sub3percent"));
	            int taken3=Integer.parseInt(b.getString("sub3taken"));
	            int attended3=Integer.parseInt(b.getString("sub3attended"));
	            if(taken3==0)
	           {
	    	   s3.setText("No classes of "+sb3+" has been taken");
	    	   per3=0; progress3.setProgress(per3);
			      progress3.setMax(100);
	           }
	           else
	            { 
	        	TextView s33=(TextView) findViewById(R.id.percentView3);    
	            per3 = (attended3 * 100) / taken3;
	            progress3.setProgress(per3);
		        progress3.setMax(100);
		        if(per3<sub3percentage)
		          {
		        	  s3.setText("Short Attendence in "+sb3);	
		          }
		         else
		          {
		          s3.setText(sb3);
	              }
		        s33.setText(""+per3+"%");
	           }
	      }
	      
	      
	      
	      
	      
	      /*********************FOR SUBJECT4*******************************************************/ 
	      progress4=(ProgressBar) findViewById(R.id.progressBar4);
	      String sb4=b.getString("Subject4Name");
	      if(sb4.equals(""))
	      {
	    	  progress4.setVisibility(ProgressBar.GONE);   
	      }
	      else
	      {	  
	            TextView s4=(TextView) findViewById(R.id.View4);
	            s4.setText(sb4);
	            int sub4percentage=Integer.parseInt(b.getString("sub4percent"));
	            int taken4=Integer.parseInt(b.getString("sub4taken"));
	            int attended4=Integer.parseInt(b.getString("sub4attended"));
	            if(taken4==0)
	           {
	    	   s4.setText("No classes of "+sb4+" has been taken");
	    	   per4=0; 
	    	   progress4.setProgress(per4);
			      progress4.setMax(100);
	           }
	           else
	            { 
	        	TextView s44=(TextView) findViewById(R.id.percentView4);    
	            per4 = (attended4 * 100) / taken4;
	            progress4.setProgress(per4);
		        progress4.setMax(100);
		        if(per4<sub4percentage)
		          {
		        	  s4.setText("Short Attendence in "+sb4);	
		          }
		         else
		          {
		          s4.setText(sb4);
	              }
		        s44.setText(""+per4+"%");
	           }
	      }
	      
	      
	      
	      
	      
	      /*********************FOR SUBJECT5*******************************************************/  
	      progress5=(ProgressBar) findViewById(R.id.progressBar5);
	      String sb5=b.getString("Subject5Name");
	      if(sb5.equals(""))
	      {
	    	  progress5.setVisibility(ProgressBar.GONE);   
	      }
	      else
	      {	  
	            TextView s5=(TextView) findViewById(R.id.View5);
	            s5.setText(sb5);
	            int sub5percentage=Integer.parseInt(b.getString("sub5percent"));
	            int taken5=Integer.parseInt(b.getString("sub5taken"));
	            int attended5=Integer.parseInt(b.getString("sub5attended"));
	            if(taken5==0)
	           {
	    	   s5.setText("No classes of "+sb5+" has been taken");
	    	   per5=0; progress5.setProgress(per5);
			      progress5.setMax(100);
	           }
	           else
	            { 
	        	TextView s55=(TextView) findViewById(R.id.percentView5);    
	            per5 = (attended5 * 100) / taken5;
	            progress5.setProgress(per5);
		        progress5.setMax(100);
		        if(per5<sub5percentage)
		          {
		        	  s5.setText("Short Attendence in "+sb5);	
		          }
		         else
		          {
		          s5.setText(sb5);
	              }
		        s55.setText(""+per5+"%");
	           }
	      }
	     
	      
	      
	
	      /*********************FOR SUBJECT6*******************************************************/ 
	      progress6=(ProgressBar) findViewById(R.id.progressBar6);
	      String sb6=b.getString("Subject6Name");
	      if(sb6.equals(""))
	      {
	    	  progress6.setVisibility(ProgressBar.GONE);   
	      }
	      else
	      {	  
	            TextView s6=(TextView) findViewById(R.id.View6);
	            s6.setText(sb6);
	            int sub6percentage=Integer.parseInt(b.getString("sub6percent"));
	            int taken6=Integer.parseInt(b.getString("sub6taken"));
	            int attended6=Integer.parseInt(b.getString("sub6attended"));
	            if(taken6==0)
	           {
	    	   s6.setText("No classes of "+sb6+" has been taken");
	    	   per6=0; progress6.setProgress(per6);
			      progress6.setMax(100);
	           }
	           else
	            { 
	        	TextView s66=(TextView) findViewById(R.id.percentView6);    
	            per6 = (attended6 * 100) / taken6;
	            progress6.setProgress(per6);
		        progress6.setMax(100);
		        if(per6<sub6percentage)
		          {
		        	  s6.setText("Short Attendence in "+sb6);	
		          }
		         else
		          {
		          s6.setText(sb6);
	              }
		        s66.setText(""+per6+"%");
	           }
	      }
	
	
	      
	      
	      
	      /*********************FOR SUBJECT7*******************************************************/ 
	      progress7=(ProgressBar) findViewById(R.id.progressBar7);
	      String sb7=b.getString("Subject7Name");
	      if(sb7.equals(""))
	      {
	    	  progress7.setVisibility(ProgressBar.GONE);   
	      }
	      else
	      {	  
	            TextView s7=(TextView) findViewById(R.id.View7);
	            s7.setText(sb7);
	            int sub7percentage=Integer.parseInt(b.getString("sub7percent"));
	            int taken7=Integer.parseInt(b.getString("sub7taken"));
	            int attended7=Integer.parseInt(b.getString("sub7attended"));
	            if(taken7==0)
	           {
	    	   s7.setText("No classes of "+sb7+" has been taken");
	    	   per7=0; progress7.setProgress(per7);
			      progress7.setMax(100);
	           }
	           else
	            { 
	        	TextView s77=(TextView) findViewById(R.id.percentView7);    
	            per7 = (attended7 * 100) / taken7;
	            progress7.setProgress(per7);
		        progress7.setMax(100);
		        if(per7<sub7percentage)
		          {
		        	  s7.setText("Short Attendence in "+sb7);	
		          }
		         else
		          {
		          s7.setText(sb7);
	              }
		        s77.setText(""+per7+"%");
	           }
	      }
	
	      
	      
	      
	      /*********************FOR SUBJECT8*******************************************************/ 
	      progress8=(ProgressBar) findViewById(R.id.progressBar8);
	      String sb8=b.getString("Subject8Name");
	      if(sb8.equals(""))
	      {
	    	  progress8.setVisibility(ProgressBar.GONE);   
	      }
	      else
	      {	  
	            TextView s8=(TextView) findViewById(R.id.View8);
	            s8.setText(sb8);
	            int sub8percentage=Integer.parseInt(b.getString("sub8percent"));
	            int taken8=Integer.parseInt(b.getString("sub8taken"));
	            int attended8=Integer.parseInt(b.getString("sub8attended"));
	            if(taken8==0)
	           {
	    	   s8.setText("No classes of "+sb8+" has been taken");
	    	   per8=0; progress8.setProgress(per8);
			      progress8.setMax(100);
	           }
	           else
	            { 
	        	TextView s88=(TextView) findViewById(R.id.percentView8);    
	            per8 = (attended8 * 100) / taken8;
	            progress8.setProgress(per8);
		        progress8.setMax(100);
		        if(per8<sub8percentage)
		          {
		        	  s8.setText("Short Attendence in "+sb8);	
		          }
		         else
		          {
		          s8.setText(sb8);
	              }
		        s88.setText(""+per8+"%");
	           }
	      }
	      
	      
	      
	      /*********************FOR SUBJECT9*******************************************************/ 
	      progress9=(ProgressBar) findViewById(R.id.progressBar9);
	      String sb9=b.getString("Subject9Name");
	      if(sb9.equals(""))
	      {
	    	  progress9.setVisibility(ProgressBar.GONE);   
	      }
	      else
	      {	  
	            TextView s9=(TextView) findViewById(R.id.View9);
	            s9.setText(sb9);
	            int sub9percentage=Integer.parseInt(b.getString("sub9percent"));
	            int taken9=Integer.parseInt(b.getString("sub9taken"));
	            int attended9=Integer.parseInt(b.getString("sub9attended"));
	            if(taken9==0)
	           {
	    	   s9.setText("No classes of "+sb9+" has been taken");
	    	   per9=0; progress9.setProgress(per9);
			      progress9.setMax(100);
	           }
	           else
	            { 
	        	TextView s99=(TextView) findViewById(R.id.percentView9);    
	            per9 = (attended9 * 100) / taken9;
	            progress9.setProgress(per9);
		        progress9.setMax(100);
		        if(per9<sub9percentage)
		          {
		        	  s9.setText("Short Attendence in "+sb9);	
		          }
		         else
		          {
		          s9.setText(sb9);
	              }
		        s99.setText(""+per9+"%");
	           }
	      }
	      
	      
	      
	      
	      /*********************FOR SUBJECT10*******************************************************/ 
	      progress10=(ProgressBar) findViewById(R.id.progressBar10);
	      String sb10=b.getString("Subject10Name");
	      if(sb10.equals(""))
	      {
	    	  progress10.setVisibility(ProgressBar.GONE);   
	      }
	      else
	      {	  
	            TextView s10=(TextView) findViewById(R.id.View10);
	            s10.setText(sb10);
	            int sub10percentage=Integer.parseInt(b.getString("sub10percent"));
	            int taken10=Integer.parseInt(b.getString("sub10taken"));
	            int attended10=Integer.parseInt(b.getString("sub10attended"));
	            if(taken10==0)
	           {
	    	   s10.setText("No classes of "+sb10+" has been taken");
	    	   per10=0; progress10.setProgress(per10);
			      progress10.setMax(100);
	           }
	           else
	            { 
	        	TextView s1010=(TextView) findViewById(R.id.percentView10);    
	            per10 = (attended10 * 100) / taken10;
	            progress10.setProgress(per10);
		        progress10.setMax(100);
		        if(per10<sub10percentage)
		          {
		        	  s10.setText("Short Attendence in "+sb10);	
		          }
		         else
		          {
		          s10.setText(sb10);
	              }
		        s1010.setText(""+per10+"%");
	           }
	      }
	      
	      
	      
	      
	      
	      
	      
	      /*********************FOR SUBJECT11*******************************************************/  
	      progress11=(ProgressBar) findViewById(R.id.progressBar11);
	      String sb11=b.getString("Subject11Name");
	      if(sb11.equals(""))
	      {
	    	  progress11.setVisibility(ProgressBar.GONE);   
	      }
	      else
	      {	  
	            TextView s11=(TextView) findViewById(R.id.View11);
	            s11.setText(sb11);
	            int sub11percentage=Integer.parseInt(b.getString("sub11percent"));
	            int taken11=Integer.parseInt(b.getString("sub11taken"));
	            int attended11=Integer.parseInt(b.getString("sub11attended"));
	            if(taken11==0)
	           {
	    	   s11.setText("No classes of "+sb11+" has been taken");
	    	   per11=0; progress11.setProgress(per11);
			      progress11.setMax(100);
	           }
	           else
	            { 
	        	TextView s1111=(TextView) findViewById(R.id.percentView11);    
	            per11 = (attended11 * 100) / taken11;
	            progress11.setProgress(per11);
		        progress11.setMax(100);
		        if(per11<sub11percentage)
		          {
		        	  s11.setText("Short Attendence in "+sb11);	
		          }
		         else
		          {
		          s11.setText(sb11);
	              }
		        s1111.setText(""+per11+"%");
	           }
	      }
	      
	      
	      
	      /*********************FOR SUBJECT12*******************************************************/ 
	      progress12=(ProgressBar) findViewById(R.id.progressBar12);
	      String sb12=b.getString("Subject12Name");
	      if(sb12.equals(""))
	      {
	    	  progress12.setVisibility(ProgressBar.GONE);   
	      }
	      else
	      {	  
	            TextView s12=(TextView) findViewById(R.id.View12);
	            s12.setText(sb12);
	            int sub12percentage=Integer.parseInt(b.getString("sub12percent"));
	            int taken12=Integer.parseInt(b.getString("sub12taken"));
	            int attended12=Integer.parseInt(b.getString("sub12attended"));
	            if(taken12==0)
	           {
	    	   s12.setText("No classes of "+sb12+" has been taken");
	    	   per12=0; progress12.setProgress(per12);
			      progress12.setMax(100);
	           }
	           else
	            { 
	        	TextView s1212=(TextView) findViewById(R.id.percentView12);    
	            per12 = (attended12 * 100) / taken12;
	            progress12.setProgress(per12);
		        progress12.setMax(100);
		        if(per12<sub12percentage)
		          {
		        	  s12.setText("Short Attendence in "+sb12);	
		          }
		         else
		          {
		          s12.setText(sb12);
	              }
		        s1212.setText(""+per12+"%");
	           }
	      }
	      
	}
}
