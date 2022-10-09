package com.applications.official;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.SharedPreferences; 
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import br.com.simplepass.loading_button_lib.customViews.CircularProgressButton;
import com.applications.official.First_Session_Activity;
import com.applications.official.models.FSMmodel;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.lang.Override;
import com.applications.official.R; 	
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import android.view.View; 
import androidx.annotation.NonNull; 
import java.net.URI;
import android.net.Uri; 
import org.parceler.Parcels;

public class FSMActivity extends AppCompatActivity  implements View.OnClickListener{
   
   private int position; 
   private String u1,u2,u3; 
    private YouTubePlayerView Webvideo,Webvideo1,Webvideo2;
	private TextView Title,Duration,T1,T2,T3; 
    private ProgressBar P; 
    private CircularProgressButton Submit;
    private FSMmodel  user;
     Uri URI = null;   
    private Parcelable parcelable1; 
     
    public static final String KEY_MAILG = "mail1";
    public static final String KEY_NAMEG = "name1"; 
    public static final String SHARED_PREF_NAMEG = "mypref1"; 
    SharedPreferences  mysharedprefarance2,mysharedprefarance;  
   
    public static final String SHARED_PREF_NAMER = "mypref";
    public static final String KEY_POSITIONR = "Position";

   
  private static final int PICK_FROM_GALLERY = 101;
   
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fsm);
    
    Webvideo = findViewById(R.id.webvideo);
    Webvideo1 = findViewById(R.id.webvideo1);
    Webvideo2 = findViewById(R.id.webvideo2);
  
 	getLifecycle().addObserver(Webvideo);
    getLifecycle().addObserver(Webvideo1);
   getLifecycle().addObserver(Webvideo2);
  
      T1 = findViewById(R.id.t1);
      T2 = findViewById(R.id.t2);
      T3 = findViewById(R.id.t3);   
     Title = findViewById(R.id.titleTextView);
     Duration = findViewById(R.id.duration);
      P = findViewById(R.id.progressBar);
      Submit = findViewById(R.id.submit); 
      
      
