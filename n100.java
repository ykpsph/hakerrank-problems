import java.io.*;
import java.util.*;

public class n100 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
	    if(n >= 1 && n <= 100){
            if(n % 2 == 1){
                System.out.print("Weird");
            } else if(n % 2 == 0 && (n >= 2 && n <= 5)){
                System.out.print("Not Weird");
            } else if(n % 2 == 0 && (n >= 6 && n <= 20)){
                System.out.print("Weird");
            } else if(n % 2 == 0 && n > 20){
                System.out.print("Not Weird");
            }
        }
	}
}