class SetMatrixZeroes{
	public static void main(String[] args){
		int arr[][] = new int[][]{{1,1,1}, {1,0,1}, {1,1,1}};
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(arr[i][j] == 0){
					if(i != 0 && arr[i-1][j] == 0){
						continue;
					}else{
						for(int k=0; k<arr[i].length; k++){
							arr[i][k] = 0;
						}
						for(int k=0; k<arr.length; k++){
							arr[k][j] = 0;
						}		
						break;
					}			
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
