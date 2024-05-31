class ArrayDemo{
	public static void main(String[] args){
		int arr[] = new int[]{5,4,3,-6,7,9,9,2,3};
		int max = Integer.MIN_VALUE;
		int countMax = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max)
				max = arr[i];
		}
		for(int i=0; i<arr.length; i++)
			if(arr[i]==max)
				countMax++;
		
		count = arr.length-countMax;
		System.out.println(count);
	}
}
