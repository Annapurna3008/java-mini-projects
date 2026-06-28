package calculator;

import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value 1:");
        int a = sc.nextInt();
        System.out.println("Enter value 2:");
        int b = sc.nextInt();
        System.out.println("Enter operator number: ");
        System.out.println("Enter 1 for addition, 2 for substraction, 3 for multiplication, 4 for division, 5 for modulus");
        int operator = sc.nextInt();
        switch(operator){
            case 1: System.out.println(a+b);
                    break;
            case 2: System.out.println(a-b);
                    break;
            case 3: System.out.println(a*b);
                    break;
            case 4: if(b == 0){
                        System.out.println("Zero Division error");
                    }else{
                        System.out.println(a/b);
                    }
                    break;
            case 5: if(b == 0){
                        System.out.println("Zero Division error");
                    }else{
                        System.out.println(a/b);
                    }
                    break;
            default: System.out.println("Invalid operator");
        }

    }
}

