package com.bridgelabzs;
import java.util.Scanner ;
public class PowerCalculation {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();

        int power2 =2;
        int power = 1;

        for (int i = 1; i <=power2; i++) {
            power = power * num;

        }

        System.out.println(power);
    }
}



