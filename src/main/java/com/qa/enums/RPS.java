package com.qa.enums;

public enum RPS {

	ROCK {
		@Override
		public Result getResult(RPS opponent) {
			if (opponent == this)
				return Result.DRAW;
			else if (opponent == PAPER)
				return Result.LOSE;
			else if (opponent == SCISSORS)
				return Result.WIN;
			else
				return null;
		}
	},
	PAPER {
		@Override
		public Result getResult(RPS opponent) {
			if (opponent == this)
				return Result.DRAW;
			else if (opponent == SCISSORS)
				return Result.LOSE;
			else if (opponent == ROCK)
				return Result.WIN;
			else
				return null;
		}
	},
	SCISSORS {
		@Override
		public Result getResult(RPS opponent) {
			if (opponent == this)
				return Result.DRAW;
			else if (opponent == ROCK)
				return Result.LOSE;
			else if (opponent == PAPER)
				return Result.WIN;
			else
				return null;
		}
	};

	public abstract Result getResult(RPS opponent);
}
