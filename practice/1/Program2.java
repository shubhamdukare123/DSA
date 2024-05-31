class Demo{
	public static void main(String[] args){
		int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}
}
