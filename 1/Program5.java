class PairsDemo{
	public static void main(String[] args){
		int[] arr = new int[]{3,5,2,1,-3,7,8,15,16,13};
		int count = 0;
		int k = 10;
		int itr = 0;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(i!=j && arr[i] + arr[j] == k){
					count = count + 2;

				}
				itr++;
			}
		}
		System.out.println(count);
		System.out.println(itr);

	}
}
