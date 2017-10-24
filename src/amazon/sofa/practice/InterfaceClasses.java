package amazon.sofa.practice;

import apple.laf.JRSUIConstants.Direction;
 
// interfaces are such contracts b/n classes and outside world
	/*
	   For example, imagine a futuristic society where computer-controlled robotic cars transport passengers 
	   through city streets without a human operator. Automobile manufacturers write software (Java, of course) 
	   that operates the automobile—stop, start, accelerate, turn left, and so forth. Another industrial group,
	   electronic guidance instrument manufacturers, make computer systems that receive GPS (Global Positioning System) 
	   position data and wireless transmission of traffic conditions and use that information to drive the car.
	 */
	
	/*Interfaces cannot be instantiated—they can only be implemented by classes or extended by other interfaces.*/
	
	/*interface classes can contain only constants, method signatures, default methods, static methods, and nested types.*/
//   public methods and final static fields

public class InterfaceClasses implements OperateCar {
   
	@Override
	public int turn(Direction direction, double radius, double startSpeed, double endSpeed) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changeLanes(Direction direction, double startSpeed, double endSpeed) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int signalTurn(Direction direction, boolean signalOn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadarFront(double distanceToCar, double speedOfCar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadarRear(double distanceToCar, double speedOfCar) {
		// TODO Auto-generated method stub
		return 0;
	}

	 
	   

}


