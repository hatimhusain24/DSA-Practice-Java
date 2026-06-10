package Break_Continue_Loops;

//print numbers from 1 to 100 but skip all numbers that are divisble by 5 and continue printing the rest
public class Question2 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            if (i%5==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
