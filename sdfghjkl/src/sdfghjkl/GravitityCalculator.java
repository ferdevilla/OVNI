package sdfghjkl;

public class GravitityCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gravity = -9.81; //Earth's gravity in m/s**2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		
		//x(t)=0.5*at2+vit+xi
		double x= 0.5*gravity*(fallingTime*fallingTime) + initialPosition + initialVelocity;
				
		
		System.out.println("The object's position after"+fallingTime+"seconds is"+x+"m");
		
		
	
	}
	}

