package com.subrat.sbeans;

import java.time.LocalDate;

public class SchedulerService {
	private LocalDate localdate;

	public SchedulerService(LocalDate localdate) {
		super();
		this.localdate = localdate;
	}	
	public String show() {
		return LocalDate.now().getDayOfWeek().toString();
	}
}
