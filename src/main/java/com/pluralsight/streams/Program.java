package com.pluralsight.streams;
import com.pluralsight.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
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


        //Prompting the user for name search
        System.out.println("Enter first/last name: ");
        String name = scanner.nextLine();


        //Creating matches using stream
        List<Person> matches = people.stream().filter(person ->
                person.getFirstName().equalsIgnoreCase(name)).collect(Collectors.toList());

        for  (Person person : matches) {
            System.out.println(person);
        }

        if(matches.isEmpty()) {
            System.out.println("No matches found");

        }

        //Stream average age
        int totalAge = people.stream()
                .map(person -> person.getAge())
                .reduce(0, (a, b) -> a + b);

        double average = (double) totalAge / people.size();

        System.out.println("Average age: " + average);


        //Stream Oldest age
        int oldestAge = people.stream()
                .map(person -> person.getAge())
                .reduce(0, (a, b) -> a > b ? a : b);

        System.out.println("Oldest age: " + oldestAge);


        //Stream youngest Age
        int youngestAge = people.stream()
                .map(person -> person.getAge())
                .reduce(people.get(0).getAge(),
                        (a, b) -> a < b ? a : b);

        System.out.println("Youngest age: " + youngestAge);






    }
}
