class SecondLargest{
	public static void main(String[] args){
		int arr[] = new int[]{5,10,3,4,2};
		int N = 5;
		int maxElem = Integer.MIN_VALUE;
		int sMaxElem = Integer.MIN_VALUE;
		

		for(int i=0; i<N ; i++){
			if(arr[i] > maxElem){
				maxElem = arr[i];
			}
			
		}
		for(int i=0; i<N; i++){
			if(arr[i] > sMaxElem){
				if(arr[i] == maxElem)
					break;
				sMaxElem = arr[i];
			}
		}
		System.out.println(sMaxElem);
	}
}
