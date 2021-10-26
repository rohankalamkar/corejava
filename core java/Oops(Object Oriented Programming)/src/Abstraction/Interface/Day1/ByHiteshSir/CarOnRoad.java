package Abstraction.Interface.Day1.ByHiteshSir;

public class CarOnRoad implements Car,SportCar{
	public int speed;
	public int setSpeed(int speed) {
		this.speed = speed;
		return speed;
	}

	@Override
	public void ApplyBooster(int IncreaseSpeedBy) {
		int EndSpeed = setSpeed(speed) + IncreaseSpeedBy;
		System.out.println("Speed After Applying Booster is : "+EndSpeed);
		
	}

	@Override
	public void AirBags() {
		System.out.println("Air Bags Open");
		
	}

	@Override
	public void start() {
		System.out.println("Engine is Starting.....");
		
	}

	@Override
	public void applyBrake(int reduceSpeedBy) {
		int LastSpeed = setSpeed(speed)-reduceSpeedBy;
		System.out.println("Applying Break....And reducing speed is : "+LastSpeed);
		
		
	}

	@Override
	public void Stop() {
		System.out.println("Stop the Car........");
		
	}

}
