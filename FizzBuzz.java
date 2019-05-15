import java.util.Scanner;

public class FizzBuzz {
public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int TestCases = s.nextInt();                 // Reading input from STDIN
    System.out.println("TestCases, " + TestCases);
    for (int i=1; i <= TestCases; i++){
        int number = s.nextInt();
        for (int j = 1; j<= number; j++){
            if (j%3 == 0 ||j%5 == 0 ) {
            	if (j%3 == 0){
                System.out.print("Fizz");
                }
                if (j%5 == 0){
                    System.out.print("Buzz");
                }
                System.out.println();
            } else {
                System.out.println(j);
            }
            
            
        }
    }
    s.close();
}
}
