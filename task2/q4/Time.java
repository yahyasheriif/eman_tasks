package q4;

import java.util.Scanner;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Default constructor
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Parameterized constructor
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Setter methods
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    // Getter methods
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
    
    // Method to input time from the user
    public void getTime() {
        try (Scanner scanner = new Scanner(System.in)) {  // Scanner will be closed automatically
            System.out.println("Enter Time in HH:MM:SS format: ");
    
            String dataInput = scanner.nextLine();
            String[] parts = dataInput.split(":");
    
            if (parts.length == 3) {
                this.hours = Integer.parseInt(parts[0]);
                this.minutes = Integer.parseInt(parts[1]);
                this.seconds = Integer.parseInt(parts[2]);
            } else {
                System.out.println("Invalid Format. Please enter time as HH:MM:SS");
            }
        }  // Scanner is automatically closed here
    }

    // Method to add another Time object's time to this one
    public void addTime(Time other) {
        this.seconds += other.seconds;
        this.minutes += other.minutes + this.seconds / 60;
        this.hours += other.hours + this.minutes / 60;

        this.seconds %= 60;
        this.minutes %= 60;
        this.hours %= 24;
    }
    // Method to display time in HH:MM:SS format
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
