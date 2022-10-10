package com.applications.official.Fragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.applications.official.CourseActivity;
import com.applications.official.Fragments.FragmentOne;
import com.applications.official.R;
import java.lang.Override;
import android.view.View;
import com.budiyev.android.imageloader.ImageLoader;

public class FragmentOne extends Fragment implements  View.OnClickListener {

private TextView Name;
public FragmentOne(){ }
public static final String SHARED_PREF_NAME = "mypref"; 
public static final String KEY_NAME = "name"; 

  SharedPreferences  mysharedprefarance; 

        @Override
        public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
                       
       View view =  inflater.inflate(R.layout.fragment_home, container, false);
        
              
    		Name = view.findViewById(R.id.name);
        //    Name.setText("Welcome\n "+Sname);
   mysharedprefarance =  getActivity().getSharedPreferences(SHARED_PREF_NAME,0);    
         
    		
            String name = mysharedprefarance.getString(KEY_NAME,null); 
            Name.setText("Welcome 🎊\n"+name);  
    
    
            ImageView img = view.findViewById(R.id.fragment_homeImageView);
            ImageView img1 = view.findViewById(R.id.fragment_homeImageView1);
            ImageView img2 = view.findViewById(R.id.fragment_homeImageView2);
            ImageView img3 = view.findViewById(R.id.fragment_homeImageView3);
            ImageView img4 = view.findViewById(R.id.fragment_homeImageView4);
            ImageView img5 = view.findViewById(R.id.fragment_homeImageView5);
            ImageView img6 = view.findViewById(R.id.fragment_homeImageView6);
            ImageView img7 = view.findViewById(R.id.fragment_homeImageView7);
     //       ImageView img8 = view.findViewById(R.id.fragment_homeImageViewprofile);
            
            CardView Cardprogram = (CardView) view.findViewById(R.id.card_programmimg);
            CardView Carduiux = (CardView) view.findViewById(R.id.uiux_card);
            CardView Cardss =  (CardView) view.findViewById(R.id.ss_card);
            CardView Cardaptitude = (CardView) view.findViewById(R.id.aptitude_card);
            
            
      //      ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeTgyoKGzWDmHWw_a5bHWZjraskmX3Ge1GPA&usqp=CAU").load(img8);
            ImageLoader.with(getActivity()).from("https://img-cdn.inc.com/image/upload/w_970,h_450,c_fill/images/panoramic/getty_1075599562_hpy86b.jpg").load(img);
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQog_QZzo2TkQirj8FyTMKEwyCb-kvi75dKhA&usqp=CAU").load(img1);
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTek6tcC0-a9KfJIbOKZcmaRC6-J8iVJ53Q1A&usqp=CAU").load(img2);
    
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBiuAn6SEqitWkio1hMaiIRdryOOQPlZykmg&usqp=CAU").load(img3);
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4vcajrJa_XvdAi5B72AzxXbHETCegLJBxgg&usqp=CAU").load(img4);
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSj1KaK_lLT8uU0B9Q6tHvTHSAPcLTIpxMQUQ&usqp=CAU").load(img5);
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzF8Gr6cvFqcNFnkGydraIusBJC8B7qScwRg&usqp=CAU").load(img6);
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBcq9WKM92FHOdGro3fptT_OcvI1SsA9qn7Q&usqp=CAU").load(img7);
        
            
            Cardprogram.setOnClickListener(this);
            Carduiux.setOnClickListener(this);
            Cardss.setOnClickListener(this);
            Cardaptitude.setOnClickListener(this);
            
            img4.setOnClickListener(this);
            img5.setOnClickListener(this);
            img6.setOnClickListener(this);
            img7.setOnClickListener(this);
            
  
              
            
            return view;
            }  
  
  @Override
  public void onClick(View p1){
      
     Intent i0 = new Intent(getActivity(),CourseActivity.class);
         startActivity(i0);
  /*    
      switch(p1.getId()) {
         case R.id.card_programmimg:
    //     Toast.makeText(getActivity(),"hello from fragment",Toast.LENGTH_SHORT).show();
         Intent i0 = new Intent(getActivity(),CourseActivity.class);
         startActivity(i0);
          break;  
          
          case R.id.uiux_card:
          Intent i1 = new Intent(getActivity(),CourseActivity.class);
          startActivity(i1);
          break;
          
          case R.id.ss_card:
          Intent i2 = new Intent(getActivity(),CourseActivity.class);
          startActivity(i2);
          break; 
          
          case R.id.aptitude_card:
          Intent i3 = new Intent(getActivity(),CourseActivity.class);
          startActivity(i3);
          break;
          
          case default:
          Intent d = new Intent(getActivity(),CourseActivity.class);
          startActivity(d);
          break; 
          }      */
      }
  
  
  
 } 















