package io.clickhandler.momentGwt.client;

import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.core.client.js.JsNamespace;
import jsinterop.annotations.*;
import momentGwt.resources.MomentGwtBundle;

import java.util.Date;


@JsType(isNative = true)
public class Moment {

    @JsOverlay
    public static void injectJavascript() {
        ScriptInjector.fromString(MomentGwtBundle.INSTANCE.momentWithLocales().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(MomentGwtBundle.INSTANCE.momentTimezoneWithData().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Parse
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment();

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String format);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String format, String locale);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String format, boolean strictParsing);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String format, String locale, boolean strictParsing);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String[] formats);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String[] formats, String locale);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String[] formats, boolean strictParsing);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(String value, String[] formats, String locale, boolean strictParsing);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(Parts parts);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(int millis);

    @JsMethod(namespace = "moment")
    public static native Moment unix(double millis);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(int[] values);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(Moment moment);

    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native Moment moment(Date date);

    // can create a jsmethod with the special formats as an enum

    @JsMethod(namespace = "moment")
    public static native Moment utc();

    @JsMethod(namespace = "moment")
    public static native Moment utc(int millis);

    @JsMethod(namespace = "moment")
    public static native Moment utc(int[] values);

    @JsMethod(namespace = "moment")
    public static native Moment utc(String value);

    @JsMethod(namespace = "moment")
    public static native Moment utc(String value, String format);

    @JsMethod(namespace = "moment")
    public static native Moment utc(String value, String[] formats);

    @JsMethod(namespace = "moment")
    public static native Moment utc(String value, String format, String locale);

    @JsMethod(namespace = "moment")
    public static native Moment utc(Moment moment);

    @JsMethod(namespace = "moment")
    public static native Moment parseZone(String value);

    public native Moment zone(String value);

    public native boolean isValid();

    public native String invalidAt();

    public native CreationData creationData();

    // Used for setting defaults. also works for moment(String, String) already defined above
    @JsMethod(namespace = JsNamespace.GLOBAL)
    public static native void moment(int defaultValue, String property);


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Get + Set
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public native int milliseconds();

    public native Moment milliseconds(int milliseconds);

    public native int seconds();

    public native Moment seconds(int seconds);

    public native int minutes();

    public native Moment minutes(int minutes);

    public native int hours();

    public native Moment hours(int hours);

    // accepts 1 to 31 for date of the month
    public native int date();
    public native Moment date(int date);

    // day of week. sunday = 0
    public native int day();
    public native Moment day(int day);
    public native Moment day(String day);

    // day of the week - locale aware - sets 0 day of week based on locale
    public native int weekday();
    public native Moment weekday(int weekday);

    // ISO day of the week - international aware - 1 is monday, 7 is sunday
    public native int isoWeekday();
    public native Moment isoWeekday(int isoWeekday);

    // week of year, similar to day of week,  will depend on locale
    public native int week();
    public native Moment week(int week);

    // for iso week, when setting week of the year, the day of the week retained
    public native int isoWeek();
    public native Moment isoWeek(int isoWeek);

    // january = 0
    public native int month();
    public native Moment month(int month);
    public native Moment month(String month);

    // quarter
    public native int quarter();
    public native Moment quarter(int quarter);

    // year
    public native int year();
    public native Moment year(int year);

    // based on locale, days at end of year may have same weekYear as beginning
    public native int weekYear();
    public native Moment weekYear(int weekYear);

    public native int isoWeekYear();
    public native Moment isoWeekYear(int isoWeekYear);

    // two getters for weeks in the year
    public native int weeksInYear();
    public native int isoWeeksInYear();

    // get a particular item/unit of a moment
    public native Moment get(String item);

    // set a specified value to a particular of a moment
    public native Moment set(String item, int value);
