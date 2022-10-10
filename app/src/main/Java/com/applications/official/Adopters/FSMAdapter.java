package com.applications.official.Adopters;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.applications.official.Adopters.FSMAdapter;
import com.applications.official.models.FSMmodel;
import com.github.vipulasri.timelineview.TimelineView;
import java.lang.Override;
import java.util.List;
import android.view.View;
import com.applications.official.R;  

public class FSMAdapter extends RecyclerView.Adapter<FSMAdapter.MyViewHolder>{
   private List<FSMmodel> fsmlist; 
   public RecycleViewOnitemClickListener listener; 
   
	class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title; // year, genre;  
        private String T1,T2,T3,u1,u2,u3; 
      private  TimelineView mTimelineView; 
    
        
        MyViewHolder(View view,int viewType) {
           super(view); 
            title = view.findViewById(R.id.title);
            mTimelineView = (TimelineView) itemView.findViewById(R.id.timeline);
            mTimelineView.initLine(viewType);
		    
            view.setOnClickListener(this);
        
            
            
                    
        
    } 
    
   @Override
   public void onClick(View view){
       listener.onClick(view,getAdapterPosition());
       
       }
    
   } 
   public FSMAdapter(List<FSMmodel> fsmlist,RecycleViewOnitemClickListener listener) {
        this.fsmlist = fsmlist;
        this.listener = listener; 
    } 
    
   @NonNull 
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.movie_list, parent, false);
        return new MyViewHolder(itemView,viewType);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        FSMmodel C = fsmlist.get(position);
        holder.title.setText(C.getTitle());
     }
     
    @Override
    public int getItemCount() {
        return fsmlist.size();
    } 
    
   @Override
    public int getItemViewType(int position) {
        return TimelineView.getTimeLineViewType(position, getItemCount());
    }
    
    public interface RecycleViewOnitemClickListener{
        void onClick(View view,int position);
        }
    
}




