package Mixed_Logical_Loop;

//count total numbers between 1 and 500 which are divisible by 7 but not divisible by 5
public class Question2 {
    public static void main(String[] args) {
        int count =0;
        for (int i=1; i<=500;i++){
            if (i%7 == 0 && i%5 != 0){
                count++;
            }
        }
        System.out.print("Total count of numbers divisible by 7 but not 5 are : "+count);
    }
}
