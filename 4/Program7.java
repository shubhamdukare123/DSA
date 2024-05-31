class RevDemo{
	public static void main(String[] args){
		int arr[] = new int[]{1,2,3,4};
		for(int i=0,j=arr.length-1; i<j; i++,j--){
			arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
		}	
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
