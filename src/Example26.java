import java.util.Scanner;

public class Example26 {
    public static void main(String[] argv) {
        int num;



        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Write number");
        num = inputValue.nextInt();

        for(int i = 1; i <num; i++) {
            if(num%i == 0) {
                System.out.println(i);
            }
        }
    }
}
