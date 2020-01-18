package kata1.pkg0;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Kata10 {
    //Método main , donde me creo un objeto de la clase Persona e imprimo el nombre y la edad.
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(93,1,18);
        
    
        Persona danilo = new Persona("Danilo", date);
        System.out.println(danilo.getName()+ " tiene " +danilo.getAge() + " años");
    }
}