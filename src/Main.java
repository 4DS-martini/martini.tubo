import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag;
        int scelta = -1;

        do{
            System.out.println("\n1) Inserire i dati. \n2) Volume. \n3)Superficie \n0) Esci");
            scelta = input.nextInt();
        }while(scelta != 0);
    }
}