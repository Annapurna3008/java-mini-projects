package student_grade_calculator;

import java.util.*;

public class GradeCalculator {
    public static void main(String args[]){
        System.out.println("Enter the marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if( marks>100 || marks<0 ){
            System.out.println("Invalid input");
        }else if( marks>=90 ){
            System.out.println("A+ Grade");
        }else if( marks>=80 ){
            System.out.println("A Grade");
        }else if( marks>=70 ){
            System.out.println("B Grade");
        }else if( marks>=60 ){
            System.out.println("C Grade");
        }else{
            System.out.println("Failed .. Try hard next time");
        }
        sc.close();
    }
}
