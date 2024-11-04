package q3;

import java.util.Scanner;

public class Date{
    private int month;
    private int day;
    private int year;

    public Date() {
        month = 0;
        day = 0;
        year = 0;
    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void getDate() {
        try (Scanner scanner = new Scanner(System.in)) {  // Automatically closes after try block
            System.out.println("Enter Data (MM/DD/YY): ");
            String dataInput = scanner.nextLine();
            String[] parts = dataInput.split("/");

            if (parts.length == 3) {
                this.month = Integer.parseInt(parts[0]);
                this.day = Integer.parseInt(parts[1]);
                this.year = Integer.parseInt(parts[2]);

                if (this.year < 100) {
                    this.year += 2000;
                }
            } else {
                System.out.println("Invalid data format.");
            }
        }
    }

    public void showDate() {
        System.out.printf("Date: %02d/%02d/%02d%n", month, day, year % 100);
    }
}
