class ArrayDemo{
	public static void main(String[] args){
		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
		int count = 0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(arr[j]>arr[i]){
					System.out.println(arr[i]);
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
