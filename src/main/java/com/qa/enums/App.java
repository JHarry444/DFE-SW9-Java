package com.qa.enums;

import java.time.LocalDate;
import java.time.Month;

public class App {

	public static void main(String[] args) {
		CoinFlip.valueOf(null);
		LocalDate bday = LocalDate.of(1994, Month.APRIL, 4);
		System.out.println(bday);

		for (CoinFlip flip : CoinFlip.values()) {
			System.out.println(flip);
		}

		CoinFlipper flipper = new CoinFlipper();
		for (int i = 0; i < 20; i++) {
			System.out.println(flipper.flipCoin(CoinFlip.HEADS));
		}
	}

}
