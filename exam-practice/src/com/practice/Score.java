package com.practice;

public class Score {
	int value = 0;
	 
	public Score(String s) throws ScoreException {
		try {
			value = Integer.parseInt(s);
			if (value<0 || value>100) {
				throw new ScoreException();
			}
		} catch(NumberFormatException e) {
			throw new ScoreException();
		}
	}
}
