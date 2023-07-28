package com.gl.test;
import java.util.Scanner;
import java.util.Stack;

public class BracketBalancer {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Stack<Character> bracketBalancer = new Stack();
		System.out.println("Enter the string for bracket balance check..");
		String testString = sc.nextLine();
		
		for(int i=0; i<testString.length(); i++) {
			
			char temp = testString.charAt(i);
			
			if(temp == '(' || temp == '[' || temp== '{') {
				bracketBalancer.push(temp);
				
			} else if (temp == ')' || temp == ']' || temp== '}') {
				bracketBalancer.pop();
				
			} else {
			    // System.out.println("No bracket, checking next..");	
			}
		}
		
		if(bracketBalancer.empty()) {
			System.out.println(testString + " -- contains balanced brackets...");
		} else {
			System.out.println(testString + " -- contains non-balanced brackets...");
		}
			
		}
}
