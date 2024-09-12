package Lecture04;

public class FirstOccurenceElement {
    public static void main(String[] args) {

        int arr[]={1,5,4,3,5,6};
        System.out.println(firstRepeated(arr));
    }
    public static int firstRepeated(int[] arr) {

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return i+1;
                }
            }
        }
        return 0;
    }
}
