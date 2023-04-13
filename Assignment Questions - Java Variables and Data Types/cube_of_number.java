/*
 Q4 - Write a Java program to calculate the cube of a number. (Easy)
Sample Input : 4
Sample Output : 64
The sizeof(bool) : 1 bytes
 */
import java.util.Scanner;

public class cube_of_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int cube = num * num * num;
        
        
        System.out.println("The cube of " + num + " is " + cube);
    
    }
}

