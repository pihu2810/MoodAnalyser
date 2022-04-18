package com.Bridglabz;

public class MoodAnalyser 
{
	public String analyseMood(String message) {

		if (message.contains("sad")) {
			return "Sad";
		}
		else {
			return "Happy";
		}

	}
}
