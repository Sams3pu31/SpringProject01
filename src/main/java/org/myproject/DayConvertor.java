package org.myproject;
import java.time.DayOfWeek;
import java.util.Locale;

public class DayConvertor {
    public static String convertToRussian(String dayOfWeekEnglish) {
        DayOfWeek dayOfWeek;
        try {
            dayOfWeek = DayOfWeek.valueOf(dayOfWeekEnglish.trim().toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException e) {
            return "Некорректный день недели";
        }

        switch (dayOfWeek) {
            case MONDAY:
                return "Понедельник";
            case TUESDAY:
                return "Вторник";
            case WEDNESDAY:
                return "Среда";
            case THURSDAY:
                return "Четверг";
            case FRIDAY:
                return "Пятница";
            case SATURDAY:
                return "Суббота";
            case SUNDAY:
                return "Воскресенье";
            default:
                return "Некорректный день недели";
        }
    }}
