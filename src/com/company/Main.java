package com.company;
//
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Hello world");
//        System.out.println("I don't know If I can do with java");
//        System.out.println("How should I code, Please someone help me");
//        System.out.println("The things here are quite different from Python");
//    }
//}

//public class Main{
//    public static void main(String[] args) {
//        long age = 30;
//        age = 35;
//        System.out.println(age);
//        age = 3_123_456_789L;   // as default java considers a number as integer, if there is number out of range
        // we have to use long as L at the last of number
//        System.out.println(age);
        // by default jave has the decimal point number as double, for float use suffix f
//        float age = 10.56f;
//        System.out.println(age);
        // for character use data types char
//        char ch = 'A';  // Single quotes are necessary
//        System.out.println(ch);
//            boolean eligble = true;
//            System.out.println(eligble);
//    }
//}

//import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

// Reference types, to store complex objects
//public class Main {
//    public static void main(String[] args) {
////        Date now = new Date();   // new is for creating an instance in of the class date
////        System.out.println(now);
//        // Using reference types
//        Point point1 = new Point(1, 2);
//        System.out.println(point1);
//
//        // creating a refrence, this will get the address of that instance
//        Point point2;
//        point2 = point1;
//        point2.x = 2;
//        System.out.println(point2);
//
//
//    }
//}

// Strings

//public class Main{
//    public static void main(String[] args) {
//        String message = new String("Hello");  // this is also another method
//        System.out.println(message);
//        String message = "Hello world" + "!!";
//        System.out.println(message);
//        String message = "Hello";
//        String person = "Aaqib";
//        System.out.println(message + " " + person);
//        String message = "hello World";
//        System.out.println(message.length());
//        System.out.println(message.endsWith("!!"));
//        System.out.println(message.startsWith("H"));
//        System.out.println(message.indexOf("SKy"));
//        System.out.println(message.replace("h", "H"));
//        System.out.println(message);  // strings are immutable, replace method is creating a new string
//        System.out.println(message.toLowerCase());
//        System.out.println(message.toUpperCase());

//        String mystring = "   Hello aaqib  ";
//        System.out.println(mystring.trim());
        // using escape characters
//        String mystr = "Hello \"Aaqib\"";
//        System.out.println(mystr);
//    }
//}

// Arrays

//public class Main{
//    public static void main(String[] args){
        // to make an array
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 1;
//        System.out.println(Arrays.toString(numbers));
//        String[] words = new String[2];
//        words[0] = "Aaqib";
//        words[1] = "Asim";
//        System.out.println(Arrays.toString(words));
//        int[] numbers = {6, 24, 1, 2};
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers)); // immutable lists in java
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

//    }
//}

// Two dimensional arrays

//public class Main{
//    public static void main(String[] args){
        // to declare the multi-d array
//        int[][] numbers = new int[1][2];
//        numbers[0][1] = 1;
//        System.out.println(Arrays.deepToString(numbers));
//        int[][] numbers = {{1, 2, 3}, {2, 3, 5}, {6, 7, 8}};
//        System.out.println(Arrays.deepToString(numbers));
//    }
//}

// Constants
//public class Main{
//    public static void main(String[] args){
//        final float pi = 3.142F;
//        System.out.println(pi);
//    }
//}

// Arithmetic operations

//public class Main{
//    public static void main(String[] args){
//        double x = 2;
//        double y = 4;
//        System.out.println(x + y);
//        System.out.println(x * y);
//        System.out.println(x / y); // this will result in whole number
//        System.out.println(x / y);
//
//        int x = 1;
//        x++;
//        x += 1;
//        System.out.println(x);
//        int y = ++x;
//        System.out.println(y);
//
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        String x = "1";
//        int result = Integer.parseInt(x) + 2;
//        System.out.println(result);
//        // we also have this parses function for floating-point values and double etc
//
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        int number = (int)Math.round(1.5);
//        System.out.println(number);
//        double number2 = Math.ceil(1.1);
//        System.out.println(number2);
//        double number3 = Math.floor(1.2);
//        System.out.println(number3);
//        int result = Math.max(1, 2);
//        System.out.println(result);
//        // using random function
//        int result2 = (int) (Math.random() * 100);
//        System.out.println(result2);
//        double result = Math.random();
//        System.out.println(result);   // this will return decimal point values
//
//    }
//}

