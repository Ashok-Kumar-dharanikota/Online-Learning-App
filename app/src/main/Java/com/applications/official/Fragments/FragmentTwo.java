package com.applications.official.Fragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.applications.official.CAdapter;
import com.applications.official.Cmodel;
import com.applications.official.CourseActivity;
import com.applications.official.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.lang.Override;
import android.view.View;
import com.budiyev.android.imageloader.ImageLoader;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import androidx.annotation.NonNull; 

import com.applications.official.storeActivity;

public  class FragmentTwo extends Fragment implements  View.OnClickListener {

public FragmentTwo(){ }

private  List<Cmodel> CList = new ArrayList<>();
    private CAdapter cAdapter; 


private RelativeLayout Banner;
private LinearLayout Layout,LayoutOne,LayoutTwo;
private TextView  Cdetails,Javadetails,Pythondetails,Seeall;
private CardView Ccourse,Javacourse,Pythoncourse;
private RecyclerView recyclerView,recyclerViewJ,recyclerViewP;
private ImageView Cimg,Jimg,Pimg;
private YouTubePlayerView WebvideoC,WebvideoJ,WebvideoP; 

private WebView  Webp;
 
private BottomNavigationView bnv;  
private FloatingActionButton Team;
   
        @Override
        public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
                       
       View view =  inflater.inflate(R.layout.fragement_courses, container, false);
       
       Cimg = (ImageView) view.findViewById(R.id.cimg);
       Jimg = (ImageView) view.findViewById(R.id.jimg);
       Pimg = (ImageView) view.findViewById(R.id.pimg);

	   Webp = (WebView) view.findViewById(R.id.web_p);

	 ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4vcajrJa_XvdAi5B72AzxXbHETCegLJBxgg&usqp=CAU").load(Cimg);
     ImageLoader.with(getActivity()).from("https://www.coursesxpert.com/wp-content/uploads/2021/01/Java-Course.jpg").load(Jimg);
     ImageLoader.with(getActivity()).from("https://content.timesjobs.com/img/75447920/Master.jpg").load(Pimg);
       
       recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
       recyclerViewJ = (RecyclerView) view.findViewById(R.id.recyclerViewj);
       recyclerViewP = (RecyclerView) view.findViewById(R.id.recyclerViewp);
       
       
       Layout = (LinearLayout) view.findViewById(R.id.layout);
       LayoutOne = (LinearLayout) view.findViewById(R.id.layout1);
       Banner  = (RelativeLayout) view.findViewById(R.id.banner);
     
       Seeall = (TextView) view.findViewById(R.id.seeall);
       Seeall.setOnClickListener(this);
     
       Ccourse = (CardView) view.findViewById(R.id.card_c);       
       Ccourse.setOnClickListener(this);
       Javacourse = (CardView) view.findViewById(R.id.card_j);
       Javacourse.setOnClickListener(this);
       Pythoncourse = (CardView) view.findViewById(R.id.card_p);
       Pythoncourse.setOnClickListener(this);
      
       Cdetails = (TextView) view.findViewById(R.id.details);
       Javadetails = (TextView) view.findViewById(R.id.details1);
       Pythondetails = (TextView) view.findViewById(R.id.details2);
         
         Cdetails.setText("A low-level procedural language, C is designed to work across platforms and provide access to important features like memory management. C programming builds up the source code for many UNIX operating systems, compilers, video games, and even other computer programming languages like Python.");
         Javadetails.setText("Java is a general-purpose programming language that is class-based and object-oriented. The programming language is structured in such a way that developers can write code anywhere and run it anywhere without worrying about the underlying computer architecture. It is also referred to as write once, run anywhere ");
         Pythondetails.setText("Python is often used as a support language for software developers, for build control and management, testing, and in many other ways. SCons for build control. Buildbot and Apache Gump for automated continuous compilation and testing. Roundup or Trac for bug tracking and project management.");
              
   //     recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
          recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
           recyclerView.setItemAnimator(new DefaultItemAnimator());
          recyclerViewJ.setLayoutManager(new LinearLayoutManager(getContext()));
           recyclerViewJ.setItemAnimator(new DefaultItemAnimator());
          recyclerViewP.setLayoutManager(new LinearLayoutManager(getContext()));
           recyclerViewP.setItemAnimator(new DefaultItemAnimator());
          
          WebvideoC = view.findViewById(R.id.webvideoC);
          WebvideoJ = view.findViewById(R.id.webvideoJ);
          WebvideoP  = view.findViewById(R.id.webvideoP);
          
