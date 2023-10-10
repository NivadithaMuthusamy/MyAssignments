package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The size of the desktop is 15.6inches");
	}

	public static void main(String[] args) {
		Desktop lap=new Desktop();
		lap.ComputerModel();
		lap.desktopSize();

	}

}
