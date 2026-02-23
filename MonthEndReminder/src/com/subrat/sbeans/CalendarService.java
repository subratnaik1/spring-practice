package com.subrat.sbeans;

import java.time.LocalDate;

public class CalendarService {
	
	private LocalDate localDate;
		
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public String getDate() {
		int day=localDate.getDayOfMonth();
		if(day==30||day==31) {
			return"month is ending,submit your reports";
		}
		else {
			return"continue working as usual";
		}
	}
	
}
