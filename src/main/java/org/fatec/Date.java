package org.fatec;

import javax.swing.*;

public class Date {

    private Integer day;
    private Integer month;
    private Integer year;

    public Integer getMonth() {
        return month;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getYear() {
        return year;
    }


    public void setMonth(Integer month) {
        this.month = month;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    Date(Integer day, Integer month, Integer year) {
        if (!validateDate(day, month, year)) {
            setDay(0);
            setMonth(0);
            setYear(0);

            return;
        }

        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public String showDate() {

        return String.format("%02d", getDay()) + "/" + String.format("%02d", getMonth()) + "/" + getYear();
    }

    public Boolean validateDate(Integer day, Integer month, Integer year) {
        if (month < 1 || month > 12) return false;

        if (day < 1) return false;

        if (!validateDayMonth(day, month)) return false;

        return true;
    }

    public Boolean validateDayMonth(Integer day, Integer month) {
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
            return false;
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        }

        if (month == 2 && day > 29) {
            return false;
        }

        return true;
    }


    public static void main(String[] args) {

        Integer day = Integer.parseInt(JOptionPane.showInputDialog("inform the day:"));
        Integer month = Integer.parseInt(JOptionPane.showInputDialog("inform the month:"));
        Integer year = Integer.parseInt(JOptionPane.showInputDialog("inform the year:"));

        Date date = new Date(day, month, year);
        String printDate = date.showDate();
        System.out.println(printDate);
    }

}
