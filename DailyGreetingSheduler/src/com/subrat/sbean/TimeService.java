package com.subrat.sbean;
import java.time.LocalTime;

public class TimeService {

	private LocalTime localtime;
	
	public TimeService(LocalTime localtime) {
		super();
		this.localtime = localtime;
	}

	public String show() {
		int hour=LocalTime.now().getHour();
		if(hour>=5 && hour<=11) {
			return"GoodMorning";
		}
		else if(hour>=12 && hour<=4) {
			return"good afternoon";
		}
		else if(hour>=5 &&hour<=8) {
			return"good Evening";
		}
		else {
			return"good night";
		}
	}
}
