public class Main {
    // Question 1 - calculateGrade
    public static char calculateGrade(int i) {
        if (i >= 90) {
            return 'A';
        } else if (80 <= i && i <= 89) {
            return 'B';
        } else if (70 <= i && i <= 79) {
            return 'C';
        } else if (60 <= i && i <= 69) {
            return 'D';
        } else if (50 <= i && i <= 59) {
            return 'E';
        } else {
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "fizzbuzz";
        } else if (i % 3 == 0 && !(i % 5 == 0)) {
            return "fizz";
        } else if (i % 5 == 0 && !(i % 3 == 0)) {
            return "buzz";
        } else {
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack(String hello) {
        if (hello.length() < 2) {
            return hello;
        } else {
            String front = hello.substring(0, 2);
            return front + hello + front;
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int i, int i1, int i2) {
        if ((i1 + i2 == i) || (i1 + i == i2) || (i + i2 == i1)) {
            return true;
        } else {
            return false;
        }
    }

    // Question 5 - endUp
    public static String endUp(String hello) {
        if (hello.length() <= 3) {
            return hello.toUpperCase();
        } else {
            int lastIndex = hello.length() - 3;
            String front = hello.substring(0, lastIndex);
            String end = hello.substring(lastIndex).toUpperCase();
            return front + end;
        }
    }
}