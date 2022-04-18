package com.Bridglabz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest 
{
	 @Test
	    public void testMoodAnalysis_whenMoodIsSad() {
	    	MoodAnalyser mood = new MoodAnalyser();
	        String md1 = mood.analyseMood();
	        assertEquals(md1, "Sad");
	    }

	    @Test
	    public void testMoodAnalysis_whenMoodIsHappy() {
	    	MoodAnalyser  mood = new MoodAnalyser ();
	        String md2 = mood.analyseMood();
	        assertEquals(md2, "Happy");
	    }
	    @Test
	    public void testMoodAnalysis_whenMoodIsNull() {
	    	MoodAnalyser mood = new MoodAnalyser(null);
	        String md3 = mood.analyseMood();
	        assertEquals(md3,"happy");

	    }
}
