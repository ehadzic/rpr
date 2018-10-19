package etf.unsa.ba;
import java.util.Scanner;
public class Main {

    static int sumaCifara(int n){
        int suma=0;
        int cifra;
        while(n>0){
            cifra=n%10;
            n=n/10;
            suma=suma+cifra;
        }
        return suma;
    }

    public static void main(String[] args) {
	// write your code here


        Scanner scanner = new Scanner (System.in);
        int n= scanner.nextInt();

        for (int i=0; i<n; i++){
            if(i%sumaCifara(i)==0) System.out.println(i);
        }




    }
}
