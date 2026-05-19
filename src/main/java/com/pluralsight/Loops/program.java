package com.pluralsight.Loops;
import java.util.ArrayList;
import java.util.Scanner;



public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //An arraylist of 10 people
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("John", "Smith", 18));
        people.add(new Person("Mubarak", "Boss", 19));
        people.add(new Person("Jane", "Song", 20));
        people.add(new Person("Mubarak", "Jones", 21));
        people.add(new Person("Yusra", "Traore", 22));
        people.add(new Person("fadel", "Boss", 25));
        people.add(new Person("Ramdane", "Yirou", 25));
        people.add(new Person("Mubarak", "Don", 29));
        people.add(new Person("Neymar", "Boss", 28));
        people.add(new Person("Chris", "Juan", 27));


        //Promoting the user for name search
        System.out.println("Enter first/last name: ");
        String name = scanner.nextLine();


        boolean found = false;
        for (Person person : people) {
            if (name.equals(person.getFirstName()) || name.equals(person.getLastName())) {
                System.out.println(person);
                found = true;
            }

        }
        if(!found) {
            System.out.println("Name not found");
        }













    }
}