           getLifecycle().addObserver(WebvideoC);
           getLifecycle().addObserver(WebvideoJ);
           getLifecycle().addObserver(WebvideoP);
          
          
            bnv = getActivity().findViewById(R.id.Navigation);
            Team = getActivity().findViewById(R.id.fab);
           
 /*         cAdapter  = new CAdapter(CList);
          recyclerView.setAdapter(cAdapter);
          recyclerViewJ.setAdapter(cAdapter);
          recyclerViewP.setAdapter(cAdapter);
          prepareCData(); 
          
          
          String url ="https://www.youtube.com/embed/xk4_1vDrzzo";
     //     String url = "https://www.youtube.com/watch?v=xk4_1vDrzzo&t=174s";
          
          Webp.getSettings().setJavaScriptEnabled(true);
          Webp.setWebViewClient(new WebViewClient());
          Webp.loadUrl(url);
           */  
          
          
          
          
          
          
          
          
          
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
          
          
          
          
          
          
          
          
           
       return view;
      }
      
 @Override
  public void onClick(View p1){
      
      switch(p1.getId()) {
         case R.id.card_c:
         Toast.makeText(getActivity(),"C Course ",Toast.LENGTH_SHORT).show();
           if(Cdetails.getVisibility() == p1.GONE){
             WebvideoC.setVisibility(p1.VISIBLE);
             TransitionManager.beginDelayedTransition(Layout,new AutoTransition());
             Cdetails.setVisibility(p1.VISIBLE);             
             Banner.setVisibility(p1.GONE);
             bnv.setVisibility(p1.GONE);
             Team.setVisibility(p1.GONE);
             
             }
         else {
          
             TransitionManager.beginDelayedTransition(Layout,new AutoTransition());
             Cdetails.setVisibility(p1.GONE);             ;
             Banner.setVisibility(p1.VISIBLE);
             WebvideoC.setVisibility(p1.GONE); 
             bnv.setVisibility(p1.VISIBLE);
             Team.setVisibility(p1.VISIBLE);
         }         
          break; 
          
        case R.id.card_j:
         Toast.makeText(getActivity(),"Java Course",Toast.LENGTH_SHORT).show();
           if(Javadetails.getVisibility() == p1.GONE){
             
             TransitionManager.beginDelayedTransition(LayoutOne,new AutoTransition());
             Javadetails.setVisibility(p1.VISIBLE);            
             Ccourse.setVisibility(p1.GONE);
             Banner.setVisibility(p1.GONE);
             WebvideoJ.setVisibility(p1.VISIBLE);
             bnv.setVisibility(p1.GONE);
            Team.setVisibility(p1.GONE); 
             }
         else {
          
             TransitionManager.beginDelayedTransition(LayoutOne,new AutoTransition());
             Javadetails.setVisibility(p1.GONE);             
             Ccourse.setVisibility(p1.VISIBLE);
       	  Banner.setVisibility(p1.VISIBLE);
             WebvideoJ.setVisibility(p1.GONE);
             bnv.setVisibility(p1.VISIBLE); 
            Team.setVisibility(p1.VISIBLE); 
         }         
          break; 
          
          
         case R.id.card_p:
         Toast.makeText(getActivity(),"Python Course ",Toast.LENGTH_SHORT).show();
           if(Pythondetails.getVisibility() == p1.GONE){
             
             TransitionManager.beginDelayedTransition(LayoutOne,new AutoTransition());
             Pythondetails.setVisibility(p1.VISIBLE);                          
             Javacourse.setVisibility(p1.GONE);
             Ccourse.setVisibility(p1.GONE);
             Banner.setVisibility(p1.GONE);             
             WebvideoP.setVisibility(p1.VISIBLE);
             bnv.setVisibility(p1.GONE);
            Team.setVisibility(p1.GONE); 
             
             }
         else {
          
             TransitionManager.beginDelayedTransition(LayoutOne,new AutoTransition());
             Pythondetails.setVisibility(p1.GONE);             
        //     Ccourse.setVisibility(p1.VISIBLE);
       	  Banner.setVisibility(p1.VISIBLE);
             Javacourse.setVisibility(p1.VISIBLE);
             Ccourse.setVisibility(p1.VISIBLE);
             WebvideoP.setVisibility(p1.GONE);             
             bnv.setVisibility(p1.VISIBLE);
            Team.setVisibility(p1.VISIBLE); 
         }         
          break; 
          
          case R.id.seeall:          
          Intent i = new Intent(getActivity(),CourseActivity.class);
          startActivity(i);          
          break;
          
        }
     }
        
