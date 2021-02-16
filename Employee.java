package com.Stream_EMP;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    static List<User> users = Arrays.asList(
            new User("Capgemini", 30),
            new User("Deloitte", 40),
            new User("Aspiring", 70),
            new User("RPG Found.", 20),
            new User("Ensono", 50));

    public static void main(String[] args) {
        
      
    	System.out.println("\n--------Sort Using Sal--------\n");
            
        List<User> sortedList = users.stream()
            .sorted(Comparator.comparingInt(User::getEmp))
            .collect(Collectors.toList());
 
        sortedList.forEach(System.out::println);
        
        System.out.println("\n--------Sort Using Sal Reverse--------\n");
        
        List<User> sortSal = users.stream()
                .sorted(Comparator.comparingInt(User::getEmp)
                .reversed())
                .collect(Collectors.toList());

            sortSal.forEach(System.out::println);
        
        System.out.println("\n--------Sort Using Names--------\n");
        
        List<User> sorted = users.stream()
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());
     
            sorted.forEach(System.out::println);
            
            System.out.println("\n--------Sort Using Names reverse--------\n");
            
            List<User> sortNames = users.stream()
                    .sorted(Comparator.comparing(User::getName)
                    .reversed())
                    .collect(Collectors.toList());

            sortNames.forEach(System.out::println);
            
            
            


    }

    static class User {

        private String name;
        private int emp;

        public User(String name, int emp) {
            this.name = name;
            this.emp = emp;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getEmp() {
            return emp;
        }

        public void setEmp(int emp) {
            this.emp = emp;
        }

        @Override
        public String toString() {
            return "Company-	" +
                    "name=" + name  +"\t"+
                    " Emp=" + emp 
                ;
        }
    }
}