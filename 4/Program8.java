class SecondLargestELem{
	public static void main(String[] args){
		int arr[] = new int[]{4,5,6,3,5,6,7,4};
		int sMax=0;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				sMax = max;
				max = arr[i];
			}
		}
		System.out.println(sMax);
	}
}
