package temporals;

//		Temporal	interface extends TemporalAccessor
//All Known Subinterfaces:	ChronoLocalDate, ChronoLocalDateTime<D>, ChronoZonedDateTime<D>
//All Known Implementing Classes: HijrahDate, Instant, JapaneseDate, LocalDate, LocalDateTime, LocalTime, MinguoDate, OffsetDateTime, OffsetTime, ThaiBuddhistDate, Year, YearMonth, ZonedDateTime

//-Framework-level interface defining read-write access to a temporal object, such as a date, time, offset or some combination of these.
//-This is the base interface type for date, time and offset objects that are complete enough to be manipulated using plus and minus.
// It is implemented by those classes that can provide and manipulate information as fields or queries.
// See TemporalAccessor for the read-only version of this interface.

//-Most date and time information can be represented as a number. These are modeled using TemporalField with the number held using a long to handle large values. Year, month and day-of-month are simple examples of fields, but they also include instant and offsets. See ChronoField for the standard set of fields.

//-Two pieces of date/time information cannot be represented by numbers, the chronology and the time-zone. These can be accessed via queries using the static methods defined on TemporalQuery.

//-This interface is a framework-level interface that should not be widely used in application code. Instead, applications should create and pass around instances of concrete types, such as LocalDate. There are many reasons for this, part of which is that implementations of this interface may be in calendar systems other than ISO. See ChronoLocalDate for a fuller discussion of the issues.

//	When to implement
//-A class should implement this interface if it meets three criteria:
// • it provides access to date/time/offset information, as per TemporalAccessor
// • the set of fields are contiguous from the largest to the smallest
// • the set of fields are complete, such that no other field is needed to define the valid range of values for the fields that are represented
//-Four examples make this clear:
// • LocalDate implements this interface as it represents a set of fields that are contiguous from days to forever and require no external information to determine the validity of each date. It is therefore able to implement plus/minus correctly.
// • LocalTime implements this interface as it represents a set of fields that are contiguous from nanos to within days and require no external information to determine validity. It is able to implement plus/minus correctly, by wrapping around the day.
// • MonthDay, the combination of month-of-year and day-of-month, does not implement this interface. While the combination is contiguous, from days to months within years, the combination does not have sufficient information to define the valid range of values for day-of-month. As such, it is unable to implement plus/minus correctly.
// • The combination day-of-week and day-of-month ("Friday the 13th") should not implement this interface. It does not represent a contiguous set of fields, as days to weeks overlaps days to months.

//	Implementation Requirements:
//-This interface places no restrictions on the mutability of implementations, however immutability is strongly recommended. All implementations must be Comparable.

//	Method Summary
// • isSupported​(TemporalUnit unit)						- Checks if the specified unit is supported.
// • minus​(long amountToSubtract, TemporalUnit unit)	- Returns an object of the same type as this object with the specified period subtracted.
// • minus​(TemporalAmount amount)						- Returns an object of the same type as this object with an amount subtracted.
// • plus​(long amountToAdd, TemporalUnit unit)			- Returns an object of the same type as this object with the specified period added.
// • plus​(TemporalAmount amount)						- Returns an object of the same type as this object with an amount added.
// • until​(Temporal endExclusive, TemporalUnit unit)	- Calculates the amount of time until another temporal in terms of the specified unit.
// • with​(TemporalAdjuster adjuster)					- Returns an adjusted object of the same type as this object with the adjustment made.
// • with​(TemporalField field, long newValue)			- Returns an object of the same type as this object with the specified field altered.

public class AnInfo_Temporal {}
