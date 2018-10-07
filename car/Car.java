import java.util.*;
public class Car
{	
	String name;
	double tank;
	double oilt;
	public Car(){
	this.name="baoma";
	this.tank=12.5;
	this.oilt=2.1;}
	public void gas()
	{
	if(this.tank>this.oilt)
	System.out.println("can run");
	else 
	System.out.println("need gas");
	}
	public static void main (String[] args)
	{	
		
		Car[] car=new Car[2];
		Scanner reader=new Scanner (System.in);
		for(int i=0;i<2;i++){
		car[i]=new Car();
		System.out.print("input carname:");
		car[i].name=reader.next();
		System.out.print("input cartank:");
		car[i].tank=reader.nextDouble();
		System.out.print("input caroilt:");
		car[i].oilt=reader.nextDouble();
		System.out.println("output:"+"name "+car[i].name+" tank "+car[i].tank+" oilt "+car[i].oilt);
		car[i].gas();
		}
	}

}



