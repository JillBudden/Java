/* Intructions: 

- The constructor must consume a month, day and year in that order.

- Limit the year to the interval [1900,2100). If the year falls outside this range, throw an IllegalArgumentException.

- It must be impossible to construct a nonexistent date like "October the 64th" or (more difficult) 
"April 31st" or (still more difficult) "February 29, 2015". In any such case, the constructor should 
throw an IllegalArgumentException and complain about the day.

--------------------------------------------------

Here is an enumeration for days of the week:

public enum Day {
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
} 

Add a method specification to the interface DateInterface (from Homework 2):
public Day dow(); // "dow" means "day of the week" 
  
See the text, problem 1.2.29, for a formula. Implement this method in DateObject and test it in the tester class. Note that Day.values() 
might be useful for clean code.

Please note the text contains an error, which is called out on the web: http://introcs.cs.princeton.edu/java/errata/errata-printing3.php

p. 43, Exercise 1.2.29
Printed: (14 + 2483 + (31*12) / 12) % 7 = 2500 % 7 = 1
Fixed:	 (14 + 2483 + (31*12) / 12) % 7 = 2528 % 7 = 1
Reported by Zhong Shao, 01-Jan-12.

Submit Day.java, DateInterface.java, DateObject.java, and TestDate.java.

*/


public class DateObject implements DateInterface {
	private int month;
	private int day;
	private int year;

    public DateObject(int month, int day, int year) {
    	if (month < 1 || month > 12) {
    		throw new IllegalArgumentException(month + " out of range");
    	}
   		if (day < 1 || day > 31) {
        	throw new IllegalArgumentException(day + " out of range");
    	}
    	if (year < 1900 || year > 2099) {
        	throw new IllegalArgumentException(year + " out of range");
    	}
    	
    	/* dealing with 31st of the month */
    	if (month == 2 && day == 31) {
        	throw new IllegalArgumentException("There is no 31st day in: " + month);
    	}
    	if (month == 4 && day == 31) {
        	throw new IllegalArgumentException("There is no 31st day in: " + month);
    	}
    	if (month == 6 && day == 31) {
        	throw new IllegalArgumentException("There is no 31st day in: " + month);
    	}
    	if (month == 9 && day == 31) {
        	throw new IllegalArgumentException("There is no 31st day in: " + month);
    	}
    	if (month == 11 && day == 31) {
        	throw new IllegalArgumentException("There is no 31st day in: " + month);
    	}
    	
    	/* dealing with leap year */
    	if (month == 2 && day == 29 && year > 1900 && year < 1904) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1904 && year < 1908) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1908 && year < 1912) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1912 && year < 1916) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1916 && year < 1920) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1920 && year < 1924) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1924 && year < 1928) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1928 && year < 1932) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1932 && year < 1936) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1936 && year < 1940) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1940 && year < 1944) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 19044 && year < 1948) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1948 && year < 1952) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1952 && year < 1956) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1956 && year < 1960) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1960 && year < 1964) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1964 && year < 1968) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
   		if (month == 2 && day == 29 && year > 1968 && year < 1972) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1972 && year < 1976) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1976 && year < 1980) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1980 && year < 1984) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1984 && year < 1988) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1988 && year < 1992) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1992 && year < 1996) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 1996 && year < 2000) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2000 && year < 2004) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2004 && year < 2008) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2008 && year < 2012) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2012 && year < 2016) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2016 && year < 2020) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2020 && year < 2024) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2024 && year < 2028) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2028 && year < 2032) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2032 && year < 2036) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2036 && year < 2040) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2040 && year < 2044) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2044 && year < 2048) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2048 && year < 2052) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2052 && year < 2056) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2056 && year < 2060) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2060 && year < 2064) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2064 && year < 2068) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2068 && year < 2072) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2072 && year < 2076) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2076 && year < 2080) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2080 && year < 2084) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	if (month == 2 && day == 29 && year > 2084 && year < 2088) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
   		if (month == 2 && day == 29 && year > 2088 && year < 2092) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
  		if (month == 2 && day == 29 && year > 2092 && year < 2096) {
    		throw new IllegalArgumentException("There is no feb 29 in this year"); 
    	}
    	
    	this.month = month;
    	this.day = day;
    	this.year = year;
    }
    
    public int getMonth() {
    	return this.month;
    }

    public int getDay() {
    	return this.day;
    }

    public int getYear() {
    	return this.year;
    }

    public boolean same(DateInterface that) {
    	return (this.month == that.getMonth()) && (this.day == that.getDay()) && (this.year == that.getYear());
    }

    public boolean before(DateInterface that) {
    	return (this.year < that.getYear()) || (this.year == that.getYear() && this.month < that.getMonth()) ||
        (this.year == that.getYear() && this.month == that.getMonth() && this.day < that.getDay());
    }

	public boolean after(DateInterface that) {
		return (this.year > that.getYear()) || (this.year == that.getYear() && this.month > that.getMonth()) ||
		       (this.year == that.getYear() && this.month == that.getMonth() && this.day > that.getDay());
	}

	public Day dow() { // "dow" means "day of the week"
		int y = this.year - (14 - this.month)/12;
		int x = y + y/4 - y/100 + y/400;
		int m = this.month + 12 * ((14 - this.month)/12) - 2;
		int d = (this.day + x + (31 * m)/12) % 7;

		Day dow = Day.SUNDAY; //need for this to work
		if (d == 0) {dow = Day.SUNDAY;} 
		if (d == 1) {dow = Day.MONDAY;} 
		if (d == 2) {dow = Day.TUESDAY;} 
		if (d == 3) {dow = Day.WEDNESDAY;} 
		if (d == 4) {dow = Day.THURSDAY;}
		if (d == 5) {dow = Day.FRIDAY;}
		if (d == 6) {dow = Day.SATURDAY;}
	
		return dow;
		
	} 

    public String toString() {
    	return this.month + "." + this.day + "." + this.year;
    }
}

