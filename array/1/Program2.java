class ArrayDemo{
	public static void main(String[] args){
		int arr[] = new int[] {2,5,1,4,8,0,8,1,3,8};
		int count = 0;
		int N = 10;
		int itr = 0;
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(arr[i]<arr[j]){
					count++;
					break;
				}
				itr++;
			}
		}
		System.out.println(count);
		System.out.println(itr);
	}
}
