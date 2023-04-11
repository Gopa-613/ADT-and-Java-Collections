/*Write a program to create an ArrayList of Integer type and perform
the below operation on it.
(a.) Display the list
(b.) Ask the user to enter a number and search that number is it
present in the list or not.
(c.) Remove an element from an asked position.
(d.) Add a condition to check the ArrayList is empty or not*/
import java.util.*;

public class Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
ArrayList<Integer> al = new ArrayList<Integer>();
al.add(1);
al.add(34);
al.add(25);
al.add(67);
System.out.println("The list contains the following element :" +al);
System.out.println();
System.out.print("Enter the number to be searched : ");
int s = sc.nextInt();
if(al.contains(s)) {
	System.out.println("The Element " +s+" is present");
}
else {
	System.out.println("The element " +s+ " is not present");
}
System.out.print("Enter the index value of the element to be removed : ");
int n = sc.nextInt();
al.remove(n);
System.out.print("The Arraylist after removing the element : "+al);
System.out.println();
 if(al.isEmpty()) {
	 System.out.println("The ArrayList is Empty");
 }
 else {
	 System.out.println("The ArrayList is not Empty");
 }
	}

}
