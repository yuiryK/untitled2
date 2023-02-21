import java.lang.Math.*;

public class Main {
    public static void printEqual(int p1, int p2, int p3) {
        if (p1 < 0 || p2 < 0 || p3 < 0) {
            System.out.println("Invalid Value");
        } else if (p1 == p2 && p2 == p3) {
            System.out.println("All numbers are equal");
        } else if (p1 == p2 || p2 == p3 || p1 == p3) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }

    public static double convertToCentimeters(int inches) {
        double centimeters = inches * 2.54;
        return centimeters;
    }

    public static double convertToCentimeters(int feet, int inches) {
        double centimeters = (feet * 12 + inches) * 2.54;
        return centimeters;
    }

    public static double area(double radius) {
        double area;
        if (radius < 0) {
            area = -1;
        } else {
            area = radius * radius * Math.PI;
        }
        return area;
    }

    public static double area(double x, double y) {
        double area;
        if (x < 0 || y < 0) {
            area = -1;
        } else {
            area = x * y;
        }
        return area;
    }

    public static void printYearsAndDays(long minutes) {
        int years = (int) (minutes / 60 / 24 / 365);
        int days = (int) (minutes / 60 / 24 % 365);
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean isPlayed = false;
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                isPlayed = true;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                isPlayed = true;
            }
        }
        return isPlayed;
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);

        System.out.println("Task 2");
        System.out.println(convertToCentimeters(10));
        System.out.println(convertToCentimeters(5, 10));

        System.out.println("Task 3");
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        System.out.println("Task 4");
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

        System.out.println("Task 5");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
}