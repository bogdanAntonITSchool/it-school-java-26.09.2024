package date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDate zonedLocalDate = LocalDate.now(ZoneId.of("Australia/Sydney"));

        System.out.println(zonedLocalDate);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        String formattedDate = localDate.format(dtf);

        System.out.println(formattedDate);

        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("d/M/yyyy'T'HH:mm:ss");
        String format = localDateTime.format(dtfTime);

        System.out.println(format);


        // old java.util.Date
        java.util.Date date = new java.util.Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
        String formattedDate2 = sdf.format(date);

        System.out.println(formattedDate2);

        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        System.out.println(sqlDate);

        java.util.Date date1 = new java.util.Date();
        date1.setTime(sqlDate.getTime());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZoneId zone = zonedDateTime.getZone();

        System.out.println(zone);

        Random random = new Random();
    }
}
