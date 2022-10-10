package com.applications.official;

public class CoursesModel {
    
    private String title; //genre, year;
    private int  imageid;
    public CoursesModel(String title,int imageid) {// String genre, String year) {
        this.title = title;
        this.imageid = imageid;   
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String name) {
        this.title = name;
    }
  
  public int getimgid(){
      return imageid;
      }
  
  public void setimgid(int position){      
      this.imageid = position;
      }
  
  
}


