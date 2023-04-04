package Test;

public class Data_Stack {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		StringBuffer sb;
		StringBuffer sb1;
		String str1 = "I am happy today";
		String str2 = "We want to win the first prize";
		
		String[] arr1 = str1.split(" ");
		String[] arr2 = str2.split(" ");
		for(int i =0;i<arr1.length;i++) {
			sb = new StringBuffer(arr1[i]);
			sb.reverse();
			System.out.print(sb+" ");
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			sb1 = new StringBuffer(arr2[i]);
			sb1.reverse();
			System.out.print(sb1+" ");
		}
	}
}
