package Lecture04;

import java.util.Scanner;

public class PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");

        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element : ");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        printAllEvenElement(a);
    }
    static void printAllEvenElement(int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}
