package com.applications.official.models;
import com.applications.official.models.WYPModel;

public class WYPModel {
    private String Day,T1,T2,T3;
    private boolean expand;
    
    public WYPModel(String Day,String T1,String T2,String T3){
        this.Day = Day;
        this.T1 = T1;
        this.T2 = T2;
        this.T3 = T3;   
        this.expand = false;
        }
    
    public boolean isExpand(){
        return expand;
        }
    
    public void setExpand(boolean expand){
        this.expand = expand; 
        }     
    
    
      public String getDay(){      
        return Day;
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
        
             
    public void SetDay(String Day,String T1,String T2,String T3){
        this.T1 = T1;
        this.T2 = T2;
        this.T3 = T3;     
        this.Day = Day;        
        }  
    
}





