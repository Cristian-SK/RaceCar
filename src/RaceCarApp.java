
import java.util.Scanner ;

public class RaceCarApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double hp, hp2, w, w2;
		
			//inputs
		//RaceCar1
		System.out.println("Enter the horsepower of your RaceCar: ");
		hp= scan.nextDouble(); 
		
		System.out.println("Enter the weight of your RaceCar: ");
		w= scan.nextDouble(); 
		
		//RaceCar2
		System.out.println("Enter the horsepower of your RaceCar #2: ");
		hp2= scan.nextDouble(); 
		
		System.out.println("Enter the weight of your RaceCar #2: ");
		w2= scan.nextDouble(); 
		
			//outputs
		RaceCar one= new RaceCar(hp, w); 
        RaceCar2 two= new RaceCar2(hp2, w2);
        
        //RaceCar1
        one.setHorse(hp);
		one.setWeight(w);
		
		//RaceCar2
		two.setHorse2(hp2);
		two.setWeight2(w2);
		
		one.setZero60(hp, w);
		one.raceTime();
		
		two.setZero602(hp2, w2);
		two.raceTime2();
		
		
		
		
		
		
		
		
		
		
		
		}
	}


