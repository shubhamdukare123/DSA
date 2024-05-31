class ArrayDemo{
	public static void main(String[] args){
		int[] A = new int[]{1,2,3,4};
		int B = 1;
		for(int i=0; i<A.length/2; i++){
				A[i] = A[i] + A[i+B];
				A[i+B] = A[i] -  A[i+B];
				A[i] = A[i] - A[i+B];
			
		}
		for(int i=0; i<A.length; i++)
			System.out.println(A[i]);
	}
}
