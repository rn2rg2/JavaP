package Codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Mystack {
	private int[] mystack;
	private int size=0;
	Mystack(int length){
		mystack = new int[length];
	}
	public void push(int data) {
		mystack[size] = data;
		size++;
	}
	public int empty() {
		if(size==0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public int size() {
		return this.size;
	}
	public int pop() {
		if(empty()==1) {
			return -1;
		}
		else {
			size = size-1;
			return mystack[size];
		}
		
	}
	public int top() {
		if(size == 0) {
			return -1;
		}
		else {
			return mystack[size-1];
		}
	}
}
public class Test_10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count  = Integer.parseInt(br.readLine());
		Mystack stack = new Mystack(count);
		for(int i = 0 ; i<count; i++) {
			String line = br.readLine();
			String[] resultarr = line.split(" ");
			switch(resultarr[0]) {
				case "push":
					int data = Integer.parseInt(resultarr[1]);
					stack.push(data);
					break;
				case "pop":
					System.out.println(stack.pop());
					break;
				case "top" :
					System.out.println(stack.top());
					break;
				case "empty" : 
					System.out.println(stack.empty());
					break;
				case "size" : 
					System.out.println(stack.size());
					break;	
			}
		}
	}
}
