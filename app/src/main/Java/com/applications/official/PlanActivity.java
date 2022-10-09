package com.applications.official;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.applications.official.MainActivity;
import com.applications.official.PlanActivity;
import java.lang.Override;
import java.lang.Runnable;

public class PlanActivity extends AppCompatActivity {
    
    ImageView  Logo;
    Animation fadeInAnimation;
    public static final String KEY_MAIL = "mail";
    public static final String SHARED_PREF_NAME = "mypref";
    
    SharedPreferences  mysharedprefarance;
    
    
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_plan);
    
    Logo = findViewById(R.id.logo);

fadeInAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation);
                Logo.startAnimation(fadeInAnimation);
        
 
 mysharedprefarance = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

     
     String mail = mysharedprefarance.getString(KEY_MAIL,null);
     
                
    
    new Handler().postDelayed(new  Runnable(){
        
		@Override
            public void run(){
                
       if(mail != null){        
        Intent i1 = new Intent(PlanActivity.this,storeActivity.class);       
         startActivity(i1);
         finish();
         }
         
         else{
            Intent i = new Intent(PlanActivity.this,MainActivity.class);
            startActivity(i);
            finish();
            }
        }
    },2000);
    
    
    
    
  }
}










