import java.util.Scanner;

/**
 * even_odd
 */
public class even_odd {


    public static void checkEvenOdd(int n){

        if ( n%2 == 0){
            System.out.println(n + " is a Even No.");
        } else {
            System.out.println(n + " is a Odd No.");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value = "); int n = sc.nextInt();

        checkEvenOdd(n);
        
    }
}