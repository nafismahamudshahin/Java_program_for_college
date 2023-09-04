import java.util.*;
public class if_else_condetion {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int a = sc.nextInt();
        if(a >= 80){
            System.out.println("You got A+");
        }else if(a>=70){
            System.out.println("you got : A");
        }else if(a>=60){
            System.out.println("you got : A-");
        }else if(a>=50){
            System.out.println("you got : B");
        }else if(a>=40){
            System.out.println("you got: B-");
        }else if(a>=33){
            System.out.println("you got: C");
        }else if(a<=32){
            System.out.println("you are a faill");
        }else{
            System.out.println("Namber is invalid please try agin");
        }

    }
}
