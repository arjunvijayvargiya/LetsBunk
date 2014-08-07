package com.example.letsbunk;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;



public class percentlist extends Activity{

	@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.percentlist);
    
    ListView lv=(ListView) findViewById(R.id.listView1);
    
    String[] val=new String[]
    		{"Subject wise attendance","Overall attendance"};
    ArrayAdapter<String> adapt=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,val);
 lv.setAdapter(adapt);
 lv.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int pos,
				long id) {
			switch(pos)
			{
			case 0:
				/****************************Subject Wise****************************************/
				 Intent i1 = getIntent();
				 Bundle b1 = i1.getExtras();
				 Intent a1 = new Intent(percentlist.this,percent.class);
			      
			      a1.putExtra("Subject1Name",b1.getString("Subject1Name")); 
			      a1.putExtra("Subject2Name",b1.getString("Subject2Name"));
			      a1.putExtra("Subject3Name",b1.getString("Subject3Name")); 
			      a1.putExtra("Subject4Name",b1.getString("Subject4Name"));
			      a1.putExtra("Subject5Name",b1.getString("Subject5Name")); 
			      a1.putExtra("Subject6Name",b1.getString("Subject6Name"));
			      a1.putExtra("Subject7Name",b1.getString("Subject7Name")); 
			      a1.putExtra("Subject8Name",b1.getString("Subject8Name"));
			      a1.putExtra("Subject9Name",b1.getString("Subject9Name")); 
			      a1.putExtra("Subject10Name",b1.getString("Subject10Name"));
			      a1.putExtra("Subject11Name",b1.getString("Subject11Name")); 
			      a1.putExtra("Subject12Name",b1.getString("Subject12Name"));
			      
			      a1.putExtra("sub1taken",b1.getString("sub1taken"));
			      a1.putExtra("sub2taken",b1.getString("sub2taken"));
			      a1.putExtra("sub3taken",b1.getString("sub3taken"));
			      a1.putExtra("sub4taken",b1.getString("sub4taken"));
			      a1.putExtra("sub5taken",b1.getString("sub5taken"));
			      a1.putExtra("sub6taken",b1.getString("sub6taken"));
			      a1.putExtra("sub7taken",b1.getString("sub7taken"));
			      a1.putExtra("sub8taken",b1.getString("sub8taken"));
			      a1.putExtra("sub9taken",b1.getString("sub9taken"));
			      a1.putExtra("sub10taken",b1.getString("sub10taken"));
			      a1.putExtra("sub11taken",b1.getString("sub11taken"));
			      a1.putExtra("sub12taken",b1.getString("sub12taken"));
			      
			      a1.putExtra("sub1attended",b1.getString("sub1attended"));
			      a1.putExtra("sub2attended",b1.getString("sub2attended"));
			      a1.putExtra("sub3attended",b1.getString("sub3attended"));
			      a1.putExtra("sub4attended",b1.getString("sub4attended"));
			      a1.putExtra("sub5attended",b1.getString("sub5attended"));
			      a1.putExtra("sub6attended",b1.getString("sub6attended"));
			      a1.putExtra("sub7attended",b1.getString("sub7attended"));
			      a1.putExtra("sub8attended",b1.getString("sub8attended"));
			      a1.putExtra("sub9attended",b1.getString("sub9attended"));
			      a1.putExtra("sub10attended",b1.getString("sub10attended"));
			      a1.putExtra("sub11attended",b1.getString("sub11attended"));
			      a1.putExtra("sub12attended",b1.getString("sub12attended"));
			      
			      a1.putExtra("sub1percent",b1.getString("sub1percent"));
			      a1.putExtra("sub2percent",b1.getString("sub2percent"));
			      a1.putExtra("sub3percent",b1.getString("sub3percent"));
			      a1.putExtra("sub4percent",b1.getString("sub4percent"));
			      a1.putExtra("sub5percent",b1.getString("sub5percent"));
			      a1.putExtra("sub6percent",b1.getString("sub6percent"));
			      a1.putExtra("sub7percent",b1.getString("sub7percent"));
			      a1.putExtra("sub8percent",b1.getString("sub8percent"));
			      a1.putExtra("sub9percent",b1.getString("sub9percent"));
			      a1.putExtra("sub10percent",b1.getString("sub10percent"));
			      a1.putExtra("sub11percent",b1.getString("sub11percent"));
			      a1.putExtra("sub12percent",b1.getString("sub12percent"));
				
			      
			      startActivity(a1);
				break;
				
			case 1:
				/*************************************Overall**********************************/
				 Intent i2 = getIntent();
				 Bundle b2 = i2.getExtras();
				 Intent a2 = new Intent(percentlist.this,overallpercent.class);
				 a2.putExtra("Subject1Name",b2.getString("Subject1Name")); 
			      a2.putExtra("Subject2Name",b2.getString("Subject2Name"));
			      a2.putExtra("Subject3Name",b2.getString("Subject3Name")); 
			      a2.putExtra("Subject4Name",b2.getString("Subject4Name"));
			      a2.putExtra("Subject5Name",b2.getString("Subject5Name")); 
			      a2.putExtra("Subject6Name",b2.getString("Subject6Name"));
			      a2.putExtra("Subject7Name",b2.getString("Subject7Name")); 
			      a2.putExtra("Subject8Name",b2.getString("Subject8Name"));
			      a2.putExtra("Subject9Name",b2.getString("Subject9Name")); 
			      a2.putExtra("Subject10Name",b2.getString("Subject10Name"));
			      a2.putExtra("Subject11Name",b2.getString("Subject11Name")); 
			      a2.putExtra("Subject12Name",b2.getString("Subject12Name"));
			      
			      a2.putExtra("sub1taken",b2.getString("sub1taken"));
			      a2.putExtra("sub2taken",b2.getString("sub2taken"));
			      a2.putExtra("sub3taken",b2.getString("sub3taken"));
			      a2.putExtra("sub4taken",b2.getString("sub4taken"));
			      a2.putExtra("sub5taken",b2.getString("sub5taken"));
			      a2.putExtra("sub6taken",b2.getString("sub6taken"));
			      a2.putExtra("sub7taken",b2.getString("sub7taken"));
			      a2.putExtra("sub8taken",b2.getString("sub8taken"));
			      a2.putExtra("sub9taken",b2.getString("sub9taken"));
			      a2.putExtra("sub10taken",b2.getString("sub10taken"));
			      a2.putExtra("sub11taken",b2.getString("sub11taken"));
			      a2.putExtra("sub12taken",b2.getString("sub12taken"));
			      
			      a2.putExtra("sub1attended",b2.getString("sub1attended"));
			      a2.putExtra("sub2attended",b2.getString("sub2attended"));
			      a2.putExtra("sub3attended",b2.getString("sub3attended"));
			      a2.putExtra("sub4attended",b2.getString("sub4attended"));
			      a2.putExtra("sub5attended",b2.getString("sub5attended"));
			      a2.putExtra("sub6attended",b2.getString("sub6attended"));
			      a2.putExtra("sub7attended",b2.getString("sub7attended"));
			      a2.putExtra("sub8attended",b2.getString("sub8attended"));
			      a2.putExtra("sub9attended",b2.getString("sub9attended"));
			      a2.putExtra("sub10attended",b2.getString("sub10attended"));
			      a2.putExtra("sub11attended",b2.getString("sub11attended"));
			      a2.putExtra("sub12attended",b2.getString("sub12attended"));
			      
			      
			      a2.putExtra("sub1percent",b2.getString("sub1percent"));
			      a2.putExtra("sub2percent",b2.getString("sub2percent"));
			      a2.putExtra("sub3percent",b2.getString("sub3percent"));
			      a2.putExtra("sub4percent",b2.getString("sub4percent"));
			      a2.putExtra("sub5percent",b2.getString("sub5percent"));
			      a2.putExtra("sub6percent",b2.getString("sub6percent"));
			      a2.putExtra("sub7percent",b2.getString("sub7percent"));
			      a2.putExtra("sub8percent",b2.getString("sub8percent"));
			      a2.putExtra("sub9percent",b2.getString("sub9percent"));
			      a2.putExtra("sub10percent",b2.getString("sub10percent"));
			      a2.putExtra("sub11percent",b2.getString("sub11percent"));
			      a2.putExtra("sub12percent",b2.getString("sub12percent"));
				
				startActivity(a2);
				break;
				
		      /************************Short Attendance*******************************/
			  /*case 2:
			   
				
				Intent i3 = getIntent();
				 Bundle b3 = i3.getExtras();
				 Intent a3 = new Intent(percentlist.this,shortattendance.class);
				  a3.putExtra("Subject1Name",b3.getString("Subject1Name")); 
			      a3.putExtra("Subject2Name",b3.getString("Subject2Name"));
			      a3.putExtra("Subject3Name",b3.getString("Subject3Name")); 
			      a3.putExtra("Subject4Name",b3.getString("Subject4Name"));
			      a3.putExtra("Subject5Name",b3.getString("Subject5Name")); 
			      a3.putExtra("Subject6Name",b3.getString("Subject6Name"));
			      a3.putExtra("Subject7Name",b3.getString("Subject7Name")); 
			      a3.putExtra("Subject8Name",b3.getString("Subject8Name"));
			      a3.putExtra("Subject9Name",b3.getString("Subject9Name")); 
			      a3.putExtra("Subject10Name",b3.getString("Subject10Name"));
			      a3.putExtra("Subject11Name",b3.getString("Subject11Name")); 
			      a3.putExtra("Subject12Name",b3.getString("Subject12Name"));
			      
			      a3.putExtra("sub1taken",b3.getString("sub1taken"));
			      a3.putExtra("sub2taken",b3.getString("sub2taken"));
			      a3.putExtra("sub3taken",b3.getString("sub3taken"));
			      a3.putExtra("sub4taken",b3.getString("sub4taken"));
			      a3.putExtra("sub5taken",b3.getString("sub5taken"));
			      a3.putExtra("sub6taken",b3.getString("sub6taken"));
			      a3.putExtra("sub7taken",b3.getString("sub7taken"));
			      a3.putExtra("sub8taken",b3.getString("sub8taken"));
			      a3.putExtra("sub9taken",b3.getString("sub9taken"));
			      a3.putExtra("sub10taken",b3.getString("sub10taken"));
			      a3.putExtra("sub11taken",b3.getString("sub11taken"));
			      a3.putExtra("sub12taken",b3.getString("sub12taken"));
			      
			      a3.putExtra("sub1attended",b3.getString("sub1attended"));
			      a3.putExtra("sub2attended",b3.getString("sub2attended"));
			      a3.putExtra("sub3attended",b3.getString("sub3attended"));
			      a3.putExtra("sub4attended",b3.getString("sub4attended"));
			      a3.putExtra("sub5attended",b3.getString("sub5attended"));
			      a3.putExtra("sub6attended",b3.getString("sub6attended"));
			      a3.putExtra("sub7attended",b3.getString("sub7attended"));
			      a3.putExtra("sub8attended",b3.getString("sub8attended"));
			      a3.putExtra("sub9attended",b3.getString("sub9attended"));
			      a3.putExtra("sub10attended",b3.getString("sub10attended"));
			      a3.putExtra("sub11attended",b3.getString("sub11attended"));
			      a3.putExtra("sub12attended",b3.getString("sub12attended"));
			      
			      a3.putExtra("sub1percent",b3.getString("sub1percent"));
			      a3.putExtra("sub2percent",b3.getString("sub2percent"));
			      a3.putExtra("sub3percent",b3.getString("sub3percent"));
			      a3.putExtra("sub4percent",b3.getString("sub4percent"));
			      a3.putExtra("sub5percent",b3.getString("sub5percent"));
			      a3.putExtra("sub6percent",b3.getString("sub6percent"));
			      a3.putExtra("sub7percent",b3.getString("sub7percent"));
			      a3.putExtra("sub8percent",b3.getString("sub8percent"));
			      a3.putExtra("sub9percent",b3.getString("sub9percent"));
			      a3.putExtra("sub10percent",b3.getString("sub10percent"));
			      a3.putExtra("sub11percent",b3.getString("sub11percent"));
			      a3.putExtra("sub12percent",b3.getString("sub12percent"));
			
				startActivity(a3);
				break;
				*/
			}	
		}
		
 });
 }
}
