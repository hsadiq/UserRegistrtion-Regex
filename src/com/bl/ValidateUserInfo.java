package com.bl;

import java.util.Scanner;
import java.util.regex.*;

public class ValidateUserInfo {
    Scanner sc = new Scanner(System.in);

    public void checkFirstName(){
        System.out.println("Enter The First Name: ");
        String firstName = sc.nextLine();



        if(Pattern.matches("^[A-Z] {1} [a-z] {3,}", firstName)){
            System.out.println("First Name is Valid");
        }else {
            System.out.println("Invalid Input");
        }
    }
}
