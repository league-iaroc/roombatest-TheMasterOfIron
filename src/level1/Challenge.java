package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		driveDirect(500,500);
		sleep(2250);
		driveDirect(0,500);
		sleep(750);
		driveDirect(2000,2000);
		sleep(4000);
		driveDirect(0,500);
		sleep(800);
		driveDirect(500,500);
		sleep(2000);
		driveDirect(0,0);
	}

	public void loop() {
	
	}
}
