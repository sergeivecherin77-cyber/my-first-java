package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Считывание чисел
*/

public class Solution {

    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   
   int a1 = scanner.nextInt();
   
   int a2 = scanner.nextInt();
   
   int a3 = scanner.nextInt();
   
   System.out.println((a1 + a2 + a3) / 3);
   }
}
