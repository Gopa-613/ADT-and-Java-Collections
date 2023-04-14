/*Write a java program to convert a decimal to binary equivalent using stack(Stack collection).
*/
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
Stack<Integer> s = new Stack<Integer>();
System.out.println("Enter the Decimal Number : ");
int num = sc.nextInt();
while(num != 0) {
	int rem = num%2; //we divide 2 and collect remainders while converting from dec to bin.
	s.push(rem);
	num = num/2; 
	//the while loop will terminate when the decimal number will become zero.
}
System.out.print("The binary number is : ");
while(!s.isEmpty()) {
	System.out.print(s.pop());
}


	}

}
