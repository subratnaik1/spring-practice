package com.subrat.sbeans;

import java.time.LocalDate;

public class DateService {
	
	private LocalDate localDate;
		
//	public void setLocalDate(LocalDate localDate) {
//		this.localDate = localDate;
//	}
	
	

	public String  getWeekDays() {
		int value = localDate.getDayOfWeek().getValue();
		if(value==6 || value==7) {
			return"weekend";
		}
		else {
			return"weekday";
		}		
	}

public DateService(LocalDate localDate) {
	super();
	this.localDate = localDate;
}

}
