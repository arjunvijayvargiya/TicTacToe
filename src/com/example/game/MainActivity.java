package com.example.game;





import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity implements OnClickListener {
	ImageView iv0,iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8;
	int[] ch=new int[10];
	int player=1;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv=(TextView) findViewById(R.id.playerStatus);
		iv0=(ImageView) findViewById(R.id.t1);
		iv1=(ImageView) findViewById(R.id.t2);
		iv2=(ImageView) findViewById(R.id.t3);
		iv3=(ImageView) findViewById(R.id.t4);
		iv4=(ImageView) findViewById(R.id.t5);
		iv5=(ImageView) findViewById(R.id.t6);
		iv6=(ImageView) findViewById(R.id.t7);
		iv7=(ImageView) findViewById(R.id.t8);
		iv8=(ImageView) findViewById(R.id.t9);
		iv0.setOnClickListener(this);
		iv1.setOnClickListener(this);
		iv2.setOnClickListener(this);
		iv3.setOnClickListener(this);
		iv4.setOnClickListener(this);
		iv5.setOnClickListener(this);
		iv6.setOnClickListener(this);
		iv7.setOnClickListener(this);
		iv8.setOnClickListener(this);
	
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.t1: 
			          if(getLabel()==1)
		                 {
			                  iv0.setImageDrawable(getResources().getDrawable(R.drawable.zero));
			                  ch[0]=1;
			                  player=2;
		                 }
		               else
		               {
		            	  
		            	   iv0.setImageDrawable(getResources().getDrawable(R.drawable.cross1));
		            	   
		            	   player=1;
		               
		               }
		              break;
		case R.id.t2: 
			if(getLabel()==1)
        {
             iv1.setImageDrawable(getResources().getDrawable(R.drawable.zero));
             ch[1]=1;
             player=2;
        }
      else
      {
   	 
   	   iv1.setImageDrawable(getResources().getDrawable(R.drawable.cross1));
   	player=1;
      
      }
     break;
		case R.id.t3: ch[2]=1;
			if(getLabel()==1)
        {
             iv2.setImageDrawable(getResources().getDrawable(R.drawable.zero));
             ch[2]=1;
             player=2;
        }
      else
      {
   	   
   	   iv2.setImageDrawable(getResources().getDrawable(R.drawable.cross1));
   	player=1;
      
      }
     break;
		case R.id.t4: 
			if(getLabel()==1)
        {
             iv3.setImageDrawable(getResources().getDrawable(R.drawable.zero));
             ch[3]=1;
            
             ZeroVic( evaluatezero());
             player=2;
        }
      else
      {
   	   
   	   iv3.setImageDrawable(getResources().getDrawable(R.drawable.cross1));
   	player=1;
      
      }
     break;
		case R.id.t5: ch[4]=1;
			if(getLabel()==1)
        {
             iv4.setImageDrawable(getResources().getDrawable(R.drawable.zero));
             ch[4]=1;
             player=2;
        }
      else
      {
   	   
   	   iv4.setImageDrawable(getResources().getDrawable(R.drawable.cross1));
   	player=1;
      
      }
     break;
		case R.id.t6: 
			if(getLabel()==1)
        {
             iv5.setImageDrawable(getResources().getDrawable(R.drawable.zero));
             ch[5]=1;
             player=2;
        }
      else
      {
   	  
   	   iv5.setImageDrawable(getResources().getDrawable(R.drawable.cross1));
   	player=1;
      
      
      }
     break;
		case R.id.t7: 
			if(getLabel()==1)
        {
             iv6.setImageDrawable(getResources().getDrawable(R.drawable.zero));
             ch[6]=1;
             player=2;
        }
      else
      {
   	  
   	   iv6.setImageDrawable(getResources().getDrawable(R.drawable.cross1));
   	player=1;
      
      
      }
     break;
		case R.id.t8: 
			if(getLabel()==1)
        {
             iv7.setImageDrawable(getResources().getDrawable(R.drawable.zero));
             ch[7]=1;
             player=2;
        }
      else
      {
   	   
   	   iv7.setImageDrawable(getResources().getDrawable(R.drawable.cross1));
   	player=1;
      
      }
     break;
		case R.id.t9: 
			if(getLabel()==1)
        {
             iv8.setImageDrawable(getResources().getDrawable(R.drawable.zero));
             ch[8]=1;
             player=2;
        }
      else
      {
   	  
   	   iv8.setImageDrawable(getResources().getDrawable(R.drawable.cross1));
   	player=1;
      
      
      }
     break;
	}


}
	private int getLabel() {
		// TODO Auto-generated method stub
		if(player==1)
		{
			return(1);
		}
		else 
			return(2);
	}
	private int evaluatezero() {
		// TODO Auto-generated method stub
        int win=0;
		if((ch[0]+ch[1]+ch[2])==3)
		{ win=1;
			
		}
		else if((ch[0]+ch[3]+ch[6])==3)
		{
			 win=1;
		}
		else if((ch[0]+ch[4]+ch[8])==3)
		{
			 win=1;
		}
		else if((ch[1]+ch[4]+ch[7])==3)
		{
			 win=1;
		}
		else if((ch[2]+ch[5]+ch[8])==3)
		{
			 win=1;
		}
		else if((ch[2]+ch[4]+ch[6])==3)
		{
			 win=1;
		}
		else if((ch[3]+ch[4]+ch[5])==3)
		{
			 win=1;
		}
		else if((ch[6]+ch[7]+ch[8])==3)
		{
			 win=1;
		}
		else
			win=0;
			
			
			return(win);
			
			
			
			
			
			
	}
	private void ZeroVic(int val) {
		// TODO Auto-generated method stub
     if(val==1)
	   tv.setText("playerzero won");
     else
    	 tv.setText("playerzero playing");
	}
}
