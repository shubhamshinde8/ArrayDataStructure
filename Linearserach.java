package Lecture04;

import java.util.Scanner;

public class Linearserach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element : ");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter X : ");
        int x=sc.nextInt();
        System.out.println(serchInArray(a,x));

    }
    static int serchInArray(int a[],int x){
        for(int i=0;i<a.length;i++){
            if(x==a[i]){
                return i+1;
            }
        }
        return -1;
    }
}
