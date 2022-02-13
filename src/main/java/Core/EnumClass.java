package Core;

public enum EnumClass {
    SUNDAY(28,34,54),
    MONDAY(28,34,54),
    TUESDAY(28,34,54),
    WEDNESDAY(28,34,54),
    THURSDAY(28,34,54),
    FRIDAY(28,34,54),
    SATURDAY(28,34,54);
    Integer days;
    Integer holidays;
    Integer workingDays;

    EnumClass (Integer days, Integer holidays, Integer workingDays) {
        this.days = days;
        this.holidays = holidays;
        this.workingDays = workingDays;
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
