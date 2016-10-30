package model;

public class Rotator {

	int[][] rotorValues;
	int rotorCounter;

	public Rotator(int[][] rotorVal, int startingValue) {
		this.rotorValues = rotorVal;
		this.rotorCounter = startingValue;
	}

	public int[][] getRotorValues() {
		return rotorValues;
	}

	public void setRotorValues(int[][] rotorValues) {
		this.rotorValues = rotorValues;
	}

	public int getRotorCounter() {
		return rotorCounter;
	}

	public void setRotorCounter(int rotorCounter) {
		this.rotorCounter = rotorCounter;
	}

}
