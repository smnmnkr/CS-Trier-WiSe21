package chapter.one;

import java.util.Scanner;

public class E05_IO_Scanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNumber;

        System.out.println("Input: ");

        inputNumber = sc.nextInt();

        System.out.println("Output: " + inputNumber);
    }
}
