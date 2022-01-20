/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l01;

/**
 *
 * @author leila
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        day = 1;
        month = 1;
        year = 1970;
    }
    public Date(int new_day, int new_month, int new_year) {
        day = new_day;
        month = new_month;
        year = new_year;
    }

    public void setDate(int new_day, int new_month, int new_year) {
        day = new_day;
        month = new_month;
        year = new_year;
    }

    public String getDate() {
        return convertToString();
    }

    private String convertToString() {
        String s_day = Integer.toString(day);
        String s_month = Integer.toString(month);
        String s_year = Integer.toString(year);
        String total = s_day + "." + s_month + "." + s_year;
        return total;
    }

    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("Date date1 = new Date() -> " + date1);

        System.out.println("date1.getDate() -> " + date1.getDate());

        date1.setDate(20,1,2022);
        System.out.println("date1.setDate(20,1,2022)");

        System.out.println("date1.getDate() -> " + date1.getDate());


        Date date2 = new Date(20,1,2022);
        System.out.println("Date date2 = new Date() -> " + date2);
        System.out.println("date2.getDate() -> " + date2.getDate());
    }
}
