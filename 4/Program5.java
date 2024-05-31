class ReverseArrayDemo{
	public static void main(String[] args){
		int arr[] = new int[]{3,4,5,3,2,6,3,5};
		int revArr[] = new int[arr.length];
		for(int  i=0,j=arr.length-1; i<arr.length; i++,j--){
			revArr[j] = arr[i];
		}
		for(int i=0; i<revArr.length; i++)
			System.out.println(revArr[i]);	
	}
}
