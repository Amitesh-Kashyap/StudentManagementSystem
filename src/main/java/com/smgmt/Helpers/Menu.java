package com.smgmt.Helpers;

import java.util.Scanner;

import com.smgmt.Models.Student;
import com.smgmt.Service.Serv_Instructors;
import com.smgmt.Service.Serv_Students;

public class Menu
{
    Serv_Students serv_students;
    Serv_Instructors serv_instructors;
    public Menu()
    {
        serv_students = new Serv_Students();
        serv_instructors = new Serv_Instructors();
    }

    public void displayCRUDStudent(Scanner sc)
    { 
        System.out.println("1. Add Student\t\t2. Read Student\t\t3. Update Student\t4. Delete Student\t5. Back");
        int ch = sc.nextInt();
        sc.nextLine();
        if(ch == 1)
        {
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            System.out.print("Enter age : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter e-mail : ");
            String email = sc.nextLine();

            serv_students.save_student(new Student(name , age , email));
            // Redirect to the same menu page but how
        }

    }
    public void displayMainMenu(Scanner sc)
    {
        System.out.println("---------------- Welcome to the Student Management System ----------------");
        System.out.print("1. CRUD on :\n1. Students Database\t2. Courses Database\t3. Enrollments Database\t\t4. Instructors\t5. Assigned-Course Database\t6. Exit\n\nYour choice : ");
        int choice = sc.nextInt();
        if(choice == 1)
        {
            System.out.println("You have chosen to perform CRUD operations on Students Database");
            displayCRUDStudent(sc);
        }
    }

    
}
