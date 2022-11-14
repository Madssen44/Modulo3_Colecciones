/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.madssen.app;

import com.madssen.examples.ListExamples;
import com.madssen.model.User;
import java.util.List;
import java.util.Scanner;


public class AppMain {
    
    Scanner sc;
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ListExamples.createUser("madssen", "332255", "madssen@gmail.com");
        ListExamples.createUser("awadeuwu", "775588", "awadeuwu@gmail.com");
        ListExamples.createUser("uwudeiwi", "449966", "uwudeiwi@gmail.com");
        List<User> users = ListExamples.getUsers();  
        ListExamples.showUser("madssen",1);
        ListExamples.showUsers();
        ListExamples.deleteUser("madssen");
        ListExamples.showUsers();
        ListExamples.refill("awadeuwu", 3, sc);
        ListExamples.showUsers();
        sc.close();
    }
    
}
