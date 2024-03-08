package com.self.gamingsimulationproblem;

import java.util.Random;

public class GamingSimulation {
	
	private static final int STACK_PER_DAY = 100;
	private static final int BET_PER_GAME = 1;
	private static final int WIN = 1;
	private static final int LOOSE = 0;
	
	private static int winStack = 0;
	private static int looseStack = 0;
	
	public static void gamestatus() {
		System.out.println("Stack Availabel "+STACK_PER_DAY);
		System.out.println("Bet Per Game "+BET_PER_GAME);
		System.out.println("Wining stack "+winStack);
		System.out.println("Losse stack "+looseStack);
	}
	
	public static void gameplay() {
			while(true) {
			gamestatus();
			Random random = new Random();
			int playstatus = random.nextInt(9)%2;
			System.out.println("Play Status"+playstatus);
			if(playstatus == LOOSE) {
				looseStack += 1;
			}else {
				winStack += 1;
			}
			if(winStack == STACK_PER_DAY/2) {
				break;
			}
			if(looseStack == STACK_PER_DAY/2) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation problem developed by Mohammad Husain.");
		
		gameplay();
		
	}

}
