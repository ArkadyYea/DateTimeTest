package formatter_parser;

//		DateTimeFormatter	- final class DateTimeFormatter 

//-Formatter for printing and parsing date-time objects.
//-This class provides the main application entry point for printing and parsing and provides common implementations of DateTimeFormatter:
// � Using predefined constants, such as ISO_LOCAL_DATE
// � Using pattern letters, such as uuuu-MMM-dd
// � Using localized styles, such as long or medium

//-More complex formatters are provided by DateTimeFormatterBuilder.

//-The main date-time classes provide two methods
// one for formatting, format(DateTimeFormatter formatter),
// and one for parsing, parse(CharSequence text, DateTimeFormatter formatter).
//  LocalDate date = LocalDate.now();
//  String text = date.format(formatter);
//  LocalDate parsedDate = LocalDate.parse(text, formatter);
//
//-In addition to the format, formatters can be created with desired Locale, Chronology, ZoneId, and DecimalStyle.
//-The withLocale() returns a new formatter that overrides the locale. The locale affects some aspects of formatting and parsing.
// For example, the ofLocalizedDate provides a formatter that uses the locale specific date format.
//-The withChronology() returns a new formatter that overrides the chronology. If overridden, the date-time value is converted to
// the chronology before formatting. During parsing the date-time value is converted to the chronology before it is returned.
//-The withZone() returns a new formatter that overrides the zone. If overridden, the date-time value is converted
// to a ZonedDateTime with the requested ZoneId before formatting. During parsing the ZoneId is applied before the value is returned.
//-The withDecimalStyle() returns a new formatter that overrides the DecimalStyle. The DecimalStyle symbols are used for formatting and parsing.
//
//-Some applications may need to use the older java.text.Format class for formatting.
//-The toFormat() returns an implementation of java.text.Format.


//	Predefined Formatters
//	Formatter									Description													Example
//	ofLocalizedDate(dateStyle)					Formatter with date style from the locale					'2011-12-03'
//	ofLocalizedTime(timeStyle)					Formatter with time style from the locale					'10:15:30'
//	ofLocalizedDateTime(dateTimeStyle)			Formatter with a style for date and time from the locale	'3 Jun 2008 11:05:30'
//	ofLocalizedDateTime(dateStyle,timeStyle)	Formatter with date and time styles from the locale			'3 Jun 2008 11:05'
//	BASIC_ISO_DATE								Basic ISO date												'20111203'
//	ISO_LOCAL_DATE								ISO Local Date												'2011-12-03'
//	ISO_OFFSET_DATE								ISO Date with offset										'2011-12-03+01:00'
//	ISO_DATE									ISO Date with or without offset								'2011-12-03+01:00'; '2011-12-03'
//	ISO_LOCAL_TIME								Time without offset											'10:15:30'
//	ISO_OFFSET_TIME								Time with offset											'10:15:30+01:00'
//	ISO_TIME									Time with or without offset									'10:15:30+01:00'; '10:15:30'
//	ISO_LOCAL_DATE_TIME							ISO Local Date and Time										'2011-12-03T10:15:30'
//	ISO_OFFSET_DATE_TIME						Date Time with Offset										'2011-12-03T10:15:30+01:00'
//	ISO_ZONED_DATE_TIME							Zoned Date Time												'2011-12-03T10:15:30+01:00[Europe/Paris]'
//	ISO_DATE_TIME								Date and time with ZoneId									'2011-12-03T10:15:30+01:00[Europe/Paris]'
//	ISO_ORDINAL_DATE							Year and day of year										'2012-337'
//	ISO_WEEK_DATE								Year and Week												'2012-W48-6'
//	ISO_INSTANT									Date and Time of an Instant									'2011-12-03T10:15:30Z'
//	RFC_1123_DATE_TIME							RFC 1123 / RFC 822											'Tue, 3 Jun 2008 11:05:30 GMT'

