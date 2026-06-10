package Break_Continue_Loops;

//print numbers from 1 to 100 and stop the loop as soon as a number divisble by 17 is encountered
public class Question1 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            if (i%17 == 0){
                break;
            }
            System.out.println(i);
        }
    }
}
