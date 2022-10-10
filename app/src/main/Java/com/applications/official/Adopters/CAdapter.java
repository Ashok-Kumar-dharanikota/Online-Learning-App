package com.applications.official;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.applications.official.ItemClickListener;
import com.github.vipulasri.timelineview.TimelineView;
import java.lang.Override;
import java.util.List;

import com.applications.official.MovieModel;

public class CAdapter extends RecyclerView.Adapter<CAdapter.MyViewHolder> {
    private List<Cmodel> CList;
   public ItemClickListener clickListener; 
    
    
    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
        TextView title; // year, genre;
        CardView items;
 public TimelineView mTimelineView;
 

        
        MyViewHolder(View view,int viewType) {
            super(view);
         
            title = view.findViewById(R.id.title);
            items = view.findViewById(R.id.item1);
            mTimelineView = (TimelineView) itemView.findViewById(R.id.timeline);
            mTimelineView.initLine(viewType);
            
            view.setTag(view);
            view.setOnClickListener(this);
            title.setOnClickListener(this);
        /*    genre = view.findViewById(R.id.genre);
            year = view.findViewById(R.id.year);  */
             
        
    }
    
    
      @Override
        public void onClick(View view) {
           if (clickListener != null) clickListener.onClick(view,getAdapterPosition());
           
        }
    
    
   } 
   public CAdapter(List<Cmodel> CList) {
        this.CList = CList;
  
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
        Cmodel C = CList.get(position);
        holder.title.setText(C.getTitle());
  /*      holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear()); */
    }
    @Override
    public int getItemCount() {
        return CList.size();
    }
    
   public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }
    
 
    
    
   @Override
    public int getItemViewType(int position) {
        return TimelineView.getTimeLineViewType(position, getItemCount());
    }
    
    
    
}
















