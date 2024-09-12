package Lecture04;

import java.util.Scanner;

public class FirstPeakElement {
    public static void main(String[] args) {
        int a[]={1,1,3,4,2,3,5,7,0};
        int peak=findFirstPeakElement(a);
        if(peak!=-1){
            System.out.println("Peak Element is found : "+peak);
        }else{
            System.out.println("Peak not found ");
        }

    }
    static int findFirstPeakElement(int a[]){
        for(int i=1;i<a.length-1;i++){
            if(a[i]>a[i-1] && a[i]>a[i+1]){
                return a[i];
            }
        }
        return -1;
    }
}
