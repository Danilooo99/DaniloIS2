package kata1;

import java.util.Date;

public class Kata1 {
    //Método main , donde me creo un objeto de la clase Persona e imprimo el nombre y la edad.
    public static void main(String[] args) {
        Persona danilo = new Persona("Danilo Rivero Pérez", new Date(93, 1, 18));
        System.out.println(danilo.getName()+ " tiene " +danilo.getAge() + " años");
    }
}

