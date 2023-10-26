package enums;

import java.time.LocalDate;

public class DateFormatter {
    public Enum getDay(LocalDate localDate) {
        int day = localDate.getDayOfWeek().getValue();
        return  Day.getEnum(day);
    }
    public Enum getMonth(LocalDate localDate) {
        int month = localDate.getMonth().getValue();
        return Month.getEnum(month);
    }
    public int getYear(LocalDate localDate) {
        int year = localDate.getYear();
        return year;
    }

}