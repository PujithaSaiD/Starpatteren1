import java.util.*;
public class Starpattern1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n*2+1;
        for(int i=1;i<r+1;i++){
            for(int j=1;j<r+1;j++){
                if(i==n+1 || j==1 || j==r){
                    System.out.println("*");
                }
                else if(i<n+1 && (i>=j || j>r-i)){
                    System.out.println("*");
                }
                else if(i>n+1 && (i<=j || j<=r-i+1) && i<r){
                    System.out.println("*");
                }
                else{
                    System.out.println(".");
                }
            }
            System.out.println( );
        }
    }
}