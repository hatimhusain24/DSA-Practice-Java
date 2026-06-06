package Basic_For_Loop_Questions;

//print all even numbers between 1 and 100
public class Question3 {
    public static void main(String[] args) {

        //Method 1

        for (int i=1; i<100; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }

        //Method 2

        for (int i=2; i<100; i+=2){
            System.out.println(i);
        }
    }
}
