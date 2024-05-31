import java.util.Arrays;
class SelectionSort{
	public static void main(String[] args){
		int arr[] = new int[]{2,5,9,8,6,3};
		for(int i=0 ; i<arr.length-1; i++){
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<arr[minIndex]){
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
