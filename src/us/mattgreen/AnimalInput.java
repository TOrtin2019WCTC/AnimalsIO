/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mattgreen;

import java.util.*;

/**
 *
 * @author Tim Ortin
 */
public class AnimalInput {

    Scanner keyboard = new Scanner(System.in);
    private ArrayList list;

    public AnimalInput() {

    }

    public void addCat(ArrayList list) {
        int i = Integer.MAX_VALUE;

        System.out.println("Enter the name of the cat: ");
        String catName = keyboard.nextLine();
        while (i == Integer.MAX_VALUE) {
            System.out.println("Enter the number of mice killed");
            String miceKilled = keyboard.nextLine();
            try {
                i = Integer.parseInt(miceKilled);
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number: ");
            }

            new Cat(i, catName);
        }
    }

    public void addDog(ArrayList list) {

        String friendly;
        System.out.println("Enter the name of the dog:");
        String dogName = keyboard.nextLine();

        do {
            System.out.println("Is the dog friendly? Y/N");
            friendly = keyboard.nextLine().toUpperCase();
            
            // this may not be a valid use of a trycatch block. 
            try {

                if (friendly.equals("Y")) {
                    new Dog(true, dogName);

                } else if (friendly.equals("N")) {
                    new Dog(false, dogName);

                }
            } catch (Exception e) {
                System.out.println("Invalid entry, Enter Y or N");
            }

        } while ((!friendly.equals("Y")) || (!friendly.equals("N")));

    }

    public void addStudent(ArrayList list) {

        int i = Integer.MAX_VALUE;

        System.out.println("Enter the name of the student: ");
        String studentName = keyboard.nextLine();

        while (i == Integer.MAX_VALUE) {
            System.out.println("Enter the age of the studnet: ");
            String studentAge = keyboard.nextLine();

            try {
                i = Integer.parseInt(studentAge);

            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number");
            }
        }

        new Student(i, studentName);
    }

    public void prompt(ArrayList list) {

        System.out.println("press 1. to add cat\n2. to add dog\n3. to add stud"
                + "ent");
        String ans = keyboard.nextLine();
        if (ans.equals("1")) {
            addCat(list);

        } else if (ans.equals("2")) {
            addDog(list);

        } else if (ans.equals("3")) {
            addStudent(list);
        }
    }

}