Bundle extras = getIntent().getExtras();   
     
       Parcelable  parcelable = getIntent().getParcelableExtra("DATE_KEY");
          user = Parcels.unwrap(parcelable);
          user.setLock(false); 
          
      
     
   
    
    
    
   
  
    
     if(extras != null) {
    Title.setText(extras.getString("title")); 
    Duration.setText(extras.getString("duration"));
    T1.setText(extras.getString("T1"));
    T2.setText(extras.getString("T2"));
    T3.setText(extras.getString("T3")); 
    u1 = extras.getString("u1");
    u2 = extras.getString("u2");
    u3 = extras.getString("u3");  
    position = extras.getInt("position");
    
/*   position = position +1;
              SharedPreferences.Editor editor = mysharedprefarance2.edit();
          	editor.putInt(KEY_POSITIONR,position);
              editor.apply();   */
    
    
  }
  
   T1.setOnClickListener(this);
   T2.setOnClickListener(this);
   T3.setOnClickListener(this);
   Submit.setOnClickListener(this);
    
   
  Webvideo.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
							  @Override
							  public void onReady(@NonNull YouTubePlayer youTubePlayer) {                                   
 						       String videoId = u1; 
							    youTubePlayer.cueVideo(videoId, 0);
                                
							  }
								});   
   
  Webvideo1.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
							  @Override
							  public void onReady(@NonNull YouTubePlayer youTubePlayer) {                                   
 						       String videoId = u2; 
							    youTubePlayer.cueVideo(videoId, 0);
                                
							  }
								});    
   
   
  Webvideo2.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
							  @Override
							  public void onReady(@NonNull YouTubePlayer youTubePlayer) {                                   
 						       String videoId = u3; 
							    youTubePlayer.cueVideo(videoId, 0);
                                
							  }
								});    
   
   
    
   
   
	}
    
    
   
    
    
    @Override
    public void onClick(View v){
       switch(v.getId()){
         case R.id.t1:
        if(Webvideo.getVisibility()== v.GONE ){
            Webvideo.setVisibility(v.VISIBLE); 
           Webvideo1.setVisibility(v.GONE);
            Webvideo2.setVisibility(v.GONE); 
            P.setProgress(25);               
	      
		 
       }
       else{
          Webvideo.setVisibility(v.GONE); 
       }
       break;
       case R.id.t2:
        if(Webvideo1.getVisibility()== v.GONE ){
            Webvideo1.setVisibility(v.VISIBLE); 
           Webvideo.setVisibility(v.GONE);
            Webvideo2.setVisibility(v.GONE);                    
	        P.setProgress(50);   
		 
       }
       else{
          Webvideo1.setVisibility(v.GONE); 
       }
       break; 
       case R.id.t3:
        if(Webvideo2.getVisibility()== v.GONE ){
            Webvideo2.setVisibility(v.VISIBLE); 
           Webvideo.setVisibility(v.GONE);
            Webvideo1.setVisibility(v.GONE);                    
	        P.setProgress(75);   
		 
       }
       else{
          Webvideo2.setVisibility(v.GONE); 
       }
        break;
        case R.id.submit: 
          P.setProgress(100);
         showDialog(); 
         break;
    }  
    
    }

   @Override 
   public void onConfigurationChanged(@NonNull Configuration newConfig)    { 
       
       super.onConfigurationChanged(newConfig); 
       // Checks the orientation of the screen 
       if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) { 
           Webvideo.enterFullScreen();
           Webvideo1.enterFullScreen();
           Webvideo2.enterFullScreen();
            }
       else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){ 
           Webvideo.exitFullScreen();
           Webvideo1.exitFullScreen();
           Webvideo2.exitFullScreen();
            }                         
           }
   
   
       @Override
     public void onBackPressed() {
        if (Webvideo.isFullScreen() || Webvideo1.isFullScreen() || Webvideo2.isFullScreen()){
            Webvideo.exitFullScreen();
            Webvideo1.exitFullScreen();
           Webvideo2.exitFullScreen();
           }            
        else
            super.onBackPressed(); 
    }
    
   private void showDialog() {
        final Dialog dialog = new Dialog(FSMActivity.this);
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
          ImageButton Send  = dialog.findViewById(R.id.send);
          TextView tvAttachment =  dialog.findViewById(R.id.tvAttachment);
		  ImageButton Attach = dialog.findViewById(R.id.bt_photo);
              
              
          mysharedprefarance = getSharedPreferences(SHARED_PREF_NAMEG,MODE_PRIVATE);     
          String gname = mysharedprefarance.getString(KEY_MAILG,null);
         String gmail = mysharedprefarance.getString(KEY_NAMEG,null);
     
              
              
      /*        String gname    =   "Ashok Kumar"; 
              String gmail =   "ashok81432@gmail.com";  */
              Teampname.setText(gname);
              Teampmail.setText(gmail); 
          
              
          
          
          
          Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FSMActivity.this, "Sending...", Toast.LENGTH_SHORT).show();
             String Subject = Teampsubject.getText().toString(); 
              String message = Teampmessage.getText().toString(); 
              mysharedprefarance =  getSharedPreferences(SHARED_PREF_NAMER,0);
              
              sendEmail(gmail,Subject,message); 
             JavaMailAPI javaMailAPI1 = new JavaMailAPI(getApplicationContext(),"dakstar143@gmail.com",Subject,message);
             javaMailAPI1.execute();
             
        

           new Handler().postDelayed(new  Runnable(){
       
		@Override
            public void run(){
        	
           Toast.makeText(getApplicationContext(),"Task Completed!!!",Toast.LENGTH_SHORT).show(); 
        }
    },5000);
             
              
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
         Toast.makeText(this, "Request failed try again: "+ t.toString(), Toast.LENGTH_LONG).show();
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
   
   public void resend(){
	 	position = position +1;                                          
   Intent intent = new Intent(FSMActivity.this,First_Session_Activity.class); 
             intent.putExtra("Lock",false);
             intent.putExtra("Position",position);
             startActivity(intent); 
} 



}






































