/* Create a class Student having member variable name, age, mark and
required member variable. Create an LikedList of Student type and
perform the below operation on it.
(a.) Display the list
(b.) Ask the user to enter a student object and print the existence of
the object. Specify is the object is search according to reference
or contain.
(c.) Remove an specified student object.
(d.) Count the number of object present in the list*/
import java.util.*;
class Student{
	String name;
	int age;
	double marks;
	boolean req;
	
	public Student(String name, int age, double marks, boolean req){
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.req = req;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getMarks() {
		return marks;
	}
	
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public boolean getReq() {
		return req;
	}
	
	public void setReq(boolean req) {
		this.req = req;
	}
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", age=" + age +", mark=" + marks +
				", required=" + req + '}';
		
	}
public class Q2 {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
LinkedList<Student> ll = new LinkedList<>();
ll.add(new Student("ram",34,67.0,true));
ll.add(new Student("Shyam",45,34.0,false));
ll.add(new Student("gita",54,89.0,true));
ll.add(new Student("rita",98,55.0,false));
ll.add(new Student("sita",77,67.0,true));

System.out.println("Student List: ");
for(Student student : ll) {
	System.out.println(student);
}
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name of the student to search : ");
String name = sc.nextLine();
boolean found = false;
for(Student student : ll) {
	if(student.getName().equals(name)) {
		found = true;
		System.out.println("Student found : " + student + "Reference match: " + (student == ll.get(ll.indexOf(student))));
		break;
	}
}
if (!found) {
    System.out.println("Student not found in the list.");
}

// Removing a specified student object
System.out.print("\nEnter name of the student to remove: ");
String removeName = sc.nextLine();
boolean removed = false;
for (Student student : ll) {
    if (student.getName().equalsIgnoreCase(removeName)) {
        ll.remove(student);
        removed = true;
        System.out.println("Student removed from the list.");
        break;
    }
}
if (!removed) {
    System.out.println("Student not found in the list.");
}

// Counting the number of objects present in the list
int count = ll.size();
System.out.println("\nNumber of students in the list: " + count);
sc.close();
}
}
