import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,1,5,2,3};
        selection2(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int last=arr.length-i-1;
            int max=maxOf(arr,0,last);
            swap(arr,max,last);
//            int temp=arr[max];
//            arr[max]=arr[last];
//            arr[last]=temp;
        }
    }
    public static void selection2(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int fisrt=0+i;
            int min=minOf(arr,fisrt,arr.length-1);
            swap(arr,min,fisrt);
//            int temp=arr[max];
//            arr[max]=arr[last];
//            arr[last]=temp;
        }
    }
    public static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }

    private static int maxOf(int[] arr,int st,int last) {
      int max=0;
      for(int i=st;i<=last;i++){
          if(arr[max]<arr[i]){
              max=i;
          }
      }
    return max;
    }
    private static int minOf(int[] arr,int st,int last) {
        int min=st;
        for(int i=st;i<=last;i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        return min;
    }
}

