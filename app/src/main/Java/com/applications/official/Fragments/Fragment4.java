package com.applications.official.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import com.applications.official.R;
import java.lang.Override;
import android.view.View;

public  class Fragment4 extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_projects, container, false);

String url = "https://www.w3schools.com/java";
      
         WebView onecompiler = view.findViewById(R.id.guiderweb);
        
        
        onecompiler.getSettings().setJavaScriptEnabled(true);
         
        onecompiler.setWebViewClient(new WebViewClient());
      //  onecompiler.setWebChromeClient(new webChromeClient());
       
        onecompiler.loadUrl(url);
      
      return view;
        }
    }
