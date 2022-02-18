package com.qa.enums;

import java.util.Random;

public class PlayRPS {

	private Random rand = new Random();

	public Result play(RPS choice) {
		if (choice == null)
			return null;
		int i = rand.nextInt(3);

		RPS cpu = null;

		if (i == 0) {
			cpu = RPS.ROCK;
		} else if (i == 1) {
			cpu = RPS.PAPER;
		} else if (i == 2) {
			cpu = RPS.SCISSORS;
		}
		return choice.getResult(cpu);
	}
}
