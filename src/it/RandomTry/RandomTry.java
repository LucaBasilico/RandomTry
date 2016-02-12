package it.RandomTry;

import java.util.Random;

public class RandomTry {
	
	private int edgeNumber;
	private int tryNumber;
	private int chooseNumber;
	private int counter = 0;
	Random rnd = new Random();
	private int trySuccess = 0;
	private int tryFailed = 0;
	
	public RandomTry(){
	}
	
	public RandomTry(int edgeNumber, int tryNumber, int chooseNumber){
		this.edgeNumber = edgeNumber;
		this.tryNumber = tryNumber;
		this.chooseNumber = chooseNumber;
	}

	public int getEdgeNumber() {
		return edgeNumber;
	}
	
	//I did not use because I have tried another way
	public void setEdgeNumber(int edgeNumber) {
		this.edgeNumber = edgeNumber;
	}

	public int getTryNumber() {
		return tryNumber;
	}
	
	//I did not use because I have tried another way
	public void setTryNumber(int tryNumber) {
		this.tryNumber = tryNumber;
	}
	
	

	public int getTrySuccess() {
		return trySuccess;
	}

	public int getTryFailed() {
		return tryFailed;
	}

	public void trakDown() {
		// TODO Auto-generated method stub
		do{
			int random = rnd.nextInt(edgeNumber)+1;
			if(chooseNumber == random){
				trySuccess++;
			} else{
				tryFailed++;
			}
			
			counter++;
		}while(tryNumber != counter);
	}
	
	
}
