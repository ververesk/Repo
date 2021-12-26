package udemy.enums;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.daysInfo();
        System.out.println(WeekDays.MONDAY.equals(WeekDays2.MONDAY)); //false потому что разных enum
        WeekDays weekDays  =WeekDays.valueOf("MONDAY"); //написание должно совпадать с константой
        System.out.println(weekDays);
        WeekDays [] days = WeekDays.values();
        System.out.println(Arrays.toString(days));
    }
}

enum WeekDays{
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;
//конструктор всегда private, через new не создается
    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}
enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

class Today {
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("go to work");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("do not go to work");
                break;
        }
        System.out.println("Настроение в этот день: "+weekDays.getMood());
    }
}
