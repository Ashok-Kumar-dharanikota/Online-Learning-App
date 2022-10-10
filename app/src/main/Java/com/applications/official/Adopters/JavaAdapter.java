package com.applications.official;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Override;
import java.util.List;

import com.applications.official.MovieModel;

public class JavaAdapter extends RecyclerView.Adapter<JavaAdapter.MyViewHolder> {
    private List<JavaModel> JavaList;
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title; // year, genre;
        MyViewHolder(View view) {
            super(view);
         
            title = view.findViewById(R.id.title);
        /*    genre = view.findViewById(R.id.genre);
            year = view.findViewById(R.id.year);  */
             
        
    }
   } 
   public JavaAdapter(List<JavaModel> JavaList) {
        this.JavaList = JavaList;
  
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.movie_list, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        JavaModel Java = JavaList.get(position);
        holder.title.setText(Java.getTitle());
  /*      holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear()); */
    }
    @Override
    public int getItemCount() {
        return JavaList.size();
    }
}




