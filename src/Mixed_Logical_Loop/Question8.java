package Mixed_Logical_Loop;

//print all armstrong numbers between 1 and 1000
public class Question8 {
    public static void main(String[] args) {
        for (int i=1; i<=1000; i++){
            int num = i, count = 0;
            while (num>0){
                num = num/10;
                count++;
            }
            num=i;
            int sum=0;
            while (num>0){
                int power=1;
                int digit = num%10;
                for (int j=1;j<=count; j++){
                    power *=digit;
                }
                sum+=power;
                num/=10;
            }
            if (sum==i){
                System.out.println(i);
            }
        }
    }
}