package assignment10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Book {
    private String title;
    private Author author;
    private double cost;
    
    public Book() {}
    
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.cost = price;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public String toString() {
        return "The book has:\n Title:  " + this.getTitle() + "\n " + this.getAuthor().toString() + "\n Cost: " + this.getCost();
    }
    
    public void inputBookInfo() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter book title: ");
        this.setTitle(scanner.nextLine());
        
        System.out.print("Enter author name: ");
        String authorName = scanner.nextLine();
        
        System.out.print("Enter author date of birth (dd/mm/yyyy): ");
        String dateOfBirthString = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Date dateOfBirth = null;
        try {
            dateOfBirth = sdf.parse(dateOfBirthString);
        } catch (Exception e) {
            System.out.println("Wrong format");
        }
        
        this.author = new Author(authorName, dateOfBirth);
        
        System.out.print("Enter book cost: ");
        this.setCost(scanner.nextDouble());
    }
    
    public void printBookInfo() {
        System.out.println(this.toString());
    }
}
