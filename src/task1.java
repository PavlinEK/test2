import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int a,b,res;
        char choice;
        Scanner S=new Scanner(System.in);
        do
        {
            System.out.print("Enter action (+; -; *; /): ");
            choice=S.next().charAt(0);
            System.out.print("Enter number A: ");
            a= (int) S.nextFloat();
            System.out.print("Enter number B: ");
            b= (int) S.nextFloat();
            switch (choice) {
                case '+' -> {
                    res = a + b;
                    System.out.println("Result : " + a + "+" + b + "=" + res);
                }
                case '-' -> {
                    res = a - b;
                    System.out.println("Result : " + res);
                }
                case '/' -> {
                    res = a / b;
                    System.out.println("Result : " + res);
                }
                case '*' -> {
                    res = a * b;
                    System.out.println("Result : " + res);
                }
                default -> System.out.print("FATALITY! ... Wrong action!\n");
            }
        }
        while(b!=0);
    }
}