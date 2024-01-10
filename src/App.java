import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            int temp = b;
            b = a;
            a = temp;
        }

        for(int i = a; i < b; i++){
            if(i%5 == 2 || i%5 == 3 ){
                System.out.println(i);
            }
        }


        sc.close();
    }
}