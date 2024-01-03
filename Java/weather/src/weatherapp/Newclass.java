package weatherapp;

public class Newclass {
	 public String isSubset( long a1[], long a2[], long n, long m) {
		    if((n>=1 && n<=Math.pow(10,5))&&(m>=1 && m<=Math.pow(10,5))){
		    int count=0;
		    String st=new String("");
		    for(int i=0;i<=a2.length-1;i++){
		        for(int j=0;j<=a1.length-1;j++){
		            if(a2[i]==a1[j] && st.contains(Integer.toString(j))==false){
		                count++;
		                st+=Integer.toString(j);
		                System.out.println(st);
		                break;
		            }
		        }
		    }
		    long p=0;
		    if(m>n){
		        p=n;
		    }
		    else{
		        p=m;
		    }
		    if(count==p){
		        return "Yes";
		    }
		    else{
		        return "No";
		    }
		    }
		    else{
		        return "No";
		    }
		    
		        
		    }

}
