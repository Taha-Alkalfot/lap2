import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        double S,G,Pi=3.14;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter S=");
        S=in.nextDouble();
        G=Pi *(S*S);
        System.out.println("G="+G);
        System.out.println("circumference="+(2 * Pi * S));
    }
}
