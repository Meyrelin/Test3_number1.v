
package com.company;

        import java.util.Scanner;
        import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void task1() {
        int a;
        int b;
        int c;
        int n;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Введите n: (>2)");
            n = scanner.nextInt();
        }while (n<=2);
        boolean flag=false;
        int res;
    n=3;
        for ( a = 1; a <100 ; a++) {
            for ( b = 1; b <100 ; b++) {
                for ( c = 1; c <100 ; c++) {
                    if(Math.pow(a,n)+Math.pow(b,n)==Math.pow(c,n))  {
                        System.out.println("Есть решение!\nn="+n+" a="+a+" b="+b+" c="+c);
                        flag=true;
                    }

                }

            }

        }
        if(flag==false){
            System.out.println("Нет решений!");
        }

        System.out.println("ПРОВЕРКА ДЛЯ n=2");
        n=2;
        flag=false;
        for ( a = 1; a <100 ; a++) {
            for ( b = 1; b <100 ; b++) {
                for ( c = 1; c <100 ; c++) {
                    if(Math.pow(a,n)+Math.pow(b,n)==Math.pow(c,n))  {
                        System.out.println("Есть решение!\nn="+n+" a="+a+" b="+b+" c="+c);
                        flag=true;
                    }

                }

            }

        }
        if(flag==false){
            System.out.println("Нет решений!");
        }

    }

    public static void main(String[]args){
        task1();
    }
}
