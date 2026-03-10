package com.subrat.sbeans;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterUtil {
	public static String formatDateForLocale(Locale locale, LocalDate date) {
		DateTimeFormatter formatter =
                DateTimeFormatter.ofLocalizedDate(java.time.format.FormatStyle.LONG)
                .withLocale(locale);
        return date.format(formatter);
	}

}
