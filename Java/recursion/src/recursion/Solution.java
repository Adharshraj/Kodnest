package recursion;
import java.util.Scanner;
class Solution {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter str1");
        String s1=scan.next();
        System.out.println("Enter str2");
        String s2=scan.next();
        Solution AB=new Solution();
        String str=AB.gcdOfStrings(s1, s2);
        System.out.println(str);
    }
    public String gcdOfStrings(String str1, String str2) {
        String str3=new String();
        String str4=new String();
        String str5=new String();
        for(int i=0;i<=str2.length()-1;i++){
            if(i<=str2.length()-1){
                char a=str2.charAt(i);
                if(str3.contains(String.valueOf(a))==false){
                    str3=str3.concat(String.valueOf(a));
                }
            }   
        }
        System.out.println(str3);
        for(int i=0;i<=str1.length()-1;i++){
            if(i<=str1.length()-1){
                char b=str1.charAt(i);
                if(str4.contains(String.valueOf(b))==false){
                    str4=str4.concat(String.valueOf(b));
                }
            }
        }
        System.out.println(str4);
        for(int i=0;i<=str3.length()-1;i++){
            if(str3.charAt(i)==(str4.charAt(i))){
                str5=str5.concat(String.valueOf(str3.charAt(i)));
            }
            else{
                break;
            }
        }
        return str5;
        }
    }
