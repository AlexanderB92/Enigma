package model;

public class Rotator {

	int[][] rotorValues;
	int rotationCounter;

	public Rotator(int[][] rotorVal, int startingValue) {
		this.rotorValues = rotorVal;
		this.rotationCounter = startingValue;
	}

	public int[][] getRotorValues() {
		return rotorValues;
	}

	public void setRotorValues(int[][] rotorValues) {
		this.rotorValues = rotorValues;
	}

	public int getRotorCounter() {
		return rotationCounter;
	}

	public void setRotorCounter(int rotorCounter) {
		this.rotationCounter = rotorCounter;
	}
	
	public int rightOutput(int i) {
		
		int result = 0;
		int target = i;
//		int target = (i + rotationCounter)%rotorValues[0].length;
		
		for(int c = 0; c < rotorValues[1].length; c++) {
			if(rotorValues[1][c] == rotorValues[0][target]) {
				result = c;
			}
		}
		
		return result;		
	}
	
	public void rotateRotor() {
		
		System.out.println(rotorValues.length);
		
		int[][] dummy = new int[rotorValues.length][rotorValues[0].length];
		
		for(int i = 0; i < rotorValues[0].length; i++) {
			rotorValues[0][(i+1) % rotorValues[0].length] = dummy[0][i];
			rotorValues[1][(i+1) % rotorValues[1].length] = dummy[1][i];
		}
	}
	
	public void printArrays() {
		for(int i = 0; i < rotorValues[0].length; i++) {
			System.out.println(rotorValues[0][i] + " " + rotorValues[1][i]);
		}
	}

}
