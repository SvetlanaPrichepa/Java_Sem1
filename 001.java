import java.util.Scanner;

public class 001 {
   
    public static void main(String args[]) {
    System.out.print("Введите число : ");
    Scanner scan = new Scanner(System.in);
    
    int a = scan.nextInt();
    Scanner.close();
        System.out.println("Треугольное число = " + Triangle(a) + "\n");
    }


public static publicTriangle(int num) {
    if (num == 1) {
        return 1;
    }
        return Triangle(num - 1) + num;
    }
}