//	Patterns for Formatting and Parsing
//-Patterns are based on a simple sequence of letters and symbols.
//-A pattern is used to create a Formatter using the ofPattern(String) and ofPattern(String, Locale) methods.
// For example, "d MMM uuuu" will format 2011-12-03 as '3 Dec 2011'.
//-A formatter created from a pattern can be used as many times as necessary, it is immutable and is thread-safe.
//  LocalDate date = LocalDate.now();
//  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
//  String text = date.format(formatter);
//  LocalDate parsedDate = LocalDate.parse(text, formatter);
//
//-All letters 'A' to 'Z' and 'a' to 'z' are reserved as pattern letters. The following pattern letters are defined:
//
//Pattern Letters and Symbols
//	Symbol		Meaning						Presentation	Examples
//	G			era							text			AD; Anno Domini; A
//	u			year						year			2004; 04
//	y			year-of-era					year			2004; 04
//	D			day-of-year					number			189
//	M/L			month-of-year				number/text		7; 07; Jul; July; J
//	d			day-of-month				number			10
//	g			modified-julian-day			number			2451334
//	Q/q			quarter-of-year				number/text		3; 03; Q3; 3rd quarter
//	Y			week-based-year				year			1996; 96
//	w			week-of-week-based-year		number			27
//	W			week-of-month				number			4
//	E			day-of-week					text			Tue; Tuesday; T
//	e/c			localized day-of-week		number/text		2; 02; Tue; Tuesday; T
//	F			day-of-week-in-month		number			3
//	a			am-pm-of-day				text			PM
//	h			clock-hour-of-am-pm (1-12)	number			12
//	K			hour-of-am-pm (0-11)		number			0
//	k			clock-hour-of-day (1-24)	number			24
//	H			hour-of-day (0-23)			number			0
//	m			minute-of-hour				number			30
//	s			second-of-minute			number			55
//	S			fraction-of-second			fraction		978
//	A			milli-of-day				number			1234
//	n			nano-of-second				number			987654321
//	N			nano-of-day					number			1234000000
//	V			time-zone ID				zone-id			America/Los_Angeles; Z; -08:30
//	v			generic time-zone name		zone-name		Pacific Time; PT
//	z			time-zone name				zone-name		Pacific Standard Time; PST
//	O			localized zone-offset		offset-O		GMT+8; GMT+08:00; UTC-08:00
//	X			zone-offset 'Z' for zero	offset-X		Z; -08; -0830; -08:30; -083015; -08:30:15
//	x			zone-offset					offset-x		+0000; -08; -0830; -08:30; -083015; -08:30:15
//	Z			zone-offset					offset-Z		+0000; -0800; -08:00
//	p			pad next					pad modifier	1
//	'			escape for text				delimiter	
//	''			single quote				literal			'
//	[			optional section start		
//	]			optional section end		
//	#			reserved for future use		
//	{			reserved for future use		
//	}			reserved for future use		

//-The count of pattern letters determines the format.

// � Text: The text style is determined based on the number of pattern letters used. Less than 4 pattern letters will use the short form.
//   Exactly 4 pattern letters will use the full form. Exactly 5 pattern letters will use the narrow form.
//   Pattern letters 'L', 'c', and 'q' specify the stand-alone form of the text styles.

// � Number: If the count of letters is one, then the value is output using the minimum number of digits and without padding.
//   Otherwise, the count of digits is used as the width of the output field, with the value zero-padded as necessary.
//   The following pattern letters have constraints on the count of letters. Only one letter of 'c' and 'F' can be specified.
//   Up to two letters of 'd', 'H', 'h', 'K', 'k', 'm', and 's' can be specified. Up to three letters of 'D' can be specified.

// � Number/Text: If the count of pattern letters is 3 or greater, use the Text rules above. Otherwise use the Number rules above.

// � Fraction: Outputs the nano-of-second field as a fraction-of-second. The nano-of-second value has nine digits, thus the count of pattern
//   letters is from 1 to 9. If it is less than 9, then the nano-of-second value is truncated, with only the most significant digits being output.

// � Year: The count of letters determines the minimum field width below which padding is used. If the count of letters is two, then
//   a reduced two digit form is used. For printing, this outputs the rightmost two digits. For parsing, this will parse using
//   the base value of 2000, resulting in a year within the range 2000 to 2099 inclusive. If the count of letters is less than four
//   (but not two), then the sign is only output for negative years as per SignStyle.NORMAL.
//   Otherwise, the sign is output if the pad width is exceeded, as per SignStyle.EXCEEDS_PAD.

// � ZoneId: This outputs the time-zone ID, such as 'Europe/Paris'. If the count of letters is two, then the time-zone ID is output.
//   Any other count of letters throws IllegalArgumentException.

// � Zone names: This outputs the display name of the time-zone ID. If the pattern letter is 'z' the output is the daylight savings
//   aware zone name. If there is insufficient information to determine whether DST applies, the name ignoring daylight savings time
//   will be used. If the count of letters is one, two or three, then the short name is output. If the count of letters is four,
//   then the full name is output. Five or more letters throws IllegalArgumentException.
//   -If the pattern letter is 'v' the output provides the zone name ignoring daylight savings time. If the count of letters is one,
//    then the short name is output. If the count of letters is four, then the full name is output.
//    Two, three and five or more letters throw IllegalArgumentException.

// � Offset X and x: This formats the offset based on the number of pattern letters. One letter outputs just the hour, such as '+01',
//   unless the minute is non-zero in which case the minute is also output, such as '+0130'. Two letters outputs the hour and minute,
//   without a colon, such as '+0130'. Three letters outputs the hour and minute, with a colon, such as '+01:30'.
//   Four letters outputs the hour and minute and optional second, without a colon, such as '+013015'. Five letters outputs the hour
//   and minute and optional second, with a colon, such as '+01:30:15'. Six or more letters throws IllegalArgumentException.
//   Pattern letter 'X' (upper case) will output 'Z' when the offset to be output would be zero,
//   whereas pattern letter 'x' (lower case) will output '+00', '+0000', or '+00:00'.

// � Offset O: This formats the localized offset based on the number of pattern letters. One letter outputs the short form of the localized
//   offset, which is localized offset text, such as 'GMT', with hour without leading zero, optional 2-digit minute and second if non-zero,
//   and colon, for example 'GMT+8'. Four letters outputs the full form, which is localized offset text, such as 'GMT, with 2-digit hour
//   and minute field, optional second field if non-zero, and colon, fe 'GMT+08:00'. Any other count of letters throws IllegalArgumentException.

// � Offset Z: This formats the offset based on the number of pattern letters. One, two or three letters outputs the hour and minute, without
//   a colon, such as '+0130'. The output will be '+0000' when the offset is zero. Four letters outputs the full form of localized offset,
//   equivalent to four letters of Offset-O. The output will be the corresponding localized offset text if the offset is zero.
//   Five letters outputs the hour, minute, with optional second if non-zero, with colon. It outputs 'Z' if the offset is zero.
//   Six or more letters throws IllegalArgumentException.

// � Optional section: The optional section markers work exactly like calling DateTimeFormatterBuilder.optionalStart()
//   and DateTimeFormatterBuilder.optionalEnd().

// � Pad modifier: Modifies the pattern that immediately follows to be padded with spaces. The pad width is determined by the number
//   of pattern letters. This is the same as calling DateTimeFormatterBuilder.padNext(int).
//   For example, 'ppH' outputs the hour-of-day padded on the left with spaces to a width of 2.

//-Any unrecognized letter is an error. Any non-letter character, other than '[', ']', '{', '}', '#' and the single quote
// will be output directly. Despite this, it is recommended to use single quotes around all characters that you want 
// to output directly to ensure that future changes do not break your application.


//	Resolving
//-Parsing is implemented as a two-phase operation.
//-First, the text is parsed using the layout defined by the formatter, producing a Map of field to value, a ZoneId and a Chronology.
// Second, the parsed data is resolved, by validating, combining and simplifying the various fields into more useful ones.

//-Five parsing methods are supplied by this class. Four of these perform both the parse and resolve phases.
// The fifth method, parseUnresolved(CharSequence, ParsePosition), only performs the first phase, leaving the result unresolved.
// As such, it is essentially a low-level operation.

//-The resolve phase is controlled by two parameters, set on this class.
//-The ResolverStyle is an enum that offers three different approaches, strict, smart and lenient.
// The smart option is the default. It can be set using withResolverStyle(ResolverStyle).
//-The withResolverFields(TemporalField...) parameter allows the set of fields that will be resolved to be filtered before resolving starts.
// For example, if the formatter has parsed a year, month, day-of-month and day-of-year, then there are two approaches to resolve a date:
// (year + month + day-of-month) and (year + day-of-year). The resolver fields allows one of the two approaches to be selected.
// If no resolver fields are set then both approaches must result in the same date.

//-Resolving separate fields to form a complete date and time is a complex process with behaviour distributed across a number of classes
//-It follows these steps:
// 1. The chronology is determined. The chronology of the result is either the chronology that was parsed, or if no chronology was parsed, it is the chronology set on this class, or if that is null, it is IsoChronology.
// 2. The ChronoField date fields are resolved. This is achieved using Chronology.resolveDate(Map, ResolverStyle). Documentation about field resolution is located in the implementation of Chronology.
// 3. The ChronoField time fields are resolved. This is documented on ChronoField and is the same for all chronologies.
// 4. Any fields that are not ChronoField are processed. This is achieved using TemporalField.resolve(Map, TemporalAccessor, ResolverStyle). Documentation about field resolution is located in the implementation of TemporalField.
// 5. The ChronoField date and time fields are re-resolved. This allows fields in step four to produce ChronoField values and have them be processed into dates and times.
// 6. A LocalTime is formed if there is at least an hour-of-day available. This involves providing default values for minute, second and fraction of second.
// 7. Any remaining unresolved fields are cross-checked against any date and/or time that was resolved. Thus, an earlier stage would resolve (year + month + day-of-month) to a date, and this stage would check that day-of-week was valid for the date.
// 8. If an excess number of days was parsed then it is added to the date if a date is available.
// 9. If a second-based field is present, but LocalTime was not parsed, then the resolver ensures that milli, micro and nano second values are available to meet the contract of ChronoField. These will be set to zero if missing.
// 10. If both date and time were parsed and either an offset or zone is present, the field ChronoField.INSTANT_SECONDS is created. If an offset was parsed then the offset will be combined with the LocalDateTime to form the instant, with any zone ignored. If a ZoneId was parsed without an offset then the zone will be combined with the LocalDateTime to form the instant using the rules of ChronoLocalDateTime.atZone(ZoneId).


//Implementation Requirements:
//-This class is immutable and thread-safe.

public class AnInfo_DateTimeFormatter {}