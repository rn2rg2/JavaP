package Codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_10951 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		while(true) {
			String line = br.readLine();
			if(line!=null) {
				String[] res = line.split(" ");
				System.out.println(Integer.parseInt(res[0])+Integer.parseInt(res[1]));
			}
			else {
				break;
			}
		}
	}
}
