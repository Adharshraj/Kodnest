package TwoDArray;
import java.util.Scanner;

public class sdffsf {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int arr1[]=new int[scan.nextInt()];
        for(int i=0;i<=arr1.length-1;i++){
            arr1[i]=scan.nextInt();
        }
        int []arr2=new int[arr1.length];
        int b=0;
        for(int i=arr1.length-1;i>=0;i--){
            arr2[i]=arr1[b];
            b++;
        }
        System.out.println("Elements of the  target array:");
        for(int i=0;i<=arr2.length-1;i++){
            System.out.println("Element "+(i+1)+": "+arr2[i]);
        }
    }
}

