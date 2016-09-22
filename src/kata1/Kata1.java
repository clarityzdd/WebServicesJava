package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person ("David", new Date(95,10,24));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
}
