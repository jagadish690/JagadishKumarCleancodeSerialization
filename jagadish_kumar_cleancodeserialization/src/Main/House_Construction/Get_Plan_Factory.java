package Main.House_Construction;

public class Get_Plan_Factory{
	public Plan getPlan(String planType){  
        if(planType == null){  
         return null;  
        }  
      if(planType.equalsIgnoreCase("standard")) {  
             return new Standard();  
           }   
       else if(planType.equalsIgnoreCase("Abovestandard")){  
            return new Above_Standard_level();  
        }   
      else if(planType.equalsIgnoreCase("Highstandard")) {  
            return new High_Standard_Level();  
      }
      //else if(planType.equalsIgnoreCase("Highstandard_fullyautomated")) {  
        else if(planType.equalsIgnoreCase("HighstandardFullautomatic")) {  
    	  return new High_Standard_Full_Automatic();
      }
  return null;  
}  
}
