package ch.makery.address.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Helper function for converting date to string and vice versa
 * 
 * @author Kyle
 */

public class DateUtil {

	/** Date pattern */
	private static final String DATE_PATTERN = "dd.MM.yyyy";
	/** Date formatter */
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);

	/** Convert the date and return the formatted string of date */
	public static String format(LocalDate date) {
		if (date == null) {
			return null;
		}
		return DATE_FORMATTER.format(date);
	}

	/** Convert formatted date string to date */
	public static LocalDate parse(String dateString) {
		try {
			return DATE_FORMATTER.parse(dateString, LocalDate::from);
		} catch (DateTimeParseException e) {
			return null;
		}
	}

	/**
	 * Check the validation of the date Return true if the date is valid
	 */
	public static boolean validDate(String dateString) {
		return DateUtil.parse(dateString) != null;
	}
}
