package questions.coderbyte;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DifferenceBetweenTwoTimeStamps {
    public static void main(String[] args) throws ParseException {
        System.out.println(timeCount("1:00am-12:00pm"));
    }

    static long timeCount(String str) throws ParseException {
        String[] times = str.split("-");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd h:ma");

        LocalDateTime f1 = LocalDateTime.parse("1990-01-01 " + times[0], format);
        LocalDateTime f2 = LocalDateTime.parse("1990-01-01 " + times[1], format);
        if (f2.isBefore(f1)) { f2 = f2.plusDays(1); }

        return Duration.between(f1,f2).toMinutes();
    }
}
