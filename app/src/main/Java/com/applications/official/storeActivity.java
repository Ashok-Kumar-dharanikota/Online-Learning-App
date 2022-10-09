package com.applications.official;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
//import i.d;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
// import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.applications.official.BottomSheetDialog;
import com.budiyev.android.imageloader.ImageLoader;
import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import com.applications.official.Fragments.FragmentOne;
import com.applications.official.Fragments.FragmentTwo;
import com.applications.official.Fragments.Fragment3;
import com.applications.official.Fragments.Fragment4;
import com.applications.official.Fragments.FragmentFive;



//import com.itsaky.androidide.logsender.LogSender;


public class storeActivity extends AppCompatActivity {

  private TextView sname,smail,snumber,spassward;
  private NavigationView menudrawer; 
  private FloatingActionButton Team;
  private DrawerLayout Mydrawerlayout;
  
  
    public static final String SHARED_PREF_NAME = "mypref";
    public static final String KEY_NAME = "name";
    public static final String KEY_MAIL = "mail";
     SharedPreferences mysharedprefarance;
        
  private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
 
          
      
  		 
                
               
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                
                  fragment = new FragmentOne();
                break;
                    
    //            loadFragment(new FragmentItem("Item 1"));
    //            return true;
                case R.id.navigation_courses:
                fragment = new FragmentTwo();
                    break;
                    
                    
//                 loadFragment(new FragmentItem("Item 2"));
   //                 return true;
                case R.id.navigation_code:
                    fragment = new Fragment3();
                    break;
                    
                    
   //                 loadFragment(new FragmentItem("Item 3"));
   //                return true;
                case R.id.navigation_projects:
                    fragment = new Fragment4();
                    break;
                    
                case R.id.navigation_12wyp:
                    fragment = new FragmentFive();
                    break;
     //               loadFragment(new FragmentItem("Item 4"));
      //              return true;
            }
            
    //        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,fragment).commit();

	 	FragmentManager manager = getSupportFragmentManager();
         FragmentTransaction transaction = manager.beginTransaction();
         transaction.replace(R.id.frame_container ,fragment);
         transaction.commit();

            return true;
        
        }
    };
   
    
    private NavigationView.OnNavigationItemSelectedListener onDrawerclickListenr
    		 = new NavigationView.OnNavigationItemSelectedListener() {
                 
                 @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                
                  fragment = new FragmentOne();
                break;
                    
    //            loadFragment(new FragmentItem("Item 1"));
    //            return true;
                case R.id.navigation_courses:
                fragment = new FragmentTwo();
                    break;
                    
                    
//                 loadFragment(new FragmentItem("Item 2"));
   //                 return true;
                case R.id.navigation_code:
                    fragment = new Fragment3();
                    break;
                    
                    
   //                 loadFragment(new FragmentItem("Item 3"));
   //                return true;
                case R.id.navigation_projects:
                    fragment = new Fragment4();
                    break;
                    
                case R.id.navigation_12wyp:
                    fragment = new FragmentFive();
                    break;
                    
                case R.id.nav_feedback:
                Toast.makeText(getApplicationContext(),"Feedback disabled ",Toast.LENGTH_SHORT).show();
     		   	break;
                    
                case R.id.nav_contact_us:
                Toast.makeText(getApplicationContext(),"Contact Us disabled ",Toast.LENGTH_SHORT).show();
     		   	break;
                    
                case R.id.nav_about_us:
                Toast.makeText(getApplicationContext(),"About Us disabledv",Toast.LENGTH_SHORT).show();
     		   	break;
                    
                case R.id.nav_settings:
                Toast.makeText(getApplicationContext(),"default Settings applied",Toast.LENGTH_SHORT).show();
     		   	break;
                    
                case R.id.nav_logout:
                Toast.makeText(getApplicationContext(),"Log out disabled",Toast.LENGTH_SHORT).show();
     		   	break;
           
            }
            
    //        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,fragment).commit();
		if(fragment != null) {
	 	FragmentManager manager = getSupportFragmentManager();
         FragmentTransaction transaction = manager.beginTransaction();
         transaction.replace(R.id.frame_container ,fragment);
         transaction.commit();
		}        

     Mydrawerlayout.closeDrawer(GravityCompat.START);
            return true;
        
        } 
                 
                 
                 
                 };
                 
                 
             
             
      
   
  @Override
  protected void onCreate(Bundle savedInstanceState) {
 //    LogSender.startLogging(this);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_store);
  
//   Intent intent = getIntent();
  
    
    sname = findViewById(R.id.store_text);
    smail = findViewById(R.id.store_text1);
    snumber = findViewById(R.id.store_text2);
    spassward = findViewById(R.id.store_text3);
    
    Team = findViewById(R.id.fab);
    Team.setOnClickListener(new View.OnClickListener(){
        
        @Override
            public void onClick(View v) {
	
    	BottomSheetDialog bottomSheet = new BottomSheetDialog(); 
        bottomSheet.show(getSupportFragmentManager(),"ModalBottomSheet");

                   
            }
        
        
        });
    
    
//    Intent intent = getIntent();
 /*   String Sname = intent.getStringExtra("uname");
    String Smail = intent.getStringExtra("umail");
    String Snumber = intent.getStringExtra("unumber");
    String Spassward = intent.getStringExtra("upassward");
    
    
    sname.setText(Sname);
    smail.setText(Smail);
    snumber.setText(Snumber);
    spassward.setText(Spassward); */
   
   
    
   
    BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.Navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
  
  mysharedprefarance = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE); 
  
  	String name =  mysharedprefarance.getString(KEY_NAME,null);
         String mail = mysharedprefarance.getString(KEY_MAIL,null);  
    
      Mydrawerlayout = findViewById(R.id.mydrawerlayout);
     NavigationView Navi_drawer = findViewById(R.id.menu_drawer);
    Navi_drawer.setNavigationItemSelectedListener(onDrawerclickListenr); 
      View navi_header = Navi_drawer.getHeaderView(0);
      TextView Name = navi_header.findViewById(R.id.uname);
      TextView Email = navi_header.findViewById(R.id.umail);
      Name.setText(name);
      Email.setText(mail); 
      
    
  //  getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Fragment1()).commit();
    
    
    FragmentManager  manager1 = getSupportFragmentManager();
        FragmentTransaction transaction1 = manager1.beginTransaction();
        transaction1.replace(R.id.frame_container, new FragmentOne());
        transaction1.commit();
       
       
       
       
       
       
       

   }
   
   
    
   
       
       
       }
   
    
   
   
   
      
  
  
  
  
  
  
  
 
 
 
 
    
    
    
    
    
    
    
    
    
    
    
 
 
  
   































