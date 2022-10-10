package com.applications.official.models;
import com.applications.official.models.Movie;
import java.lang.String;

public class Movie {

    private String title;
    private String rating;
    private String year;
    private String plot;
    
    private String T1,T2,T3,u1,u2,u3;
    
    private boolean expanded;

    public Movie(String title, String rating, String year,String plot,String T1,String T2,String T3){ 
        this.title = title;
        this.rating = rating;
        this.year = year; 
        this.plot = plot;      
        this.expanded = false;
        this.T1 =T1;
        this.T2 = T2;
        this.T3 = T3;
        
    }

 public Movie(String title,String T1,String T2,String T3,String u1){
        this.T1 =T1;
        this.T2 = T2;
        this.T3 = T3;
        this.title = title;
        this.u1 = u1;                 
        }
        
    public Movie(String title,String T1){
       this.T1 =T1;
       this.title = title;
       
        }    
        

	public String getT1(){
        return T1;
        }
        
	public String getT2(){
        return T2; 
        }
        
	public String getT3(){
        return T3;
        }
        
        
    public void setT1(String T1){
        this.T1 = T1;
        }   
        
  public void setT2(String T2){
        this.T2 = T2;
        }   
        
public void setT3(String T3){
        this.T3 = T3;
        }   
        
         
         
         
         
         
         
public String getU1(){
        return u1;
        }
        
	public String getU2(){
        return u2; 
        }
        
	public String getU3(){
        return u3;
        }
        
        
    public void setU1(String u1){
        this.u1 = u1;
        }   
        
  public void setu2(String u2){
        this.u2 = u2;
        }   
        
public void setu3(String u3){
        this.u3 = u3;
        }   
         
         
         
         
         
         

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating='" + rating + '\'' +
                ", year='" + year + '\'' +
                ", plot='" + plot + '\'' +
                ", expanded=" + expanded +
                '}';
    }
    
    public Movie() {}  
}














