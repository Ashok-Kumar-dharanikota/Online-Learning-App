package com.applications.official;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
//import i.d;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import br.com.simplepass.loading_button_lib.customViews.CircularProgressButton;
import com.applications.official.Fragments.FragmentOne;
import com.applications.official.LoginActivity;
import java.lang.Override;
import android.view.View;
import java.lang.String;



public class LoginActivity extends AppCompatActivity {
 
private EditText editmail,editpassward;

public static final String SHARED_PREF_NAME = "mypref";
public static final String KEY_MAIL = "mail";
 SharedPreferences  mysharedprefarance;

 
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
   
   setContentView(R.layout.activity_login);
   
   
   
  
  editmail = findViewById(R.id.editTextEmail);
  editpassward = findViewById(R.id.editTextPassword);

  
 
   
  }
  
  
  
  
  
  public void Login(View view) {
    
    String eUmail = editmail.getText().toString();
    String eUpassward = editpassward.getText().toString();
    
    if(!eUmail.equals("") && !eUpassward.equals("")) {
 
      Intent intent = getIntent();      
      
     String Umail = intent.getStringExtra("umail");
     String Upassward = intent.getStringExtra("upassward");
     
     if(eUmail.equals(Umail) && eUpassward.equals(Upassward)) {
         
        Intent intent1 = new Intent(LoginActivity.this,FragmentOne.class );
       
      intent1.putExtras(intent);
        
        finish();
        startActivity(intent1);
        
         
     }
           
     else {
         
        Toast.makeText(getApplicationContext(),"not mateched",Toast.LENGTH_SHORT).show();
         
     }
    
   } 
    
        
    Toast.makeText(getApplicationContext(),"login",Toast.LENGTH_SHORT).show();
      
  }
  



   public void onLoginClick(View view){
        startActivity(new Intent(LoginActivity.this,MainActivity.class));
        overridePendingTransition(R.anim.slide_in_right,android.R.anim.slide_in_left);

    }


}














