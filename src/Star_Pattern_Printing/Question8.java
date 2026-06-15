package Star_Pattern_Printing;

//print stars in odd numbers (1,3,5,7,9)
public class Question8 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int j=1; j<=(i*2-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
