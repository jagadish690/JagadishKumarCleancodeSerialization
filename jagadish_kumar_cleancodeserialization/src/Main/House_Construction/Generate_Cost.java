package Main.House_Construction;

public class Generate_Cost  {
	public double Cost(String name,double Sqrfoot)
	{
		Get_Plan_Factory planFactory = new Get_Plan_Factory();
		Plan p = planFactory.getPlan(name);  
		p.getRate();
		double d=p.calculateBill(Sqrfoot);
		return d;
	}
}