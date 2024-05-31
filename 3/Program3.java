class RotateArray{
	public static void main(String[] args){
		int arr[] = new int[]{1,2,3,4,5};
		int B = 2;
		int n = 5;
		int tempArr[] = new int[5];
		for(int i=0; i<n; i++){
			if(arr[i+B] < n-1)
				tempArr[i+B] = arr[i];
			else{
				if(i==0)
					continue;
				tempArr[i-B] = arr[i];
			}	
		}
		for(int i=0; i<n; i++)
			System.out.println(tempArr[i]);
	}
}
