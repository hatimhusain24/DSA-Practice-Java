package Nested_Loops_Questions;

//print the multiplication tables for all numbers from 1 to 10
public class Question1 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            System.out.println("Multiplication table of "+i);
            for (int j=1; j<=10; j++){
                System.out.println(i +" x "+j +" = "+i*j);
            }
            System.out.println("--------------");
        }
    }
}