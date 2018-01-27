/* Notes: 

- The constructor must consume a month, day and year in that order.

- Limit the year to the interval [1900,2100). If the year falls outside this range, throw an IllegalArgumentException.

- It must be impossible to construct a nonexistent date like "October the 64th" or (more difficult) 
"April 31st" or (still more difficult) "February 29, 2015". In any such case, the constructor should 
throw an IllegalArgumentException and complain about the day.

*/


public class DateObject implements DateInterface {
	private int month;
	private int day;
	private int year;
	
	
	/* Your constructor can be heavily simplified, especially regarding how you deal with the leap year. You can see what the 
    'modulo 4' returns and check for leap year that way, along with other considerations, so that you don't manually hard code 
     leap year considerations. (-1 clarity) */
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

	/* For the function after(...), you can just use functions same(...) and before(...) to remove the redundant lines in 
	code. (I did not take off points for this.) */
	public boolean after(DateInterface that) {
		return (this.year > that.getYear()) || (this.year == that.getYear() && this.month > that.getMonth()) ||
		       (this.year == that.getYear() && this.month == that.getMonth() && this.day > that.getDay());
	}
	
	/* for example (my try at the correct code):
	public boolean after(DateInterface that) {
		if (this.before() == true && this.same() == false) {
			return true;
		}
		if (this.before() == true || this.same() == true) {
			return false;
		}
	} */

    public String toString() {
    	return this.month + "." + this.day + "." + this.year;
    }
}

