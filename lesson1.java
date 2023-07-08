import java.util.Scanner;
import java.time.LocalDateTime;
public class lesson1 {
    public static void main (String[] args) {
        culc();
    }

    static void getTriangle(){
        int a = 1;
        int b = 3;
        int c = a;
        int temp = 0;
        for(int i = 0; i < b; i++){
            c = c + (a+i+1);
            System.out.println(c);
        }
    }
    
    static void getSimple(){
        int a = 1000;
        for (int i = 2; i <= a; i++) {
            int x = 0;
            for (int j = 1; j < i; j++) {
                if(i % j == 0){
                    x++;
                }
            }
        if (x <= 2) {
            System.out.println(i);
        }
        }
    }
    static void culc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");

        int firstNumber = Integer.parseInt(scanner.nextLine());
        
        
        System.out.println("Choose an action:");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");

        int action = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the second number");

        int secondNumber = Integer.parseInt(scanner.nextLine());

        if(action == 1){
            System.out.println(firstNumber + secondNumber);
        }
        else if (action == 2) {
            System.out.println(firstNumber - secondNumber);
        }
        else if (action == 3) {
            System.out.println(firstNumber * secondNumber);
        }
        else if (action == 4) {
            System.out.println(firstNumber / secondNumber);
        }

    }


}