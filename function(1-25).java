package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random r = new Random();
    static String magicWord  = "This is Magic";

    public static void main(String[] args) {
        System.out.println("===Task1===");
        System.out.println("A function is a block of code which only runs when it is called");
        System.out.println("Should use functions to reuse code: define the code once, and use it many times.");

        System.out.println("===Task2===");
        System.out.println("main");

        System.out.println("===Task3===");
        greet();

        System.out.println("===Task4===");
        printNum(777);

        System.out.println("===Task5===");
        for(int i = 1; i <= 10; i++){
            printNum(i);
        }

        System.out.println("===Task6===");
        int k = 5;
        changeNumber(k);
        System.out.println(String.format("k = %d", k));

        System.out.println("===Task7===");
        multiply(5,4);
        multiply(3,6);
        multiply(7,5);

        System.out.println("===Task8===");
        calc(5,5,'+');
        calc(5,5,'-');

        System.out.println("===Task9===");
        System.out.println(getAvg(1,2,21));

        System.out.println("===Task10===");
        int[] arr = {1, 2, 3, 5, 10, 101};
        System.out.println(isNumberIncludedInArray(arr, 100));

        System.out.println("===Task11===");
        printAllIntegerParts(93);

        System.out.println("===Task12===");
        hello();

        System.out.println("===Task13===");
        System.out.println("we give the same name to two or more functions with different parameters");

        System.out.println("===Task14===");
        numberType(23);
        numberType(23.23f);
        numberType(2323.2323);

        System.out.println("===Task15===");
        System.out.println("How old are you?");
        int x = getScanner().nextInt();

        System.out.println("===Task16===");
        System.out.println(randomize(arr));

        System.out.println("===Task17===");
        System.out.println(changeStr1("FridayForever"));

        System.out.println("===Task18===");
        System.out.println("global variable can be used in any function");
        System.out.println("the created variable within the function is valid only for this function");

        System.out.println("===Task19==="); 
        printWord();
        changeWord(magicWord);
        printWord();

        System.out.println("===Task20===");
        int[] arr20 = {16 , 34 , 8 , 7 , 6 , 2};
        multiplyZugi(arr20); //a
        addOne(arr20);       //b
        setZero(arr20);      //c
        printArr(arr20);     // d - Yes

        System.out.println("===Task21===");
        System.out.println(sumOfDigits(52356));

        System.out.println("===Task22===");
        System.out.println(passwordChecking(new String[]{"asd", "*", "*", "*", "1", "2", "3", "*"}));
        System.out.println(passwordChecking(new String[]{"*", "*", "*", "*", "1", "2", "3", "*"}));
        System.out.println(passwordChecking(new String[]{"a", "b", "c", "d", "*", "*", "*", "*"}));
        System.out.println(passwordChecking(new String[]{"a", "b", "c", "d", "1", "2", "3"}));
        System.out.println(passwordChecking(new String[]{"a", "b", "c", "d", "1", "2", "3", "4"}));

        System.out.println("===Task23===");
        int[][] matrix = new int[3][3];
        getRandomMatrix(matrix);
        printMarix(matrix);
        System.out.println("Sum of the numbers in the matrix:" + sumOfNumbersInMatrix(matrix));

        System.out.println("===Task24===");
        System.out.println("Recursion is the technique of making a function call itself");

        System.out.println("===Task25===");
        System.out.println(String.format("Factorial 5! = %d",factRecursion(5) ));
    }

    private static int factRecursion(int x) {
        int result;

        if(x == 1) return 1;
        result = factRecursion(x - 1) * x;

        return result;
    }

    private static void printMarix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void getRandomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = r.nextInt(100)+1;
            }
        }
    }

    private static double sumOfNumbersInMatrix(int[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static boolean passwordChecking(String[] arr) {
        if(arr.length >= 8){
            String str = "";
            for(int i = 0; i < arr.length; i++){
                str += arr[i];
            }
            char[] characters  = str.toCharArray();
            int counterLetters = 0;
            int counterDigits = 0;
            for (int i = 0; i < characters.length; i++){
                if (Character.isLetter(characters[i])){
                    counterLetters++;
                }
                if (Character.isDigit(characters[i])){
                    counterDigits++;
                }
            }
            if(counterLetters!=0 && counterDigits != 0 && arr.length == characters.length){
                return true;
            }else {
                return false;
            }

        } else {
            return false;
        }
    }

    private static int sumOfDigits(int x) {
        int sum = 0;
        while (x != 0){
            sum += x%10;
            x /= 10;
        }
        return sum;
    }

    private static void setZero(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if (arr[i]%2 != 0){
                arr[i] = 0;
            }
        }
    }

    private static void addOne(int[] arr) {
        arr[arr.length-1] = 0;
    }

    private static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static void multiplyZugi(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if (arr[i]%2 == 0){
                arr[i] *= 2;
            }
        }

    }

    private static String changeWord(String str) {
        magicWord = "Changing";
        return str;
    }

    private static void printWord() {
        System.out.println(magicWord);
    }

    private static String changeStr1(String str) {
        str += "@@@";
        str = changeStr2(str);
        str = changeStr3(str);
        return str;
    }

    private static String changeStr2(String str) {
        str += "**";
        return str;
    }

    private static String changeStr3(String str) {
        str += "#";
        return str;
    }

    private static int randomize(int[] arr) {
        int lengthArr = arr.length;
        int rNumber = r.nextInt(lengthArr);
        return arr[rNumber];
    }

    private static Scanner getScanner() {
        Scanner s = new Scanner(System.in);
        return s;
    }

    private static void numberType(int x) {
        System.out.println(String.format("Number %d has int type ", x));
    }

    private static void numberType(float x) {
        System.out.println(String.format("Number %f has float type ", x));
    }

    private static void numberType(double x) {
        System.out.println(String.format("Number %f has double type ", x));
    }

    private static void hello() {
        System.out.print("Hello");
        world();
    }

    private static void world() {
        System.out.println(" World");
    }

    private static void printAllIntegerParts(int num) {
        for(int i = 1; i <= num; i++){
            if (num%i == 0){
                System.out.println(i);
            }
        }
    }

    private static boolean isNumberIncludedInArray(int[] arr, int num) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            if(num == arr[i]){
                counter++;
            }
        }
        if (counter>0){
            return true;
        } else {
            return false;
        }
    }

    private static float getAvg(int num1, int num2, int num3) {
        float avg = (num1 + num2 + num3)/3;
        return avg;
    }

    private static void calc(int num1, int num2, char ch) {
        if (ch == '+'){
            System.out.println(String.format("%d + %d = %d", num1, num2, num1+num2 ));
        }
        if (ch == '-'){
            System.out.println(String.format("%d - %d = %d", num1, num2, num1-num2 ));
        }
    }

    private static void multiply(int num1, int num2) {
        System.out.println(String.format("%d * %d = %d", num1, num2, num1*num2 ));
    }

    private static void changeNumber(int x) {
        x++;
    }

    private static void printNum(int x) {
        System.out.println(x);
    }

    private static void greet() {
        System.out.println("Good Morning");
    }
}
