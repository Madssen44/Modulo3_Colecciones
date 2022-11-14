/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.madssen.examples;

//<Integer> (<operador diamante>) diamond operator 
import com.madssen.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExamples {

    private final static List<User> users = new ArrayList<>();

    /*al hacerlo final impedimos que se asigne una nueva instancia "user" */
    public static List<User> getUsers() {
        return users;
    }

    public static void createUser(String nickName, String password, String email) {

        User user = new User(nickName, password, email);

        if (users.isEmpty()) {

            users.add(user);

        } else {
            VAL:
            for (int i = 0; i < users.size(); i++) {

                if (user.getNickName().equals(users.get(i).getNickName())) {

                    System.out.println("Este usuario ya existe");

                } else {

                    users.add(user);
                    break VAL;
                }
            }
        }
    }

    public static void showUsers() {

        if (!users.isEmpty())/*users.size>0*/ {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getNickName() != null) {
                    System.out.println(users.get(i));
                } else {
                    System.out.println("este elemento esta vacio");
                }
            }
        } else {
            System.out.println("No hay valores que mostrar");
        }

    }

    public static void showUser(String nickName, int mail) {
        if (!users.isEmpty()) {
            for (int i = 0; i < users.size(); i++) {

                switch (mail) {
                    case 1:
                        if (users.get(i).getNickName().equals(nickName)) {
                            System.out.println("Usted ha buscado el mail de: " + users.get(i).getNickName() + "\n\t " + users.get(i).getEmail());
                        }
                        break;
                    case 2:
                        if (users.get(i).getNickName().equals(nickName)) {
                            System.out.println("Usted ha buscado la informacion de: " + users.get(i).getNickName() + "\n\t " + users.get(i));
                        }
                        break;

                    default:
                        throw new AssertionError();
                }

            }
        } else {
            System.out.println("No hay valores que mostrar");
        }
    }

    public static void deleteUser(String nickName) {

        if (!users.isEmpty()) {
            VAL:
            for (int i = 0; i < users.size(); i++) {

                if (users.get(i).getNickName().equals(nickName)) {
                    users.remove(i);
                }
            }
        } else {
            System.out.println("No hay valores que eliminar");
        }

    }

    public static void refill(String nickName, int val, Scanner sc) {

        if (!users.isEmpty()) {
            VAL:
            for (int i = 0; i < users.size(); i++) {
                String text = sc.nextLine();
                if (users.get(i).getNickName().equals(nickName)) {
                    switch (val) {
                        case 1:
                            System.out.println("Introduzca el nuevo nombre: ");
                            users.get(i).setNickName(text);
                            break;
                        case 2:
                            System.out.println("Introduzca la nueva contraseña");
                            users.get(i).setPassword(text);
                            break;
                        case 3:
                            System.out.println("Introduzca el nuevo mail");
                            users.get(i).setEmail(text);
                            break;
                        default:
                            throw new AssertionError();
                    }
                }

            }
        } else {
            System.out.println("No hay valores que cambiar");
        }

    }

}
