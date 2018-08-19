package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.entity.Time;
import com.ubs.opsit.interviews.utils.TimeParser;

public class BerlinClockTimeConverter implements TimeConverter {

    @Override
    public String convertTime(String aTime) {
	// TODO Auto-generated method stub
	Time time = TimeParser.parse(aTime);
	BerlinClock berlinClock = new BerlinClock();
	berlinClock.setHours(time.getHour()).setMinutes(time.getMinutes())
		.setSeconds(time.getSeconds());
	return berlinClock.toString();
    }

}
