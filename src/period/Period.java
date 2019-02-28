package period;

//		Period		- Period class implements Serializable, ChronoPeriod, TemporalAmount

//-A date-based amount of time in the ISO-8601 calendar system, such as '2 years, 3 months and 4 days'.
//-This class models a quantity or amount of time in terms of years, months and days.
//-See Duration for the time-based equivalent to this class.
//
//-Durations and periods differ in their treatment of daylight savings time when added to ZonedDateTime.
//-A Duration will add an exact number of seconds, thus a duration of one day is always exactly 24 hours.
//-By contrast, a Period will add a conceptual day, trying to maintain the local time.
//
//-For example, consider adding a period of one day and a duration of one day to 18:00 on the evening before a daylight savings gap.
//-The Period will add the conceptual day and result in a ZonedDateTime at 18:00 the following day.
//-By contrast, the Duration will add exactly 24 hours, resulting in a ZonedDateTime at 19:00 the following day (assuming a one hour DST gap).
//
//-The supported units of a period are YEARS, MONTHS and DAYS. All three fields are always present, but may be set to zero.
//
//-The ISO-8601 calendar system is the modern civil calendar system used today in most of the world. It is equivalent to the proleptic
// Gregorian calendar system, in which today's rules for leap years are applied for all time.
//
//-The period is modeled as a directed amount of time, meaning that individual parts of the period may be negative.
//
//-This is a value-based class; use of identity-sensitive operations (including reference equality (==), identity hash code,
// or synchronization) on instances of Period may have unpredictable results and should be avoided.
//-The equals method should be used for comparisons.
//
//-This class is immutable and thread-safe.

//Field Summary
//	static ZERO	 - A constant for a period of zero.

//Method Summary
//	addTo​(Temporal temporal)				- Adds this period to the specified temporal object.
//	static between​(LocalDate startDateInclusive, LocalDate endDateExclusive)
//											- Obtains a Period consisting of the number of years, months, and days between two dates.
//	static from​(TemporalAmount amount)		- Obtains an instance of Period from a temporal amount.
//	get​(TemporalUnit unit)					- Gets the value of the requested unit.
//	getChronology()							- Gets the chronology of this period, which is the ISO calendar system.
//	getDays()								- Gets the amount of days of this period.
//	getMonths()								- Gets the amount of months of this period.
//	getUnits()								- Gets the set of units supported by this period.
//	getYears()								- Gets the amount of years of this period.
//	hashCode()								- A hash code for this period.
//	isNegative()							- Checks if any of the three units of this period are negative.
//	isZero()								- Checks if all three units of this period are zero.
//	minus​(TemporalAmount amountToSubtract)	- Returns a copy of this period with the specified period subtracted.
//	minusDays​(long daysToSubtract)			- Returns a copy of this period with the specified days subtracted.
//	minusMonths​(long monthsToSubtract)		- Returns a copy of this period with the specified months subtracted.
//	minusYears​(long yearsToSubtract)		- Returns a copy of this period with the specified years subtracted.
//	multipliedBy​(int scalar)				- Returns a new instance with each element in this period multiplied by the specified scalar.
//	negated()								- Returns a new instance with each amount in this period negated.
//	normalized()							- Returns a copy of this period with the years and months normalized.
//	static of​(int y, int months, int days)	- Obtains a Period representing a number of years, months and days.
//	static ofDays​(int days)					- Obtains a Period representing a number of days.
//	static ofMonths​(int months)				- Obtains a Period representing a number of months.
//	static ofWeeks​(int weeks)				- Obtains a Period representing a number of weeks.
//	static ofYears​(int years)				- Obtains a Period representing a number of years.
//	static parse​(CharSequence text)			- Obtains a Period from a text string such as PnYnMnD.
//	plus​(TemporalAmount amountToAdd)		- Returns a copy of this period with the specified period added.
//	plusDays​(long daysToAdd)				- Returns a copy of this period with the specified days added.
//	plusMonths​(long monthsToAdd)			- Returns a copy of this period with the specified months added.
//	plusYears​(long yearsToAdd)				- Returns a copy of this period with the specified years added.
//	subtractFrom​(Temporal temporal)			- Subtracts this period from the specified temporal object.
//	toTotalMonths()							- Gets the total number of months in this period.
//	withDays​(int days)						- Returns a copy of this period with the specified amount of days.
//	withMonths​(int months)					- Returns a copy of this period with the specified amount of months.
//	withYears​(int years)					- Returns a copy of this period with the specified amount of years.

public class Period {}