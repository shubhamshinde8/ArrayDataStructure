package Lecture04;

import java.util.Arrays;
import java.util.Scanner;

public class KthsmallestElement {
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
        System.out.println(kth_smallest_Element(a,x));
    }

    static int kth_smallest_Element(int a[],int k){
        Arrays.sort(a); // 7 10 4 3 20 15 -> 3 4 7 10 15 20
        return a[k-1];
    }
}
