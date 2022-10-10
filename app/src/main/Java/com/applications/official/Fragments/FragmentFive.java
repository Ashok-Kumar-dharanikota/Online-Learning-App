package com.applications.official.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.applications.official.First_Session_Activity;
import com.applications.official.Fragments.FragmentFive;
import com.applications.official.R;
import com.applications.official.Second_Session_Activity;
import com.applications.official.Third_Session_Activity;
import java.lang.Override;
import android.view.View;

public  class FragmentFive extends Fragment implements View.OnClickListener {

public FragmentFive() {}

private CardView Second_session_C,Third_session_C; 

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
           View view = inflater.inflate(R.layout.fragment_12wyp, container, false);

CardView First_session_C  = view.findViewById(R.id.session1_c);
First_session_C.setOnClickListener(this);

Second_session_C = view.findViewById(R.id.session2_c);
Second_session_C.setOnClickListener(this);

Third_session_C = view.findViewById(R.id.session3_c);
Third_session_C.setOnClickListener(this);

        return view;
        }
        
    @Override
    public void onClick(View p1) {
        
        switch(p1.getId()){
            
            case R.id.session1_c:
            Intent i = new Intent(getActivity(),First_Session_Activity.class);
            startActivity(i);
            break;
            
            case R.id.session2_c:
            Toast.makeText(getActivity(),"Sheduled on:1/5/2022",Toast.LENGTH_SHORT).show();
            break;
            
            case R.id.session3_c:
            Toast.makeText(getActivity(),"Sheduled on:1/6/2022",Toast.LENGTH_SHORT).show();
            break;
            
            }
        
        }   
        
    } 






