package javatraining;
import java.util.Scanner;
public class codsoftatm {
	
	double deposit(double total){
		double a;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the deposit amount:");
		a=obj.nextDouble();
		total+=a;
	    System.out.println("Total:"+total);
		return total;
	}
	double withdrawal(double total){
		double w;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the withdrawal amount:");
		w=obj.nextDouble();
	    total-=w;
	    System.out.println("Total:"+total);
		return total;
	}
	double checkbal(double total) {
		double w;
		Scanner obj=new Scanner(System.in);
		
	    System.out.println("Total:"+total);
		return total;
	}


	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		bank p=new bank();
		double mainbal=10000;
		int choice,x=1;
		
		while(x==1) {
		
		    System.out.println("1:deposit");
		    System.out.println("2:withdrawal");
    		System.out.println("3:Balance");
		System.out.println("enter choice:");
        choice=obj.nextInt();
        if(choice==1) {
        		mainbal=p.deposit(mainbal);
        		System.out.println("After deposit : "+mainbal);
        		System.out.println("Successful deposit.");
        }
        
        else if(choice==2) {
        		mainbal=p.withdrawal(mainbal);
        		System.out.println("After withdrawal : "+mainbal);
        		System.out.println("Successful withdrawal.");
        }
        else if(choice==3) {
        	System.out.println("Total: "+mainbal);
        }
        else {
        	
        }
        
		System.out.println("do you want to cont?");
		x=obj.nextInt();
		

	}

	}
}