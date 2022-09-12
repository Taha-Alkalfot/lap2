import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int a,s,f;
        Scanner in=new Scanner(System.in);
        System.out.println("enter a=");
        a=in.nextInt();
        System.out.println("enter s=");
        s=in.nextInt();
        System.out.println("enter f=");
        f=in.nextInt();
        System.out.println("Average="+(a+s+f)/3);
    }
}
