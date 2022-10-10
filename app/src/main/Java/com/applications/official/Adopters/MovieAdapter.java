package com.applications.official.Adopters;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;

import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.applications.official.Adopters.MovieAdapter;
import com.applications.official.Fragments.FragmentFive;
import com.applications.official.R;
import com.applications.official.models.ItemUrl;
import com.applications.official.models.Movie;
import com.github.vipulasri.timelineview.TimelineView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.lang.Override;
import java.net.URL;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieVH> {
    
 //   private OnItemsClickListener listener;
    
	public String Url; 
    public int urlT1,urlT2,urlT3;
    public int  urlposition;
    private static final String TAG = "MovieAdapter";
    List<Movie> movieList;
    ItemUrl v = new ItemUrl();
      

	public MovieAdapter() {} 

    public MovieAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }



    @NonNull
    @Override
    public MovieVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row, parent, false);
        return new MovieVH(view,viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieVH holder, int position) {

        Movie movie = movieList.get(position);
        holder.titleTextView.setText(movie.getTitle());
 //       holder.yearTextView.setText(movie.getYear());
        holder.ratingTextView.setText(movie.getRating());
 //       holder.plotTextView.setText(movie.getPlot());

		holder.T1.setText(movie.getT1());
		holder.T2.setText(movie.getT2());
		holder.T3.setText(movie.getT3());
		
       
       
        
        
	
        boolean isExpanded = movieList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

    }
    
    
    

    @Override
    public int getItemCount() {
        return movieList.size();
    }
    
   @Override
    public int getItemViewType(int position) {
        return TimelineView.getTimeLineViewType(position, getItemCount());
    }
    

    class MovieVH extends RecyclerView.ViewHolder  implements View.OnClickListener  {

        private static final String TAG = "MovieVH";
	
	    YouTubePlayerView Webvideo; 
        ConstraintLayout expandableLayout;
        TextView titleTextView, yearTextView, ratingTextView, plotTextView,T1,T2,T3;
		public TimelineView mTimelineview;
        public MovieVH(@NonNull final View itemView,int ViewType) {
            super(itemView);
                        
		Webvideo = itemView.findViewById(R.id.webvideo);
            titleTextView = itemView.findViewById(R.id.titleTextView);
   //         yearTextView = itemView.findViewById(R.id.yearTextView);
            ratingTextView = itemView.findViewById(R.id.ratingTextView);
  //          plotTextView = itemView.findViewById(R.id.plotTextView);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);

			T1 = itemView.findViewById(R.id.t1);
            T2 = itemView.findViewById(R.id.t2);
            T3 = itemView.findViewById(R.id.t3);
            
            mTimelineview = itemView.findViewById(R.id.timeline);
            mTimelineview.initLine(ViewType);
  		  
            Webvideo = itemView.findViewById(R.id.webvideo);           
                

            titleTextView.setOnClickListener(this);
              T1.setOnClickListener(this); 
   //         T2.setOnClickListener(this);
  //          T3.setOnClickListener(this);  
         
         
         
         
         
         
         
         
    
         
       
         
         
         
              
         
         
         
         
         
         
         
         
                               
        }
        
        
        
     
    
    
    
    
    
    
  
    
    
    
      
    
    
    
    
    
        
        
        
        
        
        
             
       
               @Override
                public void onClick(View view) {
                   
                  
                    switch(view.getId()){
                        case R.id.titleTextView:                        
                           Movie movie = movieList.get(getAdapterPosition());
                            movie.setExpanded(!movie.isExpanded());
                            notifyItemChanged(getAdapterPosition());
                            break; 
                            
                       case R.id.t1:
                            Toast.makeText(view.getContext(),"Task-1",Toast.LENGTH_SHORT).show();                                                                          
                         if(Webvideo.getVisibility() == view.GONE){
                                Webvideo.setVisibility(view.VISIBLE); 
						    	v.setUrl(getAdapterPosition());
                           Webvideo.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
							  @Override
							  public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                                    
 						       String videoId = v.getUrl();
							    youTubePlayer.loadVideo(videoId, 0);
                                urlT1 = urlT1 + 3;
                                
							  }
								});
                              
                                                                  }
                            else{
                                Webvideo.setVisibility(view.GONE); 
                                
                                }    
                                break;                                                                                                                                                                            
                        }
                    
                }  
    }
   
   

} 




















































