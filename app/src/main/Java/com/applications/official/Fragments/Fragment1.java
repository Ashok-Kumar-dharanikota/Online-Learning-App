package com.applications.official.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.applications.official.R;
import java.lang.Override;
import android.view.View;
import com.budiyev.android.imageloader.ImageLoader;

public  class Fragment1 extends Fragment {



        @Override
        public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
                       
       View view =  inflater.inflate(R.layout.fragment_home, container, false);
        
    
            ImageView img = view.findViewById(R.id.fragment_homeImageView);
            ImageView img1 = view.findViewById(R.id.fragment_homeImageView1);
            ImageView img2 = view.findViewById(R.id.fragment_homeImageView2);
            ImageView img3 = view.findViewById(R.id.fragment_homeImageView3);
            ImageView img4 = view.findViewById(R.id.fragment_homeImageView4);
            ImageView img5 = view.findViewById(R.id.fragment_homeImageView5);
            ImageView img6 = view.findViewById(R.id.fragment_homeImageView6);
            ImageView img7 = view.findViewById(R.id.fragment_homeImageView7);
     //       ImageView img8 = view.findViewById(R.id.fragment_homeImageViewprofile);
            
            
      //      ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeTgyoKGzWDmHWw_a5bHWZjraskmX3Ge1GPA&usqp=CAU").load(img8);
            ImageLoader.with(getActivity()).from("https://img-cdn.inc.com/image/upload/w_970,h_450,c_fill/images/panoramic/getty_1075599562_hpy86b.jpg").load(img);
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQog_QZzo2TkQirj8FyTMKEwyCb-kvi75dKhA&usqp=CAU").load(img1);
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTek6tcC0-a9KfJIbOKZcmaRC6-J8iVJ53Q1A&usqp=CAU").load(img2);
    
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBiuAn6SEqitWkio1hMaiIRdryOOQPlZykmg&usqp=CAU").load(img3);
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4vcajrJa_XvdAi5B72AzxXbHETCegLJBxgg&usqp=CAU").load(img4);
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSj1KaK_lLT8uU0B9Q6tHvTHSAPcLTIpxMQUQ&usqp=CAU").load(img5);
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzF8Gr6cvFqcNFnkGydraIusBJC8B7qScwRg&usqp=CAU").load(img6);
            ImageLoader.with(getActivity()).from("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBcq9WKM92FHOdGro3fptT_OcvI1SsA9qn7Q&usqp=CAU").load(img7);
        
            
    /*        ImageView img[]  = {view.findViewById(R.id.fragment_homeImageView),
                view.findViewById(R.id.fragment_homeImageView1),
                view.findViewById(R.id.fragment_homeImageView2),
                view.findViewById(R.id.fragment_homeImageView3),
                view.findViewById(R.id.fragment_homeImageView4),
                view.findViewById(R.id.fragment_homeImageView5),
                view.findViewById(R.id.fragment_homeImageView6),
                view.findViewById(R.id.fragment_homeImageView7)
            };    
            
            String imgurl[] =  {"https://img-cdn.inc.com/image/upload/w_970,h_450,c_fill/images/panoramic/getty_1075599562_hpy86b.jpg",
                                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQog_QZzo2TkQirj8FyTMKEwyCb-kvi75dKhA&usqp=CAU",
                                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTek6tcC0-a9KfJIbOKZcmaRC6-J8iVJ53Q1A&usqp=CAU",
                                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBiuAn6SEqitWkio1hMaiIRdryOOQPlZykmg&usqp=CAU",
                                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4vcajrJa_XvdAi5B72AzxXbHETCegLJBxgg&usqp=CAU",
                                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSj1KaK_lLT8uU0B9Q6tHvTHSAPcLTIpxMQUQ&usqp=CAU",
                                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzF8Gr6cvFqcNFnkGydraIusBJC8B7qScwRg&usqp=CAU",
                                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBcq9WKM92FHOdGro3fptT_OcvI1SsA9qn7Q&usqp=CAU"
        
                                
                                
                                };
            
            for(int i=0;i<=8;i++) {
                
                ImageLoader.with(getActivity()).from(imgurl[i]).load(img[i]);
                
                
                
            }
            
            
            */
            
              
              
            
    
              
       /*       cardC.setOnClickListener(new View.OnClickListener(){
                  
                  @Override
                  public void onClick(View p1) {
                      
                     
                     
                      
                  }             
                  
                  
              });  */
              
            
            return view;
            }  
  
 } 


