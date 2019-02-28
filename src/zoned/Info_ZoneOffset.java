package zoned;

//		ZoneOffset		- class ZoneOffset extends ZoneId implements Serializable, Comparable<ZoneOffset>, TemporalAccessor, TemporalAdjuster

//-A time-zone offset from Greenwich/UTC, such as +02:00.
//-A time-zone offset is the amount of time that a time-zone differs from Greenwich/UTC. This is usually a fixed number of hours and minutes.
//
//-Different parts of the world have different time-zone offsets.
//-The rules for how offsets vary by place and time of year are captured in the ZoneId class.
//
//-For example, Paris is one hour ahead of Greenwich/UTC in winter and two hours ahead in summer.
// The ZoneId instance for Paris will reference two ZoneOffset instances - a +01:00 instance for winter, and a +02:00 instance for summer.
//
//-In 2008, time-zone offsets around the world extended from -12:00 to +14:00. To prevent any problems with that range being extended,
// yet still provide validation, the range of offsets is restricted to -18:00 to 18:00 inclusive.
//
//-This class is designed for use with the ISO calendar system. The fields of hours, minutes and seconds make assumptions that are valid
// for the standard ISO definitions of those fields. This class may be used with other calendar systems providing the definition of
// the time fields matches those of the ISO calendar system.
//
//-Instances of ZoneOffset must be compared using equals(java.lang.Object). Implementations may choose to cache certain common offsets,
// however applications must not rely on such caching.
//
//-This is a value-based class; use of identity-sensitive operations (including reference equality (==), identity hash code,
// or synchronization) on instances of ZoneOffset may have unpredictable results and should be avoided.
//-The equals method should be used for comparisons.
//
//-This class is immutable and thread-safe.

public class Info_ZoneOffset {}