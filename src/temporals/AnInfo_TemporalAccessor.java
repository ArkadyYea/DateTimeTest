package temporals;

//		TemporalAccessor	interface
//All Known Subinterfaces:			ChronoLocalDate, ChronoLocalDateTime<D>, ChronoZonedDateTime<D>, Era, Temporal
//All Known Implementing Classes:	DayOfWeek, HijrahDate, HijrahEra, Instant, IsoEra, JapaneseDate, JapaneseEra, LocalDate, LocalDateTime, LocalTime, MinguoDate, MinguoEra, Month, MonthDay, OffsetDateTime, OffsetTime, ThaiBuddhistDate, ThaiBuddhistEra, Year, YearMonth, ZonedDateTime, ZoneOffset

//-Framework-level interface defining read-only access to a temporal object, such as a date, time, offset or some combination of these.
//-This is the base interface type for date, time and offset objects.
//-It is implemented by those classes that can provide information as fields or queries.

//-Most date and time information can be represented as a number. These are modeled using TemporalField with the number held using a long to handle large values. Year, month and day-of-month are simple examples of fields, but they also include instant and offsets. See ChronoField for the standard set of fields.

//-Two pieces of date/time information cannot be represented by numbers, the chronology and the time-zone.
// These can be accessed via queries using the static methods defined on TemporalQuery.

//-A sub-interface, Temporal, extends this definition to one that also supports adjustment and manipulation on more complete temporal objects.

//-This interface is a framework-level interface that should not be widely used in application code. Instead, applications should create and pass around instances of concrete types, such as LocalDate. There are many reasons for this, part of which is that implementations of this interface may be in calendar systems other than ISO. See ChronoLocalDate for a fuller discussion of the issues.

//	Implementation Requirements:
//-This interface places no restrictions on the mutability of implementations, however immutability is strongly recommended.

//	Method Summary
// • get​(TemporalField field)			- Gets the value of the specified field as an int.
// • getLong​(TemporalField field)		- Gets the value of the specified field as a long.
// • isSupported​(TemporalField field)	- Checks if the specified field is supported.
// • query​(TemporalQuery<R> query)		- Queries this date-time.
// • range​(TemporalField field)		- Gets the range of valid values for the specified field.

public class AnInfo_TemporalAccessor {}
