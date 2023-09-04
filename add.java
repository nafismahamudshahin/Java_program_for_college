import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Frist Number: ");
        int a = Sc.nextInt();
        System.out.print("Enter secund Number: ");
        int b = Sc.nextInt();
        int add = a + b;
        System.out.println("The ans is "+ add); 
    }
}
