package com.Bridglabz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest 
{
	 @Test
	    public void testMoodAnalysis_whenMoodIsSad() {
	    	MoodAnalyser mood = new MoodAnalyser();
	        String md1 = mood.analyseMood("This is a sad message");
	        assertEquals(md1, "Sad");
	    }

	    @Test
	    public void testMoodAnalysis_whenMoodIsHappy() {
	    	MoodAnalyser  mood = new MoodAnalyser ();
	        String md2 = mood.analyseMood("This is a happy message");
	        assertEquals(md2, "Happy");
	    }
}
