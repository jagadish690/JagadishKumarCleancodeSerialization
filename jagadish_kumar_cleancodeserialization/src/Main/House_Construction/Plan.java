package Main.House_Construction;

abstract class Plan {
    protected double rate;  
    abstract void getRate();  
    public double calculateBill(double Sqrfoot){  
         return(Sqrfoot*rate);  
     }  
}