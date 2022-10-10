package com.applications.official.models;
import com.applications.official.models.FSMmodel;
import org.parceler.Parcel;

@Parcel  
public class FSMmodel {
   private String title,duration ,T1,T2,T3; 
   private String u1,u2,u3; 
   private boolean Lock; 
  
  FSMmodel(){       }
     
     public FSMmodel(String title,String duration,String T1,String T2,String T3,String u1,String u2,String u3,boolean Lock){
         this.title = title;
         this.duration = duration;
         this.T1 = T1;
         this.T2 = T2;
         this.T3 = T3;
         this.u1 = u1;
         this.u2 = u2;
         this.u3 = u3;
         this.Lock = Lock;
         }
    
    public void setTitle(String title){
        this.title = title; 
        }
    public void setDuration(String duration){
        this.duration = duration;
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
    public void setU1(String u1){
        this.u1 = u1;
        } 
	public void setU2(String u2){
        this.u2 = u2;
        } 
	public void setU3(String u3){
        this.u3 = u3;
        } 
    public void setLock(boolean Lock){
        this.Lock = Lock; 
        }    
        
        
    public String getTitle() {
        return title;
        }
    public String getDuration(){
        return duration;
        }
    public String getT1() {
        return T1; 
        }  
    public String getT2() {
        return T2;
        }
    public String getT3(){
        return T3;
        }
	public String gtU1(){
        return u1;
        }
	public String getU2(){
        return u2;
        }
	public String getU3(){
        return u3;
        }
    public boolean getLock(){
        return Lock;
        }
        
}






