import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        
        for(int i=1;i<=n;i++){
            if(i<=n/2){
                for(int j=1;j<=n;j++){
                    if(j==1 || j==n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }
            else if(i==n/2+1){
                for(int j=1;j<=n;j++){
                    if(j==1 || j==n/2+1 || j==n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }
            else if(i>n/2+1 && i<n){
                int val1= n/2;
                int val2=n/2+2;
                for(int j=1;j<=n;j++){
                    if(j==1 ||  j==n || j==val1 || j==val2 ){
                        System.out.print("*\t");
                        if(j==val1 ){
                            val1--;
                        }else if(j==val2){
                            val2++;
                        }
                    }else{
                        System.out.print("\t");
                    }
                }
            }else{
                   for(int j=1;j<=n;j++){
                    if(j==1 || j==n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
   }
}