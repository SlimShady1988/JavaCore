package Core;

public enum EnumClass {
    SUNDAY(28,34,54),
    MONDAY(28,34,54),
    TUESDAY(28,34,54),
    WEDNESDAY(28,34,54),
    THURSDAY(28,34,54),
    FRIDAY(28,34,54),
    SATURDAY(28,34,54);

    final Integer days;
    final Integer holidays;
    final Integer workingDays;

    EnumClass (Integer days, Integer holidays, Integer workingDays) {
        this.days = days;
        this.workingDays = workingDays;
        this.holidays = holidays;
    }

    public Integer getDays() {
        return days;
    }

    public Integer getHolidays() {
        return holidays;
    }

    public Integer getWorkingDays() {
        return workingDays;
    }
}

class TryCl {
    public static void main(String[] args) {
        int ret = EnumClass.SUNDAY.getDays() + EnumClass.MONDAY.days;
        System.out.println(ret);
    }
}