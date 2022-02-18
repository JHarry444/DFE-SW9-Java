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
public class CoinFlipTest {

	@Mock // Mockito create a new Random() that you can force
	private Random rand;

	@InjectMocks // Mockito creates a CoinFlipper with that Random in it
	private CoinFlipper flipper;

	@Test
	public void testEdge() {
		Mockito.when(this.rand.nextInt(100)).thenReturn(99);
		assertEquals(true, this.flipper.flipCoin(CoinFlip.EDGE));
	}

	@Test
	public void testHeads() {
		Mockito.when(this.rand.nextInt(100)).thenReturn(49);
		assertEquals(true, this.flipper.flipCoin(CoinFlip.HEADS));
	}

	@Test
	public void testTails() {
		Mockito.when(this.rand.nextInt(100)).thenReturn(59);
		assertEquals(true, this.flipper.flipCoin(CoinFlip.TAILS));
	}
}
