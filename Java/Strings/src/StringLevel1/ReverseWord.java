package StringLevel1;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int count=0;
		for(int i=0;i<=input.length()-1;i++) {
			if(input.charAt(i)==' ') {
				count++;
			}
		}
		String[] arr=new String[count+1];
		int j=0;
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<=input.length()-1;i++) {
			if(input.charAt(i)!=' ') {
				sb.append(input.charAt(i));
			}
			else {
				
				arr[j]=sb.toString();
				sb.setLength(0);
				j++;
			}
			
		}
		//String res=new String(arr);
		System.out.println(arr);

	}

}
