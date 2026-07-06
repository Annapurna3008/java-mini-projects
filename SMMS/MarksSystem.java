package SMMS;

import java.util.*;

public class MarksSystem {
    public static void displayMenu(){
        System.out.println("==== Student Marks System ====");
        System.out.println("1. Display Marks");
        System.out.println("2. Find Higher Mark");
        System.out.println("3. Find Lowest Mark");
        System.out.println("4. Calculate Average");  
        System.out.println("5. Search Student Mark");  
        System.out.println("6. Update Student Mark");  
        System.out.println("7. Number of students passed and failed");  
        System.out.println("8. Sort Student Marks");
        System.out.println("9. Exit");  
    }

    public static void displayMarks(int[] marks){
        for(int i=0; i<marks.length; i++){
            System.out.println("Student "+(i+1)+": "+marks[i]);
        }
    }

    public static int highestMark(int[] marks){
        int max = marks[0];
        for(int i=1; i<marks.length; i++){
            if( marks[i]>max ){
                max = marks[i];            }
        }
        return max;
    }

    public static int lowestMark(int[] marks){
        int min = marks[0];
        for(int i=1; i<marks.length; i++){
            if( marks[i]<min ){
                min = marks[i];            }
        }
        return min;
    }

    public static float average(int[] marks, int size){
        int sum = 0;
        for(int i=0; i<size; i++){
            sum = sum + marks[i];
        }
        return (sum/size);
    }

    public static int searchMark(int[] marks, int mark){
        for(int i=0; i<marks.length; i++){
            if(marks[i] == mark){
                return i;
            }
        }
        return -1;
    }

    public static void updateMark(int index, int value, int[] marks){
        if(index > marks.length || index < 1 ){
            System.out.println("Student not found.");
            return;
        }
        marks[index-1] = value;
        System.out.println("Student "+index+" mark updated successfully.");
    }

    public static void passAndFail(int[] marks){
        int passMark = 36, countPass = 0, countFail = 0;
        for(int i=0; i<marks.length; i++){
            if( marks[i]<passMark ){
                countFail++;
            }else{
                countPass++;
            }
        }
        System.out.println("Number of students passed and failed are "+countPass+" and "+countFail+" respectively");
    }

    public static void sortArray(int[] marks){
        for(int i=0; i<marks.length; i++){
            for(int j=0; j<marks.length-1; j++){
                if( marks[j+1]<marks[j] ){
                    int temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                }
            }
        }
        displayMarks(marks);
        System.out.println("Array sorted successfully");
    }

    public static void exitProgram(){
        System.out.println("Thank you for using Student Marks Management System.");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int size = sc.nextInt();
        int[] marks = new int[size];
        int i=0;
        while(i<size){
            System.out.println("Enter marks for student "+(i+1)+" : ");
            int mark = sc.nextInt();
            if( mark < 0 || mark > 100){
                System.out.println("Mark should be between 0 to 100");
            }else{
                marks[i] = mark;
                i++;
            }
        }
        while(true){    
            displayMenu();
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1: 
                    displayMarks(marks);
                    break;
                case 2:
                    int highestMark = highestMark(marks);
                    System.out.println("Highest Marks: "+highestMark);
                    break;
                case 3:
                    int lowestMark = lowestMark(marks);
                    System.out.println("Lowest Marks: "+lowestMark);
                    break;
                case 4:
                    float average = average(marks, size);
                    System.out.println("Average: "+average);
                    break;
                case 5:
                    System.out.print("Enter mark to search: ");
                    int mark = sc.nextInt();
                    int index = searchMark(marks,mark);
                    if(index >=0){
                        System.out.println("Mark found at Student "+index+".");
                    }else{
                        System.out.println("Mark not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter student number: ");
                    int ind = sc.nextInt();
                    System.out.print("Enter new mark: ");
                    int value = sc.nextInt();
                    updateMark(ind, value, marks);
                    break;
                case 7:
                    passAndFail(marks);
                    break;
                case 8:
                    sortArray(marks);
                    break;
                case 9:
                    exitProgram();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            if(choice >= 9){
                break;
            }
        }
        sc.close();
    }
}