//    public native Moment set(Object<String, Integer> unitsValues);  last set type takes specific objects, can create this object below and add this in later

    public static native Moment max(Date[] values); // returns max of group, using date instead of moment

    public static native Moment min(Date[] values); // returns min of group, using date instead of moment

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Manipulate
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public native Moment add(int amount, String key);

    public native Moment subtract(int amount, String key);

    // sets to appropriate start. start of year, day, week, month, quarter, etc.
    public native Moment startOf(String key);

    // sets to appropriate end. end of year, day, week, month, quarter, etc. with 11:59:59.999 pm as time
    public native Moment endOf(String key);

    public native Moment local();

    // replaces zone() now
    public native Moment utcOffset();
    public native Moment utcOffset(String offset); // if String required + or - at beginning
    public native Moment utcOffset(int offset);



    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Display
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public native Moment format();
    public native Moment format(String format);

    public native Moment fromNow();
    public native Moment fromNow(boolean noSuffix);

    public native Moment from(Moment moment);
    public native Moment from(Moment moment, boolean noSuffix);

    public native Moment from(String value);
    public native Moment from(String value, boolean noSuffix);

    public native Moment from(int value);
    public native Moment from(int value, boolean noSuffix);

    public native Moment from(Date value);
    public native Moment from(Date value, boolean noSuffix);

    public native Moment from(int[] values);
    public native Moment from(int[] values, boolean noSuffix);

    public native Moment toNow();
    public native Moment toNow(boolean noSuffix);

    public native Moment to(Moment moment);
    public native Moment to(Moment moment, boolean noSuffix);

    public native Moment to(String value);
    public native Moment to(String value, boolean noSuffix);

    public native Moment to(int value);
    public native Moment to(int value, boolean noSuffix);

    public native Moment to(Date value);
    public native Moment to(Date value, boolean noSuffix);

    public native Moment to(int[] values);
    public native Moment to(int[] values, boolean noSuffix);

    public native Moment calendar();
    public native Moment calendar(Moment moment);
    public native Moment calendar(Moment moment, Calendar formats);

    public native Moment diff(Moment moment);
    public native Moment diff(Moment moment, String key);
    public native Moment diff(Moment moment, boolean noSuffix);

    public native Moment diff(String value);
    public native Moment diff(String value, String key);
    public native Moment diff(String value, boolean noSuffix);

    public native Moment diff(int value);
    public native Moment diff(int value, String key);
    public native Moment diff(int value, boolean noSuffix);

    public native Moment diff(Date value);
    public native Moment diff(Date value, String key);
    public native Moment diff(Date value, String key, boolean noSuffix);

    public native Moment diff(int[] values);
    public native Moment diff(int[] values, String key);
    public native Moment diff(int[] values, String key, boolean noSuffix);

    public native Moment valueOf();

    public native Moment daysInMonth();

    public native Moment toArray();

    public native Moment toJSON();

    public native Moment toISOString();

    // returns an object containing year, month, day-of-month, hour, minute, seconds, milliseconds
    public native Object toObject();


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Query
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    // optional String parameter is for precision, defaults to milliseconds but can be defined as other
    // as before, units of time are... year month week day hour minute second

    public native Moment isBefore(Moment moment);
    public native Moment isBefore(Moment moment, String key);

    public native Moment isBefore(String value);
    public native Moment isBefore(String value, String key);

    public native Moment isBefore(int value);
    public native Moment isBefore(int value, String key);

    public native Moment isBefore(Date date);
    public native Moment isBefore(Date date, String key);

    public native Moment isBefore(int[] values);
    public native Moment isBefore(int[] values, String key);

    public native Moment isSame(Moment moment);
    public native Moment isSame(Moment moment, String key);

    public native Moment isSame(String value);
    public native Moment isSame(String value, String key);

    public native Moment isSame(int value);
    public native Moment isSame(int value, String key);

    public native Moment isSame(Date date);
    public native Moment isSame(Date date, String key);

    public native Moment isSame(int[] values);
    public native Moment isSame(int[] values, String key);

    public native Moment isAfter(Moment moment);
    public native Moment isAfter(Moment moment, String key);

    public native Moment isAfter(String value);
    public native Moment isAfter(String value, String key);

    public native Moment isAfter(int value);
    public native Moment isAfter(int value, String key);

    public native Moment isAfter(Date date);
    public native Moment isAfter(Date date, String key);

    public native Moment isAfter(int[] values);
    public native Moment isAfter(int[] values, String key);

    public native Moment isSameOrBefore(Moment moment);
    public native Moment isSameOrBefore(Moment moment, String key);

    public native Moment isSameOrBefore(String value);
    public native Moment isSameOrBefore(String value, String key);

    public native Moment isSameOrBefore(int value);
    public native Moment isSameOrBefore(int value, String key);

    public native Moment isSameOrBefore(Date date);
    public native Moment isSameOrBefore(Date date, String key);

    public native Moment isSameOrBefore(int[] values);
    public native Moment isSameOrBefore(int[] values, String key);

    public native Moment isSameOrAfter(Moment moment);
    public native Moment isSameOrAfter(Moment moment, String key);

    public native Moment isSameOrAfter(String value);
    public native Moment isSameOrAfter(String value, String key);

    public native Moment isSameOrAfter(int value);
    public native Moment isSameOrAfter(int value, String key);

    public native Moment isSameOrAfter(Date date);
    public native Moment isSameOrAfter(Date date, String key);

    public native Moment isSameOrAfter(int[] values);
    public native Moment isSameOrAfter(int[] values, String key);

    public native Moment isBetween(Moment moment, Moment moment2);
    public native Moment isBetween(Moment moment, Moment moment2, String key);

    public native Moment isBetween(String value, String value2);
    public native Moment isBetween(String value, String value2, String key);

    public native Moment isBetween(int value, int value2);
    public native Moment isBetween(int value, int value2, String key);

    public native Moment isBetween(Date date, Date date2);
    public native Moment isBetween(Date date, Date date2, String key);

    public native Moment isBetween(int[] values, int[] values2);
    public native Moment isBetween(int[] values, int[] values2, String key);

    // check if moment is daylight savings time
    public native boolean isDST();

    // check if moment has been moved as a result of daylight savings time
    public native boolean isDSTShifted();

    public native boolean isLeapYear();

    // to check if a variable is a moment
    @JsMethod(namespace = "moment")
    public static native boolean isMoment(); // would be same as moment() instanceof moment

    // to check if a variable is a native JS Date object
    @JsMethod(namespace = "moment")
    public static native boolean isDate();


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // i18n
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    // todo - can overload for generic JSObjects as well
    // get
    @JsMethod(namespace = "moment")
    public static native Object locale();

    // set
    @JsMethod(namespace = "moment")
    public static native Object locale(String locale);  // sets localefor the moment instance
    @JsMethod(namespace = "moment")
    public static native Object locale(String[] locales);
    @JsMethod(namespace = "moment")
    public static native Object locale(String locale, Object localeDef);

    // to list values of current locale units of time
    @JsMethod(namespace = "moment")
    public static native Object months();

    @JsMethod(namespace = "moment")
    public static native Object monthsShort();

    @JsMethod(namespace = "moment")
    public static native Object monthsShort(String format);

    @JsMethod(namespace = "moment")
    public static native Object monthsShort(String format, int selectOne);

    @JsMethod(namespace = "moment")
    public static native Object weekdays();

    @JsMethod(namespace = "moment")
    public static native Object weekdays(int value); // unlike everything else, for this weekdays always have 0 index of Sunday

    @JsMethod(namespace = "moment")
    public static native Object weekdaysShort();

    @JsMethod(namespace = "moment")
    public static native Object weekdaysMin();

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Customize
    ////////////////////////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Durations - duration is a separate class but these methods belong to Moment class
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    @JsMethod(namespace = "moment")
    public static native Duration duration();

    @JsMethod(namespace = "moment")
    public static native Duration duration(int millis); // create a duration with time in milliseconds

    @JsMethod(namespace = "moment")
    public static native Duration duration(String value); // can be in many formats, even ISO 8601, is the string value to parse basically

    @JsMethod(namespace = "moment")
    public static native Duration duration(int value, String unitOfTime);

    @JsMethod(namespace = "moment")
    public static native Duration duration(Object objects);

    @JsMethod(namespace = "moment")
    public static native boolean isDuration(Object object);

    @JsMethod(namespace = "moment")
    public static native Duration as(String unitOfTime);


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Utilities
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    @JsMethod(namespace = "moment")
    public static native String normalizeUnits(String unitOfTime);

    // used to create an invalid moment object
    @JsMethod(namespace = "moment")
    public static native Object invalid(Object object);


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Moment Timezone
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    // set to specific time zone
    public native Moment tz(String timeZone);

    // the rest create moment with a time zone
    @JsMethod(namespace = "moment")
    public static native Moment tz();

    @JsMethod(namespace = "moment")
    public static native Moment tz(String value, String timeZone);

    @JsMethod(namespace = "moment")
    public static native Moment tz(String value, String format, String timeZone);

    @JsMethod(namespace = "moment")
    public static native Moment tz(String value, String format, String locale, String timeZone);

    @JsMethod(namespace = "moment")
    public static native Moment tz(String value, String format, boolean strictParsing, String timeZone);

    @JsMethod(namespace = "moment")
    public static native Moment tz(String value, String format, String locale, boolean strictParsing, String timeZone);

    @JsMethod(namespace = "moment")
    public static native Moment tz(String value, String[] formats, String timeZone);

    @JsMethod(namespace = "moment")
    public static native Moment tz(String value, String[] formats, String locale, String timeZone);

    @JsMethod(namespace = "moment")
    public static native Moment tz(String value, String[] formats, boolean strictParsing, String timeZone);

    @JsMethod(namespace = "moment")
    public static native Moment tz(String value, String[] formats, String locale, boolean strictParsing, String timeZone);

    @JsMethod(namespace = "moment")
    public static native Moment tz(Parts parts, String timeZone);

    @JsMethod(namespace = "moment")
    public static native Moment tz(double millis, String timeZone);  // unix offset millis

    @JsMethod(namespace = "moment")
    public static native Moment tz(int[] values, String timeZone);  // [year, month, day, hour, minute, second, millisecond] - values not entered will default to lowest value

    @JsMethod(namespace = "moment")
    public static native Moment tz(Moment moment, String timeZone);

    @JsMethod(namespace = "moment")
    public static native Moment tz(Date date, String timeZone);

    @JsMethod(namespace = "tz")
    public static native Zone setDefault(String timeZone);

    @JsMethod(namespace = "tz")
    public static native Zone guess(); // not a reliable method per documentation

    @JsMethod(namespace = "tz")
    public static native String zoneName(String timeZone);

    @JsMethod(namespace = "tz")
    public static native String zoneAbbr();

    @JsMethod(namespace = "tz")
    public static native String[] names(); // get names of timezones


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Supporting Classes
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType
    class Parts {
        @JsProperty
        public String year;
        @JsProperty
        public String month;
        @JsProperty
        public String day;
        @JsProperty
        public String hour;
        @JsProperty
        public String minute;
        @JsProperty
        public String seconds;
        @JsProperty
        public String milliseconds;

        @JsIgnore
        public Parts(String year, String month, String day, String hour, String minute, String seconds, String milliseconds) {
            this.year = year;
            this.month = month;
            this.day = day;
            this.hour = hour;
            this.minute = minute;
            this.seconds = seconds;
            this.milliseconds = milliseconds;
        }

        @JsIgnore
        public Parts(String year, String month, String day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @JsIgnore
        public Parts(String hour, String minute, String seconds, String milliseconds) {
            this.hour = hour;
            this.minute = minute;
            this.seconds = seconds;
            this.milliseconds = milliseconds;
        }
    }

    @JsType
    public class CreationData {
        @JsProperty
        public String input;
        @JsProperty
        public String format;
        @JsProperty
        public Object locale; // todo use locale object
        @JsProperty
        public boolean isUTC;
        @JsProperty
        public boolean strict;
    }


    // part of Locale. called Calendar in javascript so keeping that naming here, related to locale
    @JsType
    class Calendar {
        @JsProperty
        public String lastday;
        @JsProperty
        public String sameDay;
        @JsProperty
        public String nextDay;
        @JsProperty
        public String lastWeek;
        @JsProperty
        public String nextWeek;
        @JsProperty
        public String sameElse; // same else is used when more than a week away, future or past

        @JsIgnore
        public Calendar(String lastday, String sameDay, String nextDay, String lastWeek, String nextWeek, String sameElse) {
            this.lastday = lastday;
            this.sameDay = sameDay;
            this.nextDay = nextDay;
            this.lastWeek = lastWeek;
            this.nextWeek = nextWeek;
            this.sameElse = sameElse;
        }
    }
}