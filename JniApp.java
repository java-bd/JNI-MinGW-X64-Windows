public class JniApp{
    public native int factorial(int number);
    
    public static void main(String[] args){
        JniApp ja = new JniApp();
        int f = ja.factorial(10);
        System.out.println("Factorial of 5 is : " + f);
    }
    static{
        System.loadLibrary("Factorial");
    }
    
}
