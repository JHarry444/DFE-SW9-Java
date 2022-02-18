package com.qa.enums;

import java.util.Random;

public class CoinFlipper {
	private Random rand = new Random();

	public boolean flipCoin(CoinFlip call) {
		if (call == null)
			return false;
		int i = rand.nextInt(100); // rand between 0 - 99
		CoinFlip actual = null;
		if (i < 50) {
			actual = CoinFlip.HEADS;
		} else if (i < 99) {
			actual = CoinFlip.TAILS;
		} else {
			actual = CoinFlip.EDGE;
		}

		return actual == call;
	}
}
