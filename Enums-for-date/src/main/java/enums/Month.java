package enums;

public enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);
    private final int id;

    Month(int id) {
        this.id = id;
    }
    public static Enum getEnum(int id) {
        for (Month month : values()) {
            if (month.id == id) {
                return month;
            }
        }
        if (id > 12) {
            throw new IllegalArgumentException("Invalid month ID: " + id);
        }
        return null;
    }
}
