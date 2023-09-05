// print the sumation of natural numbar
// like that 1+2+3+.......99+100 =?
public class for_loop {
    public static void main(String[]args){
        // int i,count = 0;
        // for(i =0;i<=100;i++){
        //     count = count+ i;
        // }
        // System.out.println(count);


        // int i ,count =0;
        // i=0;
        // while(i<=100){
        //     count =count+i;
        //     i++;
        // }
        // System.out.println("Sumation is :"+count);

        int i =0, count =0;

        do{
            count = count+i;
            i++;
        }while(i<=100);
        System.out.println(count);
    }
}
