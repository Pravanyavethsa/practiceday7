package ass7;

public class CommandLineArg {
    public static void main(String[] args) {
        int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=a+b;
        System.out.println("addition is"+c);
    }
}
