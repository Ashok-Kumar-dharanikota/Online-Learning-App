package com.applications.official;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import java.lang.Override;
import android.view.View; 
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import androidx.annotation.NonNull; 
import android.content.res.Configuration;
import com.itsaky.androidide.logsender.LogSender;

public class CourseActivity extends AppCompatActivity  implements View.OnClickListener  {
    
    private CardView C_c,C_j,C_p,C_s,C_e;
    private YouTubePlayerView WebvideoC,WebvideoJ,WebvideoP,WebvideoS,WebvideoE;
    
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
     LogSender.startLogging(this);
    setContentView(R.layout.activity_courses);
       C_c = findViewById(R.id.c_C);
       C_j = findViewById(R.id.c_J);
       C_p = findViewById(R.id.c_P);
       C_s = findViewById(R.id.c_S);
       C_e = findViewById(R.id.c_E);
      WebvideoC = findViewById(R.id.webvideoC); 
      WebvideoJ = findViewById(R.id.webvideoJ); 
      WebvideoP = findViewById(R.id.webvideoP); 
      WebvideoS = findViewById(R.id.webvideoS); 
      WebvideoE = findViewById(R.id.webvideoE); 
     		
    getLifecycle().addObserver(WebvideoC);
    getLifecycle().addObserver(WebvideoJ);
    getLifecycle().addObserver(WebvideoP);
    getLifecycle().addObserver(WebvideoS);
    getLifecycle().addObserver(WebvideoE);
   
             
             
      C_c .setOnClickListener(this); 
      C_j .setOnClickListener(this);
      C_p .setOnClickListener(this);
      C_s .setOnClickListener(this);  
      C_e .setOnClickListener(this);  
     
      	WebvideoC.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
							  @Override
							  public void onReady(@NonNull YouTubePlayer youTubePlayer) {                                   
 						       String videoId = "87SH2Cn0s9A";  
							    youTubePlayer.cueVideo(videoId, 0);
                                
							  }
								});   
   
  WebvideoJ.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
							  @Override
							  public void onReady(@NonNull YouTubePlayer youTubePlayer) {                                   
 						       String videoId = "xk4_1vDrzzo"; 
							    youTubePlayer.cueVideo(videoId, 0);
                                
							  }
								});    
   
   
  WebvideoP.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
							  @Override
							  public void onReady(@NonNull YouTubePlayer youTubePlayer) {                                   
 						       String videoId = "XKHEtdqhLK8"; 
							    youTubePlayer.cueVideo(videoId, 0);
                                
							  }
								});     
  WebvideoS.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
							  @Override
							  public void onReady(@NonNull YouTubePlayer youTubePlayer) {                                   
 						       String videoId = "c9Wg6Cb_YlU"; 
							    youTubePlayer.cueVideo(videoId, 0);
                                
							  }
								});  
                                
   WebvideoE.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
							  @Override
							  public void onReady(@NonNull YouTubePlayer youTubePlayer) {                                   
 						       String videoId = "c9Wg6Cb_YlU"; 
							    youTubePlayer.cueVideo(videoId, 0);
                                
							  }
								});     
      

      
    
  }
  
  @Override  
  public void onClick(View p1){
      switch(p1.getId()){
         case R.id.c_C:
         if(WebvideoC.getVisibility()==p1.GONE){
         WebvideoC.setVisibility(p1.VISIBLE);
          WebvideoJ.setVisibility(p1.GONE);
         WebvideoP.setVisibility(p1.GONE);
          WebvideoS.setVisibility(p1.GONE);
         WebvideoE.setVisibility(p1.GONE);
         
       }
       else{
         WebvideoC.setVisibility(p1.GONE);
       }  
       break;
       case R.id.c_J:
         if(WebvideoJ.getVisibility()==p1.GONE){
         WebvideoJ.setVisibility(p1.VISIBLE);
        WebvideoC.setVisibility(p1.GONE);
         WebvideoP.setVisibility(p1.GONE);
          WebvideoS.setVisibility(p1.GONE);
         WebvideoE.setVisibility(p1.GONE);
       }
       else{
         WebvideoJ.setVisibility(p1.GONE);
       }  
       break;
       case R.id.c_P:
         if(WebvideoP.getVisibility()==p1.GONE){
         WebvideoP.setVisibility(p1.VISIBLE);
         WebvideoJ.setVisibility(p1.GONE);
          WebvideoC.setVisibility(p1.GONE);
          WebvideoS.setVisibility(p1.GONE);
         WebvideoE.setVisibility(p1.GONE);
       }
       else{
         WebvideoP.setVisibility(p1.GONE);
       }  
       break;
       case R.id.c_S:
         if(WebvideoS.getVisibility()==p1.GONE){
         WebvideoS.setVisibility(p1.VISIBLE);
         WebvideoJ.setVisibility(p1.GONE);
         WebvideoP.setVisibility(p1.GONE);
          WebvideoC.setVisibility(p1.GONE);
         WebvideoE.setVisibility(p1.GONE);
       }
       else{
         WebvideoS.setVisibility(p1.GONE);
       }  
       break;
      case R.id.c_E:
         if(WebvideoE.getVisibility()==p1.GONE){
         WebvideoE.setVisibility(p1.VISIBLE);
         WebvideoJ.setVisibility(p1.GONE);
         WebvideoP.setVisibility(p1.GONE);
         WebvideoS.setVisibility(p1.GONE);
         WebvideoC.setVisibility(p1.GONE);
       }
       else{
         WebvideoE.setVisibility(p1.GONE);
       }  
       break;           
       
         
      }
      
  }
  
  
  
 @Override 
   public void onConfigurationChanged(@NonNull Configuration newConfig)    {           
          super.onConfigurationChanged(newConfig); 
       // Checks the orientation of the screen 
       if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) { 
           WebvideoC.enterFullScreen();
           WebvideoJ.enterFullScreen();
           WebvideoP.enterFullScreen();
           WebvideoS.enterFullScreen();
           WebvideoE.enterFullScreen();
            }
       else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){ 
           WebvideoC.exitFullScreen();
           WebvideoJ.exitFullScreen();
           WebvideoP.exitFullScreen();
           WebvideoS.exitFullScreen();
           WebvideoE.exitFullScreen();
           
            }                         
           }
   
   
       @Override
     public void onBackPressed() {
         super.onBackPressed();
        if (WebvideoC.isFullScreen() || WebvideoJ.isFullScreen() || WebvideoP.isFullScreen() || WebvideoS.isFullScreen() || WebvideoE.isFullScreen()){
            WebvideoC.exitFullScreen();
            WebvideoJ.exitFullScreen();
            WebvideoP.exitFullScreen();
            WebvideoS.exitFullScreen();
            WebvideoE.exitFullScreen();
           }            
        else
            super.onBackPressed(); 
    }
  
 
  
}















