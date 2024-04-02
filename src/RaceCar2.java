
public class RaceCar2 {

	private double horse2;
	private double weight2;
	private double zero602;
	private double mpg;
	
	public RaceCar2(double hp2, double w2) {
		horse2=hp2;
		weight2=w2;
		
	}
	
	//********Getters********
		
		public double getHorse2()
		{
			return horse2;
		}
		
		
		public double getWeight2()
		{
			return weight2;
		}
		
		public double getZero602()
		{
			return zero602;
		}
		
		public double MPG() 
		{
			return mpg;
		}
		
	//**********Setters************
		public void setHorse2(double hp2)
		{
			//Set the Horsepower of the second racecar
			if(horse2>= 200 && horse2<=700)
			{
				horse2=hp2;
				//System.out.println("Permitted horsepower range");
				System.out.println("The horsepower of your RaceCar is: "+ horse2);
			}
			else { 
				System.out.println("This car has a horsepower higher or lower than accepted.");
				horse2=hp2;
			}
		}
		
		public void setWeight2(double w2)
		{
			//Set the weight of the second racecar
			if(weight2>= 1000 && weight2<=3000)
			{
				//System.out.println("The Race car has adequate weigth for competition.");
				System.out.println("The weight of your RaceCar entered is: "+ w2);
				weight2=w2;
			}
			if(weight2<1000) {
				System.out.println("This car is not heavy enough to participate.");
				weight2=w2;
			}
			if(weight2>3000) {
				System.out.println("This car is too heavy to participate.");
				weight2=w2;
			}
				
		}
		
		public void setZero602(double hp2, double w)
		{
			//calculate how fast the car reaches to 60mph
			zero602= weight2/horse2/0.7;
			System.out.println("RaceCar 2 reaches 60mph in: "+ Math.round(zero602));
		}
		
		public void setMPG(double mp7)
		{
			
		}
		
		
		
		//Additional Methods
		public void raceTime2()
		{
			//calculates the time of the racecars
			double t;
			t=Math.sqrt(2*.25/ (0.0137/zero602));
			System.out.println(Math.round(t));
					
		}
}	
	