// Formatting numbers
//public class Main{
//    public static void main(String[] args){
//        NumberFormat num = NumberFormat.getCurrencyInstance();
//        String result = num.format(12455.221);
//        System.out.println(result);
//        String result2 = NumberFormat.getPercentInstance().format(0.1);
//        System.out.println(result2);
//        String newresult = NumberFormat.getIntegerInstance().format(124.67);
//        System.out.println(newresult);
//    }
//}

// reading inputs from the user using scanner class
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        byte result = scanner.nextByte();
//        System.out.println("Your result is " + result);
//        Scanner myinput = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String result = myinput.next();
//        System.out.println("Your name is: " + result);
//        Scanner myinput = new Scanner(System.in);
//        System.out.print("Enter your full Name: ");
//        String result = myinput.nextLine();
//        System.out.println(result);
//        System.out.print("Enter your Name: ");
//        System.out.println("Your Name is: " + (new Scanner (System.in)).nextLine());
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        System.out.print("Principal: ");
//        int princ = new Scanner(System.in).nextInt();
//        System.out.print("Annual Interest Rate: ");
//        float annual = new Scanner(System.in).nextFloat();
//        float monthly = annual / 100 / 12;
////        System.out.println(monthly);
//        System.out.print("Period (Years): ");
//        int years = (new Scanner(System.in).nextInt()) * 12;
//        System.out.println(years);
////        System.out.print("Mortgage: ");
//        double total = princ * (monthly * Math.pow(1 + monthly, years)) / (Math.pow(1 + monthly, years) - 1);
//        System.out.println(NumberFormat.getCurrencyInstance().format(total));
//
//
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        System.out.print("Enter any number: ");
//        int number = new Scanner(System.in).nextInt();
//        if (number % 2 == 0){
//            System.out.println("The number " + number + " is Even.");
//        }
//        else{
//            System.out.println("The number " + number + " is Odd");
//        }
//    }
//}
//
//public class Main{
//    public static void main(String[] args){
//        System.out.print("Enter the temperature: ");
//        int number = new Scanner(System.in).nextInt();
//        if (number > 32){
//            System.out.println("It's a Hot day.");
//        }
//        else if (number > 20 && number <= 31){
//            System.out.println("It's a Beautiful day");
//        }
//        else {
//            System.out.println("It's a cold day!");
//        }
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        System.out.println("Welcome to the Java Calculator");
//        System.out.println("1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\n5:Power");
//        System.out.println("'Select the number of operation you want to perform'");
//        int x = new Scanner(System.in).nextInt();
//        String result = "";
//        if (x == 1){
//            result = "Add";
//        }
//        else if (x == 2){
//            result = "Subtract";
//        }
//        else if (x == 3){
//            result = "Multiply";
//        }
//        else if (x == 4){
//            result = "Divide";
//        }
//        else{
//            result = "Take Power";
//        }
//        System.out.print("Enter First Number to " + result + " :");
//        float first_num = new Scanner(System.in).nextFloat();
//
//        System.out.print("Enter Second Number: ");
//        float second_num = new Scanner(System.in).nextFloat();
//        float ans = 0;
//        if (x == 1){
//            ans = first_num + second_num;
//        }
//        else if (x == 2){
//            ans = first_num - second_num;
//        }
//        else if (x == 3){
//            ans = first_num * second_num;
//        }
//        else if (x == 4){
//            ans = first_num / second_num;
//        }
//        else{
//            ans = (float) Math.pow(first_num, second_num);
//        }
//        System.out.print("Your Answer is: ");
//        System.out.println(ans);
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        int income = new Scanner(System.in).nextInt();
//        String result = income > 100_000 ? "First" : "Economy";
//        System.out.println(result);
//    }
//}

