/*Write a java program to evaluate a postfix expression using Stack.
*/
import java.util.*;

public class Q4 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Stack<Integer> s = new Stack<Integer>();

	        System.out.println("Enter the postfix expression:");
	        String expression = sc.nextLine();

	        for (int i = 0; i < expression.length(); i++) {
	            char ch = expression.charAt(i);
	            if (ch == ' ') {
	                continue;
	            } else if (Character.isDigit(ch)) {
	                int num = ch - '0';
	                while (i+1 < expression.length() && Character.isDigit(expression.charAt(i+1))) {
	                    num = num*10 + (expression.charAt(++i) - '0');
	                }
	                s.push(num);
	            } else {
	                int num2 = s.pop();
	                int num1 = s.pop();
	                switch(ch) {
	                    case '+':
	                        s.push(num1 + num2);
	                        break;
	                    case '-':
	                        s.push(num1 - num2);
	                        break;
	                    case '*':
	                        s.push(num1 * num2);
	                        break;
	                    case '/':
	                        s.push(num1 / num2);
	                        break;
	                }
	            }
	        }
	        System.out.println("Result: " + s.pop());
	    }
	}
