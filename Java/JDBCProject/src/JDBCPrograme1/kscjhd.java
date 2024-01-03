

package JDBCPrograme1;

import java.util.*;

public class kscjhd {
		 public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in);
			  System.out.println("enter val");
			  ArrayList<String> li=new ArrayList<String>();
			  int val=sc.nextInt();
			  for(int i=0;i<=val-1;i++) {
				  String ab=sc.next();
				  li.add(ab);
			  }String a=new String();
			  int ac=0;
			  ArrayList<String> li1=new ArrayList<String>();
			  li1.addAll(li);
			  int count=0;
			  for(int i=0;i<=val-1;i++) {
				  count=0;
				  for(int j=0;j<=val-1;j++) {
					  if(li.get(i)==li1.get(j)) {
						  count++;
					  }
				  }
				  if(count>1) {
					  a+=li.get(i)+",";
					  ac++;
				  }
			  }
			  String arr[]=a.split(",");
			  if(ac==0) {
				  System.out.println("Bla");
			  }
			  else {
			  for(int i=0;i<=arr.length-1;i++) {
				  System.out.println(arr[i]);
			  }
			  }
		 }
		}
