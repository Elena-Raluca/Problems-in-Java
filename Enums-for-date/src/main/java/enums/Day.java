package enums;

public enum Day {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private int id;

    Day(int id) {
        this.id = id;
    }


    public static Enum getEnum(int id) {
        for (Day day : values()) {
            if (day.id == id) {
                return day;
            }
        }
        if (id > 7) {
            throw new IllegalArgumentException("Invalid day of week ID: " + id);
        }
        return null;
    }
}

