package Classes;
/*Java does not have a built-in Date class, 
but we can import the java.time package to work with the date and 
time API. The package includes many date and time classes. For example:*/
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTime {

    public static void main (String[] args) {
        LocalDate date = LocalDate.now(); 
    /*To display the current date, import the java.time.LocalDate class, 
    and use its now() method: */
    
        LocalTime time = LocalTime.now();
    /*To display the current time (hour, minute, second, and nanoseconds),
     import the java.time.LocalTime class, and use its now() method: */

        LocalDateTime dateTime = LocalDateTime.now();
    /*To display the current date and time, import the 
    java.time.LocalDateTime class, and use its now() method: */
        


        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        /*The "T" in the example above is used to separate the date from 
        the time. You can use the DateTimeFormatter class with the 
        "ofPattern()" method in the same package to format or 
        parse date-time objects. 
        The following example will remove both the "T" and nanoseconds 
        from the date-time: */

        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formattedDateTime = dateTime.format(dateTimeFormat);
        System.out.println(formattedDateTime); 
    }
    
}
