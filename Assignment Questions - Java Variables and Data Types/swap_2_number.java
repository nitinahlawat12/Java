/*
 Q5 - Write a Java program to swap two numbers with the help of a third variable.
 Sample Input : 2,3
Sample Output : 3,2
*/
public class swap_2_number {
    public static void main(String[] args){
        int a=2;
        int b=3;
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a + " " + b);
        
    }
}
