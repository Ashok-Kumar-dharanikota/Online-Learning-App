 package com.applications.official.Adopters;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.applications.official.Adopters.WYPAdapter;
import com.applications.official.ItemClickListener;
import com.applications.official.R;
import com.applications.official.models.WYPModel;
import com.github.vipulasri.timelineview.TimelineView;
import java.lang.Override;
import java.util.ArrayList;
import java.util.List; 
import android.view.View;

public class WYPAdapter extends RecyclerView.Adapter<WYPAdapter.WYPHolder> {
    
    private List<WYPModel> wyplist;
    
    
    
    class WYPHolder extends RecyclerView.ViewHolder implements  View.OnClickListener {
             TextView Day,T1,T2,T3; 
             public TimelineView mTimelineview;
            LinearLayout Expandablelayout;
        
           WYPHolder(View view,int ViewType){
            super(view);
            
            Day = view.findViewById(R.id.day);
            T1  = view.findViewById(R.id.t1);
            T2  = view.findViewById(R.id.t2);
            T3  = view.findViewById(R.id.t3);
            Expandablelayout = view.findViewById(R.id.expandablelayout); 
            
            
            mTimelineview = itemView.findViewById(R.id.timeline);
            mTimelineview.initLine(ViewType);
            
            Day.setOnClickListener(this);
            
                        
            }
            
            @Override
            public void onClick(View v){
                WYPModel task = wyplist.get(getAdapterPosition());
                task.setExpand(!task.isExpand());
                notifyItemChanged(getAdapterPosition());
                
                }
         
         
        
        
        
        }
        
     public WYPAdapter(List<WYPModel> wyplist) {    
        this.wyplist = wyplist;
         }      
     
     @NonNull
     @Override
     public WYPHolder onCreateViewHolder(ViewGroup parent,int ViewType){
         
         View itemview = LayoutInflater.from(parent.getContext()).
         inflate(R.layout.wyplayout,parent,false);         
         return new WYPHolder(itemview,ViewType);         
         }
     @Override
     public void onBindViewHolder(WYPHolder wypholder,int positon){
         WYPModel wyp = wyplist.get(positon);
         wypholder.Day.setText(wyp.getDay());
         wypholder.T1.setText(wyp.getT1());
         wypholder.T2.setText(wyp.getT2());
         wypholder.T3.setText(wyp.getT3()); 
         
         boolean isExpand = wyplist.get(positon).isExpand();
         wypholder.Expandablelayout.setVisibility(isExpand ? View.VISIBLE:View.GONE);
         
         
        
         }   
     
     @Override
     public int getItemCount(){
         return wyplist.size();         
         }
         
    
    
    
    @Override
    public int getItemViewType(int position) {
        return TimelineView.getTimeLineViewType(position, getItemCount());
    }
    
    
}








