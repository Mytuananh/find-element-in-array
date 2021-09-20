package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String[] teacher = {"Lan", "Hoa", "Mai", "Tùng", "Trúc", "Cúc"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's teacher: ");
        String name = scanner.nextLine();
        boolean not = false;
        for (int i = 0; i < teacher.length; i++) {
            if (teacher[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is: " + i);
                not = true;
                break;
            }
        }
        if (!not) {
            System.out.println("Not found " + name + " in the list name's teacher.");
        }
    }
}
