import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {


        Person person1 = new Person();


        person1.setDateBirth("2000/07/23");
        System.out.println(person1.getDateBirth());



    }
}
