class BubbleSort{
	void bubbleSort(int[] arr, int n){
		if(n==1){
			return;
		}
			for(int j=0; j<arr.length-1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		bubbleSort(arr, --n);
	}
	public static void main(String[] args){
		BubbleSort obj = new BubbleSort();
		int arr[] = new int[]{5,2,8,4,3,1};
		obj.bubbleSort(arr,n);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
