package com.subrat.sbeans;

import java.time.LocalDate;

public class CurrentMonthName {
 
	private LocalDate localdate;

	public CurrentMonthName(LocalDate localdate) {
		super();
		this.localdate = localdate;
	}
	
	public String getMonth() {
		String month=localdate.getMonth().toString();
		if(month.equalsIgnoreCase("january")) {
			return"Happy new Year";
		}
		else if(month.equalsIgnoreCase("Descember")) {
			return"get ready for the new year";
		}
		else {
			return "regular month";
		}
	}
}
