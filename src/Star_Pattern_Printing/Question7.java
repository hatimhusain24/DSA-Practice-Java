package Star_Pattern_Printing;

//print stars in even numbers (2,4,6,8,10)
public class Question7 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
