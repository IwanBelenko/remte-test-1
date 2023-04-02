// import java.util.Scanner;

//public class Sem {
//    public static void main(String[] args) {
//         System.out.println ("Введите имя");
//         Scanner iScanner = new Scanner (System. in);
//         String name = iScanner. nextLine();
//         System.out .printf("Привет! %s ", name);
//         iScanner.close();
//    }
// }
public class Sem{

    public static int getFactorial(int f) {
    int result = 1;
    for (int i = 1; i <= f; i++) {
       result = result * i;
    }
    return result;
    }
    public static void main(String[] args){
        System.out.println(getFactorial(5));
    }
}