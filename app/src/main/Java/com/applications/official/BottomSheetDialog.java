package com.applications.official;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences; 
import android.net.Uri;
import android.os.Bundle; 
import android.view.LayoutInflater; 
import android.view.View; 
import android.view.ViewGroup; 
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button; 
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;   
import androidx.annotation.Nullable; 
import com.google.android.material.bottomsheet.BottomSheetDialogFragment; 
import java.lang.Override;
import java.net.URI;

public class BottomSheetDialog extends BottomSheetDialogFragment implements View.OnClickListener { 

  private LinearLayout G1,G2,G3,G4,G5,G6,G7,G8,G9,G10,G11;
   Uri URI = null; 
  private String[] Names = {};
  private String[] Emails ={};  
  private static final int PICK_FROM_GALLERY = 101;
   
    public static final String KEY_MAILG = "mail1";
    public static final String KEY_NAMEG = "name1"; 
    public static final String SHARED_PREF_NAMEG = "mypref1";
    
     SharedPreferences  mysharedprefarance; 
    
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable Bundle savedInstanceState) 
    { 

        View v = inflater.inflate(R.layout.bottom_sheet,container, false); 
		
          
         mysharedprefarance = getActivity().getSharedPreferences(SHARED_PREF_NAMEG,0);
 
          
          G1 = v.findViewById(R.id.g1); 
          G2 = v.findViewById(R.id.g2);
          G3 = v.findViewById(R.id.g3);
          G4 = v.findViewById(R.id.g4);
          G5 = v.findViewById(R.id.g5);
          G6 = v.findViewById(R.id.g6);
          G7 = v.findViewById(R.id.g7);
          G8 = v.findViewById(R.id.g8);
          G9 = v.findViewById(R.id.g9);
          G10 = v.findViewById(R.id.g10);
          G11 = v.findViewById(R.id.g11);
        
        
       G1.setOnClickListener(this);    
       G2.setOnClickListener(this);
       G3.setOnClickListener(this);
       G4.setOnClickListener(this);
       G5.setOnClickListener(this);
       G6.setOnClickListener(this);
       G7.setOnClickListener(this);
       G8.setOnClickListener(this);
       G9.setOnClickListener(this);
       G10.setOnClickListener(this);
       G11.setOnClickListener(this);
       
       
        return v;
        
        
   } 
    
    @Override
    public void onClick(View p1){
     	switch(p1.getId()){
             case R.id.g1:
             showDialog(Names[0],Emails[0]); 
             break; 
             case R.id.g2:
             showDialog(Names[1],Emails[1]);              
             break; 
             case R.id.g3:
             showDialog(Names[2],Emails[2]); 
             break; 
             case R.id.g4:
             showDialog(Names[3],Emails[3]); 
             break; 
             case R.id.g5:
             showDialog(Names[4],Emails[4]); 
             break; 
             case R.id.g6:
             showDialog(Names[5],Emails[5]); 
             break;  
             case R.id.g7:
             showDialog(Names[6],Emails[6]); 
             break; 
             case R.id.g8:
             showDialog(Names[7],Emails[7]); 
             break; 
             case R.id.g9:
             showDialog(Names[8],Emails[8]); 
             break; 
             case R.id.g10:
             showDialog(Names[9],Emails[9]); 
             break; 
            case R.id.g11:
             showDialog(Names[10],Emails[10]); 
             break;                                        
         }
     
                 
   /*      Intent i = new Intent(getActivity(),Activity_Team_Mailing.class);
         startActivity(i);
         */
         
         
        
  } 

         
private void showDialog(String gname,String gmail) {
        final Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.fsm_dialogbox);
        dialog.setCancelable(true);

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        
          TextView Teampname = dialog.findViewById(R.id.teampname);
          TextView Teampmail = dialog.findViewById(R.id.teampmail);
          EditText Teampsubject = dialog.findViewById(R.id.etSubject);
          EditText Teampmessage = dialog.findViewById(R.id.et_message);
         TextView tvAttachment =  dialog.findViewById(R.id.tvAttachment);
          ImageButton Send  = dialog.findViewById(R.id.send);
          ImageButton Attach = dialog.findViewById(R.id.bt_photo);
              
              Teampname.setText(gname);
              Teampmail.setText(gmail); 
           
           SharedPreferences.Editor editor = mysharedprefarance.edit(); 
           editor.putString(KEY_MAILG,gname);
           editor.putString(KEY_NAMEG,gmail);           
           editor.apply();
           
          Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Sending...", Toast.LENGTH_SHORT).show();
              String Subject = Teampsubject.getText().toString(); 
              String message = Teampmessage.getText().toString();
            JavaMailAPI javaMailAPI1 = new JavaMailAPI(getActivity(),"dakstar143@gmail.com",Subject,message);
             javaMailAPI1.execute();
              
              
              sendEmail(gmail,Subject,message); 
              
            }
        });
        
          Attach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openFolder(); 
        
              
              
            }
        });
        
     
     
      
        
        
        
        dialog.show();
        dialog.getWindow().setAttributes(lp);
        
    }    
        
        
        
     public void sendEmail(String email,String subject,String message) {
      try {
         
         final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
         emailIntent.setType("plain/text");
         emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{email});
         emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, subject);
         if (URI != null) {
            emailIntent.putExtra(Intent.EXTRA_STREAM, URI);
         }
         emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
         this.startActivity(Intent.createChooser(emailIntent, "Sending email..."));
      } catch (Throwable t) {
         Toast.makeText(getContext(), "Request failed try again: "+ t.toString(), Toast.LENGTH_LONG).show();
      }
   }  
      
       
          public  void onActivityResult(int requestCode, int resultCode, Intent data) {
         super.onActivityResult(requestCode,resultCode,data);
      if (requestCode == PICK_FROM_GALLERY) {  
           URI = data.getData();
         } 
  } 
       
          
        
      public void openFolder() {
      Intent intent = new Intent();
      intent.setType("image/*");
      intent.setAction(Intent.ACTION_GET_CONTENT);
      intent.putExtra("return-data", true);
      startActivityForResult(Intent.createChooser(intent, "Complete action using"), PICK_FROM_GALLERY);
      
     
      
   } 
   
   
   
  
        
        
        
        
        
         }
        
        
 /*       public void sendEmail(String email,String subject,String message) {
      try {
         
         final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
         emailIntent.setType("plain/text");
         emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{email});
         emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, subject);
         if (URI != null) {
            emailIntent.putExtra(Intent.EXTRA_STREAM, URI);
         }
         emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
         this.startActivity(Intent.createChooser(emailIntent, "Sending email..."));
      } catch (Throwable t) {
         Toast.makeText(getContext(), "Request failed try again: "+ t.toString(), Toast.LENGTH_LONG).show();
      }
   }  
        
      protected void onActivityResult(int requestCode, int resultCode, Intent data) {
      if (requestCode == PICK_FROM_GALLERY && resultCode == RESULT_OK) {
           URI = data.getData();
         tvAttachment.setText(URI.getLastPathSegment());
         tvAttachment.setVisibility(View.VISIBLE);
      }
   }    
        
        
      public void openFolder() {
      Intent intent = new Intent();
      intent.setType("image/*");
      intent.setAction(Intent.ACTION_GET_CONTENT);
      intent.putExtra("return-data", true);
      startActivityForResult(intent.createChooser(intent, "Complete action using"), PICK_FROM_GALLERY);
      
     
      
   } */
   
   
     
        
        
        
    
    
    
    












