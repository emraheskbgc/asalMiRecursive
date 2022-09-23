import java.util.Scanner;

public class Main {
    static boolean asalMi(int sayi, int i){
        if (sayi == i){
            return true;
        }
        if (sayi <= 1 ){
            return false;
        }
        if (sayi % i == 0){
            return false;
        }
       return asalMi(sayi,i+1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(asalMi(number,2));


    }
}