// Switch statements

//public class Main{
//    public static void main(String[] args){
//        String role = new Scanner(System.in).nextLine();
//        switch (role){
//            case "Admin":
//                System.out.println("You're Admin");
//                break;
//
//            case "Moderator":
//                System.out.println("You're Moderator");
//                break;
//
//            default:
//                System.out.println("You're guest");
//        }
//    }
//}

// Fizzbuzz exercise

//public class Main{
//    public static void main(String[] args){
//        System.out.print("Enter any number: ");
//        int number = new Scanner(System.in).nextInt();
//
//        if (number % 3 == 0 && number % 5 == 0){
//            System.out.println("FizzBuzz");
//        }
//        else if (number % 3 == 0){
//            System.out.println("Buzz");
//        }
//        else if (number % 5 == 0){
//            System.out.println("Fizz");
//        }
//        else{
//            System.out.println(number);
//        }
//    }
//}

// for loops
//public class Main{
//    public static void main(String[] args){
//        for (int i = 0; i < 5; i++){
//            System.out.println("Aaqib");
//        }
//        for (int i = 5; i > 0; i--){
//            System.out.println("Hello World " + i);
//        }
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        System.out.print("Enter any number: ");
//        float number = new Scanner(System.in).nextFloat();
//        for (int i = 1; i <= 10; i++){
//            System.out.println((int)number + " * " + i + " = " + (int)number * i);
//        }
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        int i = 0;
//        while (i < 5){
//            System.out.println("Hello World");
//            i++;
//        }
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String input = "";

//        while (!input.equals("quit")){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }
//        do {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));
//
//    }
//}

// for loop used for iterations

//public class Main{
//    public static void main(String[] args){
//        String[] fruits = { "Apple", "Mango", "Banana" };
//        for (int i = 0; i < fruits.length; i ++){
//            System.out.println(fruits[i]);
//        }

//        for (String i: fruits){
//            System.out.println(i);
//        }
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        int princ = 0;
//        float monthly = 0;
//        int years = 0;
//        while (true) {
//            System.out.print("Principal: ");
//            princ = new Scanner(System.in).nextInt();
//            if (princ >= 1000 && princ <= 100_000){
//                break;
//            }
//            System.out.println("Please enter value between 1000 and 100000");
//        }
//        while (true) {
//            System.out.print("Annual Interest Rate: ");
//            float annual = new Scanner(System.in).nextFloat();
//            monthly = annual / 100 / 12;
//            if (annual > 0 && annual < 30)
//                break;
//            System.out.println("Enter value between 1 and 30");
//        }
//        while (true) {
//            System.out.print("Period (Years): ");
//            years = (new Scanner(System.in).nextInt());
////            System.out.println(years);
//            if (years > 0 && years <= 30)
//                break;
//            years = years * 12;
//            System.out.println("Please Enter between 1 to 30");
//        }
//        System.out.print("Mortgage: ");
//        double total = princ * (monthly * Math.pow(1 + monthly, years)) / (Math.pow(1 + monthly, years) - 1);
//        System.out.println(NumberFormat.getCurrencyInstance().format(total));
//
//
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1 = sc.next();
//            int x = sc.nextInt();
//            //Complete this line
//            System.out.printf("%-15s%03d%n", s1, x);
//        }
//        System.out.println("================================");
//
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        int a = 0;
//        int b = 2;
//        int n = 10;
//        int factor = 1;
//        int result = a + b;
//        System.out.print(result);
//        for (int j = 1; j < n; j ++){
//            System.out.print(" ");
//            factor *= 2;
//            result += factor * b;
//            System.out.print(result);
//
//        }
//    }
//}