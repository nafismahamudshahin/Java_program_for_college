import java.util.Scanner;
public class subtraction {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a , b,sub;
        System.out.print("Enter the Frist number: ");
        a = sc.nextInt(); 
        System.out.print("Enter the secund number: ");
        b = sc.nextInt();
        sub = a - b;
        System.out.println("Your ans is : "+ sub);
    }
}
