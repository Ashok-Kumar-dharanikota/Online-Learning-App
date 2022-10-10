/* package com.test.app5;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;
import com.itsaky.androidide.logsender.LogSender;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.lang.Override;
import java.lang.String;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	private Context ctx;
	private WebView webView;
    private ProgressBar progressBar;
    private String url;
    
        
    @Override
    protected void onCreate(Bundle savedInstanceState) { 
		LogSender.startLogging(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		String str = "";
        
     YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
   getLifecycle().addObserver(youTubePlayerView);
       
  //     youTubePlayerView.addFullScreenListener(YouTubePlayerFullScreenListener );
       
       
       url = "https://www.youtube.com/embed/xk4_1vDrzzo";
        
        webView = (WebView) findViewById(R.id.webyt);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        
      webView.getSettings().setJavaScriptEnabled(true);
webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
webView.loadUrl(url);

WebChromeClientCustom mWebChromeClient = new WebChromeClientCustom();
webView.setWebChromeClient(mWebChromeClient);
        
        
       if(savedInstanceState != null)
 webView.restoreState(savedInstanceState);
         else {
       start();
           }
        
        
      
        
        
        
       webView.setWebViewClient(new WebViewClient() {
@Override
public void onPageFinished(WebView view, String url) {
super.onPageFinished(view, url);
progressBar.setVisibility(View.GONE);
}
@Override
public void onPageStarted(WebView view, String url, Bitmap favicon) {
super.onPageStarted(view, url, favicon);
}

@Override
public boolean shouldOverrideUrlLoading(WebView view, String url) {
view.loadUrl(url);
return false;
}
});






        
        
    }
    
    
  private void start() {

webView.getSettings().setJavaScriptEnabled(true);
webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
webView.loadUrl(url);

WebChromeClientCustom mWebChromeClient = new WebChromeClientCustom();
webView.setWebChromeClient(mWebChromeClient);

}

  
    
    
    
    
    
    
    
  private class WebChromeClientCustom extends WebChromeClient {
private View mCustomView;
private static final int FULL_SCREEN_SETTING = View.SYSTEM_UI_FLAG_FULLSCREEN |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |View.SYSTEM_UI_FLAG_LAYOUT_STABLE |View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |View.SYSTEM_UI_FLAG_IMMERSIVE;

private WebChromeClient.CustomViewCallback mCustomViewCallback;
private int mOriginalOrientation;
private int mOriginalSystemUiVisibility;
public void onHideCustomView() {
((FrameLayout) getWindow().getDecorView()).removeView(this.mCustomView);
this.mCustomView = null;
getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
setRequestedOrientation(this.mOriginalOrientation);
this.mCustomViewCallback.onCustomViewHidden();
this.mCustomViewCallback = null;
setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER);
}
@Override
public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {
if (this.mCustomView != null) {
onHideCustomView();
return;
}
this.mCustomView = paramView;
this.mOriginalSystemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
this.mOriginalOrientation = getRequestedOrientation();
this.mCustomViewCallback = paramCustomViewCallback;
((FrameLayout) getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
MainActivity.this.getWindow().getDecorView().setSystemUiVisibility(FULL_SCREEN_SETTING);
setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER);
this.mCustomView.setOnSystemUiVisibilityChangeListener(visibility -> updateControls());
}
@Override
public Bitmap getDefaultVideoPoster() {
return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
}
void updateControls() {
FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) this.mCustomView.getLayoutParams();
params.bottomMargin = 0;
params.topMargin = 0;
params.leftMargin = 0;
params.rightMargin = 0;
params.height = ViewGroup.LayoutParams.MATCH_PARENT;
params.width = ViewGroup.LayoutParams.MATCH_PARENT;
this.mCustomView.setLayoutParams(params);
MainActivity.this.getWindow().getDecorView().setSystemUiVisibility(FULL_SCREEN_SETTING);
}






 }
    
   
@Override
public void onConfigurationChanged(Configuration newConfig) {
super.onConfigurationChanged(newConfig);
}
@Override
protected void onSaveInstanceState(Bundle outState) {;
super.onSaveInstanceState(outState);
webView.saveState(outState);
}
@Override
protected void onRestoreInstanceState(Bundle savedInstanceState) {
super.onRestoreInstanceState(savedInstanceState);
  webView.restoreState(savedInstanceState);
 
}
    
    
    

    
    
    
    
}

*/













