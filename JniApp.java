import java.util.Scanner;

public class JniApp{
    public native int factorial(int number);
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            JniApp ja = new JniApp();
            int num = scanner.nextInt();
            int f = ja.factorial(num);
            System.out.println("Factorial of "+ num + " is: " + f);
        }
        
    }
    static{
        System.loadLibrary("Factorial");
    }
    
}
