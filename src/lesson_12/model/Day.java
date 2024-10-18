package lesson_12.model;

public enum Day {
    MONDAY("Пн"),
    TUESDAY("Вт"),
    WEDNESDAY("Ср"),
    THURSDAY("Чт"),
    FRIDAY("Пт"),
    SATURDAY("Сб"),
    SUNDAY("Вс");

    private String rusTitle;

    Day(String rusTitle) {
        this.rusTitle = rusTitle;
    }

    public String getRusTitle() {
        return rusTitle;
    }
}
