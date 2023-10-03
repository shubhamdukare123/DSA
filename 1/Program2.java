class SecondLargest{
	public static void main(String[] args){
		int[] arr = new int[]{5,4,10,15,9};
		int N = 5;
		int largest = Integer.MIN_VALUE;
		int secondLargest = largest;
		for(int i=0; i<N; i++){
			if(arr[i]>largest){
				secondLargest = largest;
				largest = arr[i];
			}
		}
		System.out.println(secondLargest);
	}
}
