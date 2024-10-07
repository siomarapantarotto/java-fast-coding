package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class Formatter {
    public static void main(String[] args) {
        DateTimeFormatter formatterLenient = DateTimeFormatter.ofPattern("uuuu-MM-dd").withResolverStyle(ResolverStyle.LENIENT);
        LocalDate dateLenient = LocalDate.parse("2023-02-31", formatterLenient);
        System.out.println("LENIENT: " + dateLenient);
    }
}
