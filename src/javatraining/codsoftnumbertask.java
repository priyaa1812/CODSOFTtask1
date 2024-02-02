package javatraining;
import java.util.Scanner;
import java.util.*;
public class codsoftnumbertask {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
        Random num=new Random();
        System.out.println("How many tries do you want?");
        int n=obj.nextInt();
        System.out.println("You have "+n+" tries, Start you game!");
        while(n>0) {
        for(int i=1;i<=n;i++) {
        	int rn=num.nextInt(100);
            System.out.println("Enter your guess between 1-100:");
            int userguess;
            userguess=obj.nextInt();
            if(userguess==rn) {
            	userguess=1;
            	System.out.println("Your guess is right.");
            	System.out.println("Random number generated is:"+rn);
            	break;
            }
            else if(userguess>rn) {
            	System.out.println("Your guess is too high.");
            	System.out.println("Your have "+(n-1)+" tries left");
            	System.out.println("Random number generated is:"+rn);
            	
            }
            else if(userguess<rn) {
            	System.out.println("Your guess is too low.");
            	System.out.println("Your have "+(n-1)+" tries left");
            	System.out.println("Random number generated is:"+rn);
            }
            else {
            	
            }
            n--;
            
        }
        
	}
    }
}