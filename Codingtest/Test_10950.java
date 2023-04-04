package Codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_10950 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for(int i = 0; i<count;i++) {
			String line = br.readLine();
			String [] resultarr = line.split(" ");
			System.out.println(Integer.parseInt(resultarr[0])+Integer.parseInt(resultarr[1]));
			}
		} 
}

