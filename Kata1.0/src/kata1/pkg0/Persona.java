package kata1.pkg0;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {

    private String name;
    private Calendar birthDate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25); 
    
    //Constructor.
    public Persona(String name, Calendar birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis()-birthDate.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles){
        return milles / MILLISECONDS_PER_YEAR;
        
    }
    

    private long getSecondsInMilliseconds(long milliseconds) {
        return milliseconds / 1000;
    }

    private long getMinutesInSeconds(long seconds) {
        return seconds / 60;
    }

    private long getHoursInMinutes(long minutes) {
        return minutes / 60;
    }

    private long getDaysInHours(long hours) {
        return hours / 24;
    }

    private long getYearsInDays(long days) {
        return (long) (days / 365.25);
    }
    //Devuelvo un objeto de clase Date.
    private Date today() {
        return new Date();
    }
    ////Devuelvo el nombre.
    public String getName() {
        return name;
    }
    //Devuelvo la fecha de cumpleaños.
    public Calendar getBirthDate() {
        return birthDate;
    }
}

