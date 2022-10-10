package com.applications.official.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.applications.official.R;
import java.lang.Override;
import android.view.View;


public  class Fragment3 extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
     //       View view = inflater.inflate(R.layout.fragment_tasks, container, false);
      View view = inflater.inflate(R.layout.fragment_tasks,container,false);
        
        TextView Title = view.findViewById(R.id.title);
        
        Title.setText("Code</>");
        
        String url = "https://www.mycompiler.io/new/java";
        
        //  https://ide.judge0.com
        WebView onecompiler = view.findViewById(R.id.webcodeview);
        
        
        onecompiler.getSettings().setJavaScriptEnabled(true);
         
        onecompiler.setWebViewClient(new WebViewClient());
      //  onecompiler.setWebChromeClient(new webChromeClient());
       
        onecompiler.loadUrl(url);
        
        
      
        return view;
        }
    }

