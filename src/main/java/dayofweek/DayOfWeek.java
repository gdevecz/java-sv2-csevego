package dayofweek;

import java.util.Locale;

public class DayOfWeek {

    private String[] namesOfWeekdays = {"vasárnap", "hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat"};

    public String nameOfWeekdayFromDayOfYear(String startDayOfYear, int daysInAYears) {
        int bias = getIndexOfDay(startDayOfYear) - 1 ;
        int result = bias + (daysInAYears) % 7;
        return namesOfWeekdays[result];
    }

    private int getIndexOfDay(String nameOfDay) {
        for (int i = 0; i < namesOfWeekdays.length; i++) {
            if (namesOfWeekdays[i].equals(nameOfDay.toLowerCase().strip())) {
                return i;
            }
        }
        return -1;
    }
}
