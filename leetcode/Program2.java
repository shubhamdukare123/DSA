import java.util.Arrays;

class Solution {

    static void merge(char[] arr, int start, int mid, int end){
        char[] arr1 = new char[mid-start+1];
        char[] arr2 = new char[end-mid];

        for(int i=0; i<arr1.length; i++){
            arr1[i] = arr[start+i];
        }
        for(int i=0; i<arr2.length; i++){
            arr2[i] = arr[mid+1+i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int i=0;
        int j=0; 
        int k=start;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr[k] = arr[i];
                i++;
            }else{
                arr[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            arr[k] = arr[i];
            i++;
            k++;
        }

        while(j<arr2.length){
            arr[k] = arr[j];
            j++;
            k++;
        }

    }
    static void mergeSort(char[] arr, int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr, start, mid, end);
        }
    }

    public static boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        mergeSort(ch1,0,ch1.length-1);
        System.out.println(Arrays.toString(ch1));
        char[] ch2 = t.toCharArray();
        mergeSort(ch2,0, ch2.length-1);
        System.out.println(Arrays.toString(ch2));
        for(int i=0 ; i<ch1.length; i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
