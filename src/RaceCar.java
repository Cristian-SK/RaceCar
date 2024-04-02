
public class RaceCar {
	
	private double horse;
	private double weight;
	private double zero60;
	private double mpg;
	
	public RaceCar(double hp, double w) {
		horse=hp;
		weight=w;
		
	}
	
	//********Getters********
		
		public double getHorse()
		{
			return horse;
		}
		
		
		public double getWeight()
		{
			return weight;
		}
		
		public double getZero60()
		{
			return zero60;
		}
		
		public double MPG() 
		{
			return mpg;
		}
		
	//**********Setters************
		public void setHorse(double hp)
		{
			//Set the Horsepower of the first racecar
			if(horse>= 200 && horse<=700)
			{
				horse=hp;
				//System.out.println("Permitted horsepower range");
				System.out.println("The horsepower of your RaceCar is: "+ horse);
			}
			else { 
				System.out.println("This car has a horsepower higher or lower than accepted.");
				horse=hp;
			}
		}
		
		public void setWeight(double w)
		{
			//Set the weight of the first racecar
			if(weight>= 1000 && weight<=3000)
			{
				//System.out.println("The Race car has adequate weigth for competition.");
				System.out.println("The weight of your RaceCar entered is: "+ w);
				weight=w;
			}
			if(weight<1000) {
				System.out.println("This car is not heavy enough to participate.");
				weight=w;
			}
			if(weight>3000) {
				System.out.println("This car is too heavy to participate.");
				weight=w;
			}
				
		}
		
		public void setZero60(double hp, double w)
		{
			//calculate how fast the car reaches to 60mph
			zero60= w/hp/0.7;
			System.out.println("RaceCar 1 reaches 60mph in: "+ Math.round(zero60));
			
		}
		
		public void setMPG(double mp7)
		{
	
		}
		
		
		
		//Additional Methods
		public void raceTime()
		{
			//calculates the time of the racecars
			double t;
			t=Math.sqrt(2*.25/ (0.0137/zero60));
			System.out.println(Math.round(t));
					
		}
		
	
		
		
}
