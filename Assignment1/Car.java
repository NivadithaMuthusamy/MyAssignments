package Assignment1;

public class Car {
    
	public void applygear() {
		System.out.println("applygear");
	}
	public void switchOnAc() {
		System.out.println("switchOnAc");
	}
	public void applyAccelerate() {
		System.out.println("applyAccelerate");
	}
	public static void main(String[] args) {
		Car toyota= new Car();
		toyota.applygear();
		toyota.switchOnAc();
		toyota.applyAccelerate();
	}
}