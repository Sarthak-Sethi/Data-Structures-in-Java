/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class java_pq {

          private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
    }    
class Student{
    int id;
    String name;
    double cgpa;
    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    int getID(){
        return id;
    }
    String getName(){
        return name;
    }
    double getCGPA(){
        return cgpa;
    }
}
class Priorities{
     List<Student> getStudents(List<String> events){
         System.out.println(events);
         return null;
     }
}
