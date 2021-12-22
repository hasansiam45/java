package datePackage;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time1 {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println(formattedTime);
    }
}
