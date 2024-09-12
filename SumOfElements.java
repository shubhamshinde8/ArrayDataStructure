package Lecture04;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" element : ");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("sum :"+sumOfElement(a));
    }
    static int sumOfElement(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        return sum;
    }
}