/*       @Override
        public void onClick(View p1){
            
       switch(p1.getId()) {
         case R.id.card_j:
         Toast.makeText(getActivity(),"hello from fragmentTwo",Toast.LENGTH_SHORT).show();
           if(Javadetails.getVisibility() == p1.GONE){
             
             TransitionManager.beginDelayedTransition(LayoutOne,new AutoTransition());
             Javadetails.setVisibility(p1.VISIBLE);
 //            recyclerView.setVisibility(p1.VISIBLE);
             Ccourse.setVisibility(p1.GONE);
             }
         else {
          
             TransitionManager.beginDelayedTransition(LayoutOne,new AutoTransition());
             Javadetails.setVisibility(p1.GONE);
    //        recyclerView.setVisibility(p1.GONE);
             Ccourse.setVisibility(p1.VISIBLE);
         }         
          break; 
        }
            
            }  */
 
      
      
      
private void prepareCData() {
        Cmodel C = new Cmodel(" C tutorial for beginners");// "Action & Adventure", "2015");
        CList.add(C);
        C = new Cmodel("compile and run a C program with cmd");// "Animation, Kids & Family", "2015");
        CList.add(C);
        C = new Cmodel("comments & escape sequences"); //"Action", "2015");
        CList.add(C);
        C = new Cmodel("variables");// "Animation", "2015");
        CList.add(C);
        C = new Cmodel("data types format specifiers"); //"Science Fiction & Fantasy", "2015");
        CList.add(C);
        C = new Cmodel("constants"); // "Action", "2015");
        CList.add(C);
        C = new Cmodel("arithmetic operators");//"Animation", "2009");
        CList.add(C);
        C = new Cmodel("augmented assignment operators");// "Science Fiction", "2009");
        CList.add(C);
        C = new Cmodel("user input"); //"Animation", "2014");
        CList.add(C);
        C = new Cmodel("math functions"); // "Action & Adventure", "2008");
        CList.add(C);
        C = new Cmodel("circle circumference program"); //"Science Fiction", "1986");
        CList.add(C);
        C = new Cmodel("hypotenuse calculator program"); //"Animation", "2000");
        CList.add(C);
        C = new Cmodel("If statements"); //"Science Fiction", "1985");
        CList.add(C);
        C = new Cmodel("switch statements"); // "Action & Adventure", "1981");
        CList.add(C);
        C = new Cmodel("temperature conversion calculator program!"); // "Action & Adventure", "1965");
        CList.add(C);
        C = new Cmodel("AND logical operator &&"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("OR logical operator ||"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("NOT logical operator !"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("functions"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("arguments"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("return statement"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("ternary operator ?"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("function prototypes string functions"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("for loops"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("while loops"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("do while loop"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("nested loops"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("break vs continue"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("arrays"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("print an array with loop"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
       C = new Cmodel("2D arrays"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
       C = new Cmodel("array of strings"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
       C = new Cmodel("swap values of two variables"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
       C = new Cmodel("sort an arrays"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
       C = new Cmodel("structs"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
       C = new Cmodel("typedef"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
       C = new Cmodel("array of structs"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
       C = new Cmodel("enums"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
       C = new Cmodel("random numbers"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("number guessing game"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("quiz game"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("bitwise operators"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
        C = new Cmodel("memory addresses"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
       C = new Cmodel("pointers"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
       C = new Cmodel("writing files"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
       C = new Cmodel("reading files"); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
       C = new Cmodel("Tic Tac Toe game "); //"Science Fiction & Fantasy", "2014");
        CList.add(C);
                     
        cAdapter.notifyDataSetChanged();
        
       


        
        
      }
      
      
      @Override 
   public void onConfigurationChanged(@NonNull Configuration newConfig)    { 
       
       super.onConfigurationChanged(newConfig); 
       // Checks the orientation of the screen 
       if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) { 
           WebvideoC.enterFullScreen();
           WebvideoJ.enterFullScreen();
           WebvideoP.enterFullScreen();
            }
       else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){ 
           WebvideoC.exitFullScreen();
           WebvideoJ.exitFullScreen();
           WebvideoP.exitFullScreen();
            }                         
           }
   
        
     public void onBackPressed() {
 //   super.getActivity().onBackPressed();
        if (WebvideoC.isFullScreen() || WebvideoJ.isFullScreen() || WebvideoP.isFullScreen()){
            WebvideoC.exitFullScreen();
            WebvideoJ.exitFullScreen();
           WebvideoP.exitFullScreen();
           }            
        else
           super.getActivity().onBackPressed(); 
      }  
      
      
      
      
    }  




































