package com.ubs.opsit.interviews.utils;

import org.apache.commons.lang.Validate;

import com.ubs.opsit.interviews.entity.Time;

public class TimeParser {
    /**
     * Parses given string as a {@link Time}.
     * 
     * @param aTime
     *            time string in HH:mm:ss format
     */
    public static Time parse(String aTime) {
	Validate.notNull(aTime,
		"Time.parse() 'aTime' argument should not be null");
	ValidationUtils.validateMatchesPattern("\\d\\d:\\d\\d:\\d\\d", aTime,
		"aTime");
	String[] parts = aTime.split(":");
	int hour = Integer.valueOf(parts[0]);
	int minutes = Integer.valueOf(parts[1]);
	int seconds = Integer.valueOf(parts[2]);
	return new Time(hour, minutes, seconds);
    }
}
