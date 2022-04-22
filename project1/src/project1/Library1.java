package project1;

import java.util.Scanner;
public class Library1
{
     int accNum;
     String title;
     String author;
    Scanner in = new Scanner(System.in);
    void input()
    {
        {
			System.out.println("Enter the book title: ");
			title = in.nextLine();
			System.out.println("Enter name of the author: ");
			author = in.nextLine();
			System.out.println("Enter accession number: ");
			accNum = in.nextInt();
        }	
    } 
    void compute() 
    {
      {
			System.out.print("Enter number of days late: ");
			int days = in.nextInt();
			int fine = days * 5;
			System.out.println("Fine = Rs." + fine);
		}
    }
    
    void display() 
    {
        System.out.println("Accession Number\tTitle\tAuthor");
        System.out.println(accNum + "\t\t\t" + title + "\t" + author);
    }
    
    public static void main(String args[]) 
    {
        Library1 obj = new Library1();
        obj.input();
        obj.display();
        obj.compute();
    }
}
