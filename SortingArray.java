package l2test;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void sortArr(int[] arr1,int[] arr2) {

        int[] arr=new int[arr1.length+arr2.length];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            arr[k++]=arr1[i];

        }
        for (int j=0;j<arr2.length;j++){
            arr[arr1.length+j]=arr2[j];

        }
        Arrays.sort(arr);

        int min = 0;
        int max = arr.length - 1;
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(arr[min++]+" ");
                } else {
                    System.out.print(arr[max--]+" ");
                }
            }
    }
    public static int[] sort(int[] arr1,int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int k = 0;
        int l=0;
        int j=0;
        int m=arr1.length-1;
        int n = arr2.length - 1;
        for (int i = 0; i < arr1.length+arr2.length; i++) {
            if (i % 2 == 0) {
                if (arr1[l] <= arr2[j]) {
                    newArr[k++] = arr1[l];
                    l++;
                } else {
                    newArr[k++] = arr2[j];
                    j++;
                }
            } else {
                if (arr1[m] >= arr2[n]) {
                            newArr[k++] = arr1[m];
                            m--;
                        } else {
                            newArr[k++] = arr2[n];
                            n--;
                        }
                }
            }
        return newArr;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the arr length");
        int length1= in.nextInt();
        System.out.println("Enter arr element");
        int[] arr1=new int[length1];
        for (int i=0;i<length1;i++){
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter the arr length");
        int length2=in.nextInt();
        System.out.println("Enter arr element");
        int [] arr2=new int[length2];
        for (int i=0;i<length2;i++){
            arr2[i]=in.nextInt();
        }
     //   sortArr(arr1,arr2);
        int[] res=sort(arr1,arr2);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}

