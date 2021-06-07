package base;/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        String password;
        Scanner passIn = new Scanner(System.in);

        System.out.print("What is the password? ");
        password = passIn.nextLine();

        if (password.equals("abc$123")) System.out.print("Welcome!");

        else System.out.print("I don't know you.");

    }
}
