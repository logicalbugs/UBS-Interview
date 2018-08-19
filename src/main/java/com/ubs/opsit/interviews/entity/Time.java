package com.ubs.opsit.interviews.entity;

import com.ubs.opsit.interviews.utils.ValidationUtils;

public class Time {
    private final int hour;
    private final int minutes;
    private final int seconds;

    public Time(int hour, int minutes, int seconds) {
	ValidationUtils.validateRangeFromZeroUpTo(24, hour, "hour");
	ValidationUtils.validateRangeFromZeroUntil(60, minutes, "minutes");
	ValidationUtils.validateRangeFromZeroUntil(60, seconds, "seconds");
	this.hour = hour;
	this.minutes = minutes;
	this.seconds = seconds;
    }

    public int getHour() {
	return hour;
    }

    public int getMinutes() {
	return minutes;
    }

    public int getSeconds() {
	return seconds;
    }
}
