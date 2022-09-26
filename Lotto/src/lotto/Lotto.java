
package lotto;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

    int results[]=new int[6];
    int count;
    Random number=new Random();
    
    public Lotto(){
        for(int i=0;i<6;i++){
            int ss=1+number.nextInt(52);
            results[i]=ss;
        }
    }
    
    public void display(){
        for(int i=0;i<6;i++){
            System.out.print(results[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    
    public int comparer(int b[]){
        int c=0;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(results[i]==b[j]){
                    c++;
                }
            }
        }
        count=count+c;
        return count;
    }
    
    
    public static void main(String[] args) {
        
        Lotto show=new Lotto();
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[6];
        
        for(int i=0;i<6;i++){
            int input=scan.nextInt();
            arr[i]=input;
        }
        
        
        System.out.println("Tonight's Lotto numbers are as follows:");
        show.display();
        
        show.comparer(arr);
        System.out.println("You managed to match "+show.count+" number(s)");
    }
    
}
