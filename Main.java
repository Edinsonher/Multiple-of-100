import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = entrada.nextInt();
        // A number is a multiple of 100 if the remainder of dividing it by 100 is 0
        if (number % 100 == 0){
            System.out.println("multiple of 100");
        } else {
            System.out.println("not multiple of 100");
        }
        entrada.close();
    }
}
