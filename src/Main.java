import java.util.Random;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       var Tab1=new TestTableau();
       Tab1.main();
    }
    static void num(int X){
        if(X<0){
            System.out.println("le nbr est negative");
        } else if (X>0) {
            System.out.println("le nbr est positif");

        }else {
            System.out.println("le nbr est nul");

    }
        if(X%2==0) {
            System.out.println("  et  pair");
        }else {
            System.out.println("  et impair");
        }

}
    static  void Multi(int A){
    for (int i=1;i<22;i++){
        System.out.println(i*A);

    }
    }
    static  void suit(int A){
        int i=0;
        do {
            System.out.println(A);
            A=A*3;
            i++;
        }while (i<12);
    }
    static void trian(int X){String A="*";
        for (int i=0;i<X;i++){

            System.out.println(A);
            A=A+"*";
        }
}
    static void pyr(int X){String A="*",E=" ";

        for (int i=0;i<X;i++){
        for (int j=X-i-1;j>-1;j--){
            System.out.print(E);
        }
        System.out.println(A);
        A+="**";
    }}
    static int fibo(int n){
        if(n==1){
            return 1;
        }
        else if (n==2) {
            return 2;
        }else return fibo(n-1)+fibo(n-2);

    }
    static  void lot(int A){
        Random r = new Random();
        int x ;
        x = r.nextInt(100);// x reçoit un nombre aléatoire entre 1 et 100
        System.out.println(x);
        while(A!=x){
            Scanner a=new Scanner(System.in);
            if(A<x) System.out.println("Plus haut");
            if (A>x) System.out.println("Plus bas");
            A= a.nextInt();
        }
        System.out.println("BRAVO");
    }

}