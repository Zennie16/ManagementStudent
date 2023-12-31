/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Library {

    protected Scanner sc;

    public Library() {
        sc = new Scanner(System.in);
    }

    public String getString(String mes) {
        System.out.println(mes);
        return sc.nextLine();
    }

    public String getCourseName(String mes) {
        String temp;
        while (true) {
            System.out.print(mes + ": ");
            try {
                String input = sc.nextLine();
                temp = input.trim().toLowerCase();
                if (temp.equalsIgnoreCase("Java") || temp.equalsIgnoreCase("C") || temp.equalsIgnoreCase("C++")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid courseName (Java/C/C++)" );
            }
        }
        return temp;
    }

    public int getInt(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }
}