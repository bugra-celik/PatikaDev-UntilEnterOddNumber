import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int number,total=0;
Scanner scan= new Scanner(System.in);

do{
    System.out.print("Sayı giriniz:");
    number = scan.nextInt();
    if(number % 2 == 0 && number % 4 == 0){
        total += number;
    }

}while(number % 2 == 0);

        System.out.println("Çift ve 4'ün katı olan sayıların toplamı:" +total);
    }
}
