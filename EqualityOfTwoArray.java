package Lecture04;

import java.util.Scanner;

public class EqualityOfTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");

        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element : ");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter size : ");

        int m=sc.nextInt();
        System.out.println("Enter "+m+" Element : ");
        int b[]=new int[m];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }

        if(a==b){
            System.out.println("true");
        }else{
            System.out.println("False ");
        }

    }
}
