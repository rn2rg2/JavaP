package Codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Test_2164 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		Queue<Integer> queue = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for(int i = 1; i<=count; i++) {
			queue.offer(i);
		}
		while(queue.size()>1) {
			queue.poll();
			int data = queue.poll();
			queue.offer(data);
		}
		System.out.println(queue.peek());
	}
}
