package Codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class test_9012 {
	public static String check(String data) {
		Stack<Character> stack = new Stack<>();
		for(int i =0; i<data.length();i++) {
			char c = data.charAt(i);
			if(c=='(') {
				stack.push(c);
			}
			else if(stack.empty()){
				return "NO";
			}
			else {
				stack.pop();
			}
		}
		if(stack.empty()) {
			return "YES";
		}
		else {
			return "NO";
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for(int i = 0 ; i<count ; i++) {
			System.out.println(check(br.readLine()));
		}
	}
}