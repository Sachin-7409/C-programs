package hello;

import java.util.Scanner;

public class Sum {

    int a;
    int b;

    public Sum()
    {
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {

        System.out.println("Enter the two numbers");
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
