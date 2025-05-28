package week_4;

import java.util.ArrayList;
import java.util.List;

public class BitCount {

	    public List<String> readBinaryWatch(int turnedOn) {
	       
	        List<String> result = new ArrayList();

	        for (int hour = 0; hour < 12; hour++) {
	            for (int minutes = 0; minutes < 60; minutes++) {
	                if (Integer.bitCount(hour) + Integer.bitCount(minutes) == turnedOn) {
	                    result.add(String.format("%d:%02d", hour, minutes));
	                }
	            }
	        }

	        return result;
	    }
	}

