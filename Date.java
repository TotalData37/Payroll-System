// Date.java – This holds basic data of birthdates
//CSIS 212-B02
//No external citations used
package assignmentseven;

public class Date {
    private int month;
    private int day;
    private int year;

    // This is a Constructor.
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

   
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // display formatted month+day+year.
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
