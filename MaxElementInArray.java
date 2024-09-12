package Lecture04;

import java.util.Scanner;

public class MaxElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element : ");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Maximum Element : "+maxElement(a));
    }
    static int maxElement(int a[]){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}
