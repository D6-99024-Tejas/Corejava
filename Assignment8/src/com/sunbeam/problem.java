/*
 in a list -- ArrayList.
  Write a menu driven program to
1. Add new book in list
2. Display all books in forward order
3. Display all books in reverse order
4. Delete a book at given index.
5. Sort all books by price in descending order -- list.sort();*/

package com.sunbeam;
import com.domain.Book;
import java.util.*;
import com.util.sortByPrice;
public class problem {
	public static List<Book>blist=new ArrayList<>();
	public static Scanner sc=new Scanner(System.in);
	public static Book[] getInstances() 
	{
		Book[] arr=new Book[6];
		arr[0]=(new Book("ShivChatrapati", 300.00 ,"Shivaji Sawant", 10));
		arr[1]=(new Book("Chava", 500.00 , "Shivaji", 5));
		arr[2]=(new Book("Karna", 200.00 ,"Tejas Dhole", 20));
		arr[3]=(new Book("Mahabharat", 100.00 , "Om Deshmukh", 2));
		arr[4]=(new Book("Savita bhabhi", 1100.00 ,"Mayur Kale", 1));
		arr[5]=(new Book("365 Days", 110.00 ,"Soham Gurav", 20));
		return arr;
	}
	public static void printBook(Book[] arr)
	{
		for(Book b:arr) {
			blist.add(b);	
			System.out.println(b.toString());
		}		
	}
	public static void removeBook(int index)
	{
		if(index>=0 && index<blist.size()) {
			blist.remove(index);
			System.out.println("book deleted successfully..");
		}
		else {
			System.out.println("book not found");
		}
	}
	public static void forwardBook()
	{
		ListIterator<Book> trav = blist.listIterator();
		while(trav.hasNext())
		{
			Book ele = trav.next();
			System.out.println(ele);
		}
	}
	public static void backwardBook()
	{
		ListIterator<Book> tra=blist.listIterator(blist.size());
		while(tra.hasPrevious())
		{
			Book ele = tra.previous();
			System.out.println(ele);
		}
	}
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add new Book");
		System.out.println("2.Display all books in forward order");
		System.out.println("3.Display all books in reverse order");
		System.out.println("4.Delete a book at given index");
		System.out.println("5.Sort all books by price in desc order");
		System.out.println("Enter your choice : ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while((choice=menuList())!=0)
		{
			switch (choice) {
			case 1:
				blist.clear();
				problem.getInstances();
				problem.printBook(getInstances());
				break;
				
			case 2:
				problem.forwardBook();
				break;
				
			case 3:
				problem.backwardBook();
				break;
				
			case 4:
				System.out.println("Enter book index ");
				int idx=sc.nextInt();
				problem.removeBook(idx);
				break;
				
			case 5:
//				Comparator<Book> comparator = null; 
//				comparator =new sortByPrice();
				
				//OR
				
				Collections.sort(blist,new sortByPrice());
				problem.forwardBook();
				break;
			default:
				System.out.println("Invalid choice...");
			
			}
		}
	}

}
