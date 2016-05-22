package com.company;

public class Main {

    public static void main(String[] args) {
        easiestexerciseever();
        System.out.println();
        drawhorizontalline(8);
        System.out.println();
        drawverticalline(3);
        System.out.println();
        drawrighttrianlge(3);
        System.out.println();
        isocelestrinagle(3);
        System.out.println();
        diamond(3);
        System.out.println();
        diamondwithname(3,"Bill");
        System.out.println();
        fizzbuzz();
        System.out.println();
        primefactors(30);

	// write your code here
    }

    private static void primefactors(int n) {
        for(int i=2; i<n/2+1; i++)
            if(n%i==0 && isprime(i)==0)
                System.out.println(i);
    }

    private static int isprime(int i) {
        for(int j=2; j<i/2+1; j++)
            if(i%j==0) return 1;
        return 0;
    }

    private static void fizzbuzz() {
        for(int i=1; i<101; i++)
        if(i%15==0)
            System.out.println("FizzBuzz");
        else if(i%3==0)
                System.out.println("Fizz");
        else if(i%5==0)
                System.out.println("Buzz");
        else
                System.out.println(i);
    }

    private static void diamondwithname(int n, String s) {
        int t=n*2-1, j;

        for(int i=1;i<n;i++) {
            for(j=0;j<t/2-i+1;j++)
                System.out.print(" ");
            for(;j<t/2+i; j++)
                System.out.print("*");
            System.out.println();
        }

        if(t>s.length())
            for(int i=0; i<t-s.length(); i++)
                System.out.print(" ");

        System.out.println(s);
        for(int i=n-1;i>0;i--){
            for(j=0;j<t/2-i+1;j++)
                System.out.print(" ");
            for(;j<t/2+i; j++)
                System.out.print("*");
            System.out.println();
        }

    }

    private static void diamond(int n) {
        int t=n*2-1, j;

        for(int i=1;i<n+1;i++) {
            for(j=0;j<t/2-i+1;j++)
                System.out.print(" ");
            for(;j<t/2+i; j++)
                System.out.print("*");

            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(j=0;j<t/2-i+1;j++)
                System.out.print(" ");
            for(;j<t/2+i; j++)
                System.out.print("*");

            System.out.println();
        }

    }

    private static void isocelestrinagle(int n) {
        int t=n*2-1, j;

        for(int i=1;i<n+1;i++) {
            for(j=0;j<t/2-i+1;j++)
                System.out.print(" ");
            for(;j<t/2+i; j++)
                System.out.print("*");

            System.out.println();


        }
    }

    private static void drawrighttrianlge(int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    private static void drawverticalline(int n) {
        System.out.println();
        for(int i=0; i<n; i++)
            System.out.println("*");
    }

    private static void drawhorizontalline(int n) {
        System.out.println();
        for(int i=0; i<n; i++)
            System.out.print("*");
        System.out.println();
    }

    private static void easiestexerciseever() {
        System.out.println();
        System.out.println("*");
    }
}
