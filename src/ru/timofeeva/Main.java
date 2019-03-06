package ru.timofeeva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            printMenu();
            String option = scan.nextLine().trim();
            if ("0".equals(option)) {
                break;
            }
            if ("1".equals(option)) {
                System.out.println("calculator.");
                System.out.println("Please, enter value.");
                try {
                    Calculator calculator = new Calculator(scan.nextLine());
                    calculator.findOperation();
                    calculator.findParameters();

                    System.out.println(String.format("Result = " + "%.4f", calculator.calculate()));
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            } else if ("2".equals(option)) {
                System.out.println("max length of element in the array.");
                System.out.println("Please, enter the size of array:");
                int size;
                try {
                    size = scan.nextInt();
                    scan.nextLine();

                } catch (Exception e) {
                    System.out.println("The size of array must be int");
                    continue;
                }

                try {
                    ArrayMaxLength str = new ArrayMaxLength(size);
                    for (int i = 0; i < size; i++) {
                        System.out.println("Please, enter the value of element " + i + ":");
                        str.addElementsInArray(i, scan.nextLine());
                    }
                    int e = str.maxLength();
                    str.getMaxElementOfArray(e);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("wrong choice!");
            }
        }

    }

    public static void printMenu() {
        System.out.println("Available options:");
        System.out.println("\t 0 - exit;");
        System.out.println("\t 1 - calculator;");
        System.out.println("\t 2 - max length of element in the array.");
        System.out.println("Your choice:");
    }
}
