package com.qa.enums;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestRPS {

	@Mock // lets us force a return value
	private Random rand;

	@InjectMocks // shoves the mocked rand into my PLayRPS
	private PlayRPS rps;

	@Test
	public void testDraw() {
		Result expected = Result.DRAW;
		Mockito.when(this.rand.nextInt(3)).thenReturn(0); // force cpu to pick ROCK

		Result actual = this.rps.play(RPS.ROCK);

		assertEquals(expected, actual);
	}

	@Test
	public void testWin() {
		Result expected = Result.WIN;
		Mockito.when(this.rand.nextInt(3)).thenReturn(0); // force cpu to pick ROCK

		Result actual = this.rps.play(RPS.PAPER);

		assertEquals(expected, actual);
	}

	@Test
	public void testLose() {
		Result expected = Result.LOSE;
		Mockito.when(this.rand.nextInt(3)).thenReturn(0); // force cpu to pick ROCK

		Result actual = this.rps.play(RPS.SCISSORS);

		assertEquals(expected, actual);
	}

}
