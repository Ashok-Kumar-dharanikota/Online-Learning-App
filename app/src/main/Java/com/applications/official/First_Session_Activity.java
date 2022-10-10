package com.applications.official;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcelable;
import android.view.View;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.applications.official.Adopters.FSMAdapter;
import com.applications.official.Adopters.MovieAdapter;
import com.applications.official.CAdapter;
import com.applications.official.Cmodel;
import com.applications.official.First_Session_Activity;
import com.applications.official.ItemClickListener;
import com.applications.official.FSMActivity;
import com.applications.official.models.FSMmodel;
import com.applications.official.models.Movie;
import com.applications.official.models.ItemUrl;
import com.google.android.youtube.player.YouTubeInitializationResult;
//import com.google.android.youtube.player.YouTubePlayer;
//import com.google.android.youtube.player.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.lang.Override;
import java.util.ArrayList;
import java.util.List; 
import com.itsaky.androidide.logsender.LogSender;
import org.parceler.Parcels;
import android.widget.TextView;  
 
 
public class First_Session_Activity extends AppCompatActivity  {
   
/*    private  List<WYPModel> wypList ;
    private  WYPAdapter wyponeAdapter; 
    private RecyclerView first_session_module;  */
  
  private int Urlno; 
   RecyclerView recyclerView;
	private FSMAdapter.RecycleViewOnitemClickListener listener; 
    List<FSMmodel> fsmList = new ArrayList<>();
     
     FSMAdapter fsmAdapter;
    

  private  Parcelable parcelable,parcelable1;
  private FSMmodel user;
   Bundle extras;
   int Lockposition,i=1;
  private boolean[] Lock = {true,true,true,true,true};
   
    public static final String SHARED_PREF_NAMER = "mypref";
    public static final String KEY_POSITIONR = "Position";
    SharedPreferences  mysharedprefarance2;


   
  @Override
  protected void onCreate(Bundle savedInstanceState) {
     LogSender.startLogging(this);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_first_session);
    
         recyclerView = findViewById(R.id.recyclerView);                        
           initData(i); 
           initRecyclerView();  
  


         

       
        
}	
    
    

