class OneLargest{
	public static void main(String[] args){
		int[] arr = new int[]{2,5,1,4,8,0,8,1,3,8};
		int maxElem = Integer.MIN_VALUE;
		int N = 10;
		int countMaxElem = 0;
		for(int i=0; i<N; i++){
			if(arr[i]>maxElem){
				maxElem = arr[i];
			}
		}
		for(int i=0; i<N; i++){
			if(arr[i] == maxElem)
				countMaxElem++;
		}
		System.out.println(N-countMaxElem);
	}
}
