package Lecture04;

import java.util.Scanner;

public class PositiveInFirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");

        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element : ");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int ans[]=setPositiveElement(a);
        for(int val:ans){
            System.out.print(val+" ");
        }
    }
    static int[] setPositiveElement(int a[]){
        int ans[]=new int[a.length];
        int x=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                ans[x++]=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                ans[x++]=a[i];
            }
        }
        return ans;
    }
}
