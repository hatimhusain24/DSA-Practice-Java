package Basic_While_Loop_questions;

//print all even numbers between 1 and 100
public class Question3 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=100){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        int j = 2;
        while (j<=100){
            System.out.println(j);
            j=j+2;
        }
    }
}
