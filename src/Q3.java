import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int leng , wid;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a length=");
        leng=in.nextInt();
        System.out.println("Enter a width=");
        wid=in.nextInt();
        System.out.println("area="+(leng * wid));
        System.out.println("surroundings ="+2*(leng+wid));
    }
}
