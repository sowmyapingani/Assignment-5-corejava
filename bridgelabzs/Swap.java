package com.bridgelabzs;

public class Swap {
    public static void main(String[] args) {
    float first = 1.54f, second = 1.25f;
    System.out.println("  before swap  ");
    String number;
    System.out.println("first number = " + first);
    System.out.println("second number =" + second);
    float temporary = first;
    first = second;
    second = temporary;
    System.out.println("  after swap  ");
    System.out.println("first number =" + first);
    System.out.println("second number =" + second);
}

}