private void initRecyclerView() {
    	
   	 setOnClickListener(); 
        fsmAdapter  = new FSMAdapter(fsmList,listener);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(fsmAdapter);
		
    }

 
 public void setOnClickListener(){
    listener = new FSMAdapter.RecycleViewOnitemClickListener(){
       
	         
        @Override
        public void onClick(View v,int position){
          
          FSMmodel F = fsmList.get(position);
          
            
          
            Intent intent = new Intent(First_Session_Activity.this,FSMActivity.class);
            intent.putExtra("title",fsmList.get(position).getTitle());
            intent.putExtra("duration",fsmList.get(position).getDuration());
            intent.putExtra("DATE_KEY", parcelable);
            intent.putExtra("position",position);
            intent.putExtra("T1",fsmList.get(position).getT1());
            intent.putExtra("T2",fsmList.get(position).getT2());
            intent.putExtra("T3",fsmList.get(position).getT3());
            intent.putExtra("u1",fsmList.get(position).gtU1());
            intent.putExtra("u2",fsmList.get(position).getU2());
            intent.putExtra("u3",fsmList.get(position).getU3());                     
            startActivity(intent); 
                
         }
        }; 
     }

  
  private void initData(int S) { 

      if(S==1){ 
       FSMmodel F = new FSMmodel("DAY - 1","25mins","Java tutorial for beginners","Variables","Swap two Variables","NBIUbTddde4","so1iUWaLmKA","G0mFJUFMzjs",false); //,true);// "Action & Adventure", "2015");
       fsmList.add(F);
        F = new FSMmodel("DAY - 2","25mins","User Input ","Java Expressions","Java Math Class","wAEPokhj5Q4","pZHJU9T0vwE","w0VTlSOXBs8",Lock[1]); //,true);// "Action & Adventure", "2015");
        fsmList.add(F);                           
        F = new FSMmodel("DAY - 3","25mins","Random numbers ","if statements","Switch statements","VMZLPl16P5c","MY03bt_0JQI","Om3qzMoaIUo",Lock[2]); //,true);// "Action & Adventure", "2015");
        fsmList.add(F);      
        F = new FSMmodel("DAY - 4","25mins","Logical Operators ","While loop","For loop","919IUhotDCo","t6gmQaTMTtM","Rn16ugyorX0",Lock[3]); //,true);// "Action & Adventure", "2015");
        fsmList.add(F);      
        F = new FSMmodel("DAY - 5","25mins","Nested Loops","Arrays","2D Arrays","oF3nBQFfpeM","ei_4Nt7XWOw","alwukGslBG8",true); //,true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 6","25mins","String method","Wrapper Class","ArrayList","P9hEmbfdiuc","4MiEznM8y8Q","1nRj4ALuw7A",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 7","25mins","2D ArrayList","for each loop","Java method","9tBxJoQF74E","_IT8F5W0ZO4","v5p_SUfi710",true);// "Action & Adventure", "2015");
        fsmList.add(F);  
        F = new FSMmodel("DAY - 8","25mins","Overload method","printf","final Keyword","kArGE1-vRrw","c2B_Av3x65s","DezKSLQ0-ls" ,true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 9","25mins","Objects(OOPS) ","Constructors","Variable scope ","kd3dr39rgrk","lhf8gaUx4yU","pSokndJB3Pw" ,true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 10","25mins","Overload Constructor ","toString method","Array of Objects","Xngu-8pt_TA","GvbdMwfjB98","nhIB2S6NiFA",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 11","25mins","Object Passing ","Static Keyword","Inheritance(OOPS) ","nRJWltqX4UY","wa1HzkMqY9A","Zs342ePFvRI" ,true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 12","25mins","Method Overriding","Super Keyword","Abstraction(OOPS) ","E-0MMeNi5Cw","oKZnHNM9Ew4","Lvnb83qt57g",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 13","25mins","Access Modifiers","Encapsulation(OOPS) ","Copy objects","T632kAJ_9VA","eboNNUADeIc","ljGH04_ASG4" ,true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 14","25mins","Interface","Polymorphism(OOPS)","Dynamic Polymorphism","GhslBwrRsnw","2hkngtWLGvE","tAIaK5LNatE" ,true);// "Action & Adventure", "2015");
        fsmList.add(F);    
        F = new FSMmodel("DAY - 15","25mins","Exception Handling","FILE Class","FIle Writer","adTDlH0lhaA","MwYRVKfb2M0","kjzmaJPoaNc" ,true);// "Action & Adventure", "2015");
        fsmList.add(F);
        F = new FSMmodel("DAY - 16","25mins","File Reader","audio","GUI","Hr8tLlj32BQ","SyZQVJiARTQ","7GaAW-DdPuI",true);// "Action & Adventure", "2015");
        fsmList.add(F);                           
        F = new FSMmodel("DAY - 17","25mins","labels","Panels","Buttons","FR2UptJyaSM","dvzAuq-YDpM","-IMys4PCkIA",true);// "Action & Adventure", "2015");
        fsmList.add(F);      
        F = new FSMmodel("DAY - 18","25mins","BorderLayout","FlowLayout","GridLayout ","PD6pd6AMoOI","pDqjHozkMBs","ohNqQagkDDY",true);// "Action & Adventure", "2015");
        fsmList.add(F);      
        F = new FSMmodel("DAY - 19","25mins","LayeredPane","Open a new GUI window","JOptionPane","CmK1nObLxiw","HgkBvwgciB4","BuW7y21FcYI",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 20","25mins","TextField ","CheckBox","Radio Button","dyDDUndlMnU","GwxvLzQoMYM","bn2KdCLqHlg",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 21","25mins","Cambo Box ","Slider","progress bar","EAxV_eoYrIg","-rJdMaSgt38","JEI-fcfnFkc",true);// "Action & Adventure", "2015");
        fsmList.add(F);  
        F = new FSMmodel("DAY - 22","25mins","menu bar ","Select a file","Color Chooser","7nEal9SJ6oI","A6sA9KItwpY","zEw8xObSWNA",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 23","25mins","KeyListener","MouseListener","Drag & Drop","BJ7fr9XwS2o","jptf1Wd_omw","_fsee3Nu15U",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 24","25mins","Key Binding","2D graphics","2D Animations","IyfB0u9g2x0","KcEvHq8Pqs0","tHNWIWxRDDA",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 25","25mins","Generics","Serialization","TimerTask","jUcAyZ5OUm0","DfbFTVNfkeI","QEF62Fm81h4",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 26","25mins","Threads","Multi-threading","Packages","a_LBuCx1KTE","J09TLPgwd0Y","NZ7NfZD8T2Y",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 27","25mins","Classes & objects","Methods","OOPS:Inheritance","cXj1hHdMNk4","r0SewFmbCUI","nixQyPIAnOQ",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 28","25mins","OOPS:Abstraction","OOPS:Polymorphism","OOPS:Encapsulation","5X0Y--92pMI","jg4MpYr1TBc","QFl9HhrpRFA",true);// "Action & Adventure", "2015");
        fsmList.add(F);  
          
       
       else if(S==2){
        
        FSMmodel F = new FSMmodel("DAY - 1","25mins","Python tutorial for beginners","Variables","Multiple Assignments ","6VElWbND-zg","dHcCbxTfwoU","W9VOiVkUazA",false); //,true);// "Action & Adventure", "2015");
        fsmList.add(F);
        F = new FSMmodel("DAY - 2","25mins","String Methods ","Type Casting","User input","Crw3rVFNwIM","2WZvl1R4A6g","DB9Cq6TSTuQ",Lock[1]); //,true);// "Action & Adventure", "2015");
        fsmList.add(F);                           
        F = new FSMmodel("DAY - 3","25mins","Python Math function","String Slicing","if statements","gktjNyV0xks","wGlnsJFnGAI","Om3qzMoaIUo",Lock[2]); //,true);// "Action & Adventure", "2015");
        fsmList.add(F);      
        F = new FSMmodel("DAY - 4","25mins","Logical Operators ","While loop","For loop","919IUhotDCo","t6gmQaTMTtM","DCY6rg9ycPA",Lock[3]); //,true);// "Action & Adventure", "2015");
        fsmList.add(F);      
        F = new FSMmodel("DAY - 5","25mins","Nested Loops","Break,Continue,pass","Lists ","K47w0cpRLt4","rP4p0luqvR8","rP4p0luqvR8",true); //,true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 6","25mins","2D List ","Tuples","sets","ZHdai11Xga0","qwvswinpu2s","97NdNoA3XUQ",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 7","25mins","Dictionaries ","Indexing","Functions ","SfX8IIxoJwQ","EWbET9xdHUE","w6hL_dszMxk",true);// "Action & Adventure", "2015");
        fsmList.add(F);  
        F = new FSMmodel("DAY - 8","25mins","Return statement ","Keyword Argument","nested function calls","qv41OR37Syo","wa1XcMSBWdA","ISfxEV4b7po" ,true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 9","25mins","Variables Scope ","Python args","Python Kwargs ","vg7Hwd9TANY","ZnBQfF5JFDM","Tu0lFBXQgPw" ,true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 10","25mins","String Format","Random numbers ","Exception Handling ","Xngu-8pt_TA","GvbdMwfjB98","nhIB2S6NiFA",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 11","25mins","File detection  ","Read a file","Write a file","nRJWltqX4UY","wa1HzkMqY9A","Zs342ePFvRI" ,true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 12","25mins","Copy a file ","Move a file ","Delete a file","E-0MMeNi5Cw","oKZnHNM9Ew4","Lvnb83qt57g",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 13","25mins","RPS game program ","Quiz game program ","OOPS in Python","T632kAJ_9VA","eboNNUADeIc","ljGH04_ASG4" ,true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 14","25mins","Class variable","Inheritance()","Multilevel-Inheritance ","GhslBwrRsnw","2hkngtWLGvE","tAIaK5LNatE" ,true);// "Action & Adventure", "2015");
        fsmList.add(F);    
        F = new FSMmodel("DAY - 15","25mins","Multiple Inheritance","Method Overriding ","Method Chaining ","adTDlH0lhaA","MwYRVKfb2M0","kjzmaJPoaNc" ,true);// "Action & Adventure", "2015");
        fsmList.add(F);
        F = new FSMmodel("DAY - 16","25mins","Super function","abstract classes","Objects as arguments","Hr8tLlj32BQ","SyZQVJiARTQ","7GaAW-DdPuI",true);// "Action & Adventure", "2015");
        fsmList.add(F);                           
        F = new FSMmodel("DAY - 17","25mins","Duck typing","Walrus operators","Higher order function","FR2UptJyaSM","dvzAuq-YDpM","-IMys4PCkIA",true);// "Action & Adventure", "2015");
        fsmList.add(F);      
        F = new FSMmodel("DAY - 18","25mins","Lambda","Python Sort","Python map ","PD6pd6AMoOI","pDqjHozkMBs","ohNqQagkDDY",true);// "Action & Adventure", "2015");
        fsmList.add(F);      
        F = new FSMmodel("DAY - 19","25mins","Python filter","Python reduce","list Comprehension","CmK1nObLxiw","HgkBvwgciB4","BuW7y21FcYI",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 20","25mins","Python directory ","Zip function","__main__","dyDDUndlMnU","GwxvLzQoMYM","bn2KdCLqHlg",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 21","25mins","time module","Multithreading","daemon threads","EAxV_eoYrIg","-rJdMaSgt38","JEI-fcfnFkc",true);// "Action & Adventure", "2015");
        fsmList.add(F);  
        F = new FSMmodel("DAY - 22","25mins","Multi-processing","GUI window","labels","7nEal9SJ6oI","A6sA9KItwpY","zEw8xObSWNA",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 23","25mins","Button","entry box","GUI checkbox ","BJ7fr9XwS2o","jptf1Wd_omw","_fsee3Nu15U",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 24","25mins","GUI radio button ","GUI scale","GUI listbox","IyfB0u9g2x0","KcEvHq8Pqs0","tHNWIWxRDDA",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 25","25mins","message box","color chooser","Text Area","jUcAyZ5OUm0","DfbFTVNfkeI","QEF62Fm81h4",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 26","25mins","GUI open a file","Save a file","menu bar","a_LBuCx1KTE","J09TLPgwd0Y","NZ7NfZD8T2Y",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 27","25mins","Class & Objects","Methods ","OOPS:Inheritance","cXj1hHdMNk4","r0SewFmbCUI","nixQyPIAnOQ",true);// "Action & Adventure", "2015");
        fsmList.add(F);   
        F = new FSMmodel("DAY - 28","25mins","OOPS:Abstraction","OOPS:Polymorphism","OOPS:Encapsulation","5X0Y--92pMI","jg4MpYr1TBc","QFl9HhrpRFA",true);// "Action & Adventure", "2015");
        fsmList.add(F);
        
        parcelable = Parcels.wrap(F); } */
        
           
      }   
        
        
    }

