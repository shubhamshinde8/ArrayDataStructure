package Lecture04;

import java.util.Scanner;

public class PrintPositiveString {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Size : ");
//        int n=sc.nextInt();
//        System.out.println("Enter "+n+" Of Strings : ");
//        String s[]=new String[n];
//        for(int i=0;i<s.length;i++){
//            s[i]=sc.nextLine();
//        }
        String s[]={"ab","bc","cd","de","ef","fg","gh"};
        printOnlyOddstring(s);
    }
    static void printOnlyOddstring(String s[]){
        for(int i=0;i<s.length;i++){
            if(i%2!=0){
                System.out.print(s[i]+" ");
            }
        }
    }
}
