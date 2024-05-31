class Solution{
	public static void main(String[] args){
		int arr[][] = new int[][]{{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
		int row[] = new int[arr.length];
		int col[] = new int[arr[0].length];
		for(int i=0; i<row.length; i++){
			row[i] = -1;
		}
		for(int i=0; i<col.length; i++){
			col[i] = -1;
		}
		int m = 0;
		int n=0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(arr[i][j] == 0){
					row[m] = i;
					m++;
					col[n] = j;
					n++;
				}	
			}
		}
		for(int i=0; i<row.length; i++){
			if(row[i] == -1){
				break;
			}else{
				for(int k=0; k<arr[row[i]].length; k++){
					arr[row[i]][k] = 0;
				}
			}
		}
		for(int i=0; i<col.length; i++){
			if(col[i] == -1){
				break;
			}else{
				for(int k=0; k<arr.length; k++){
					arr[k][col[i]] = 0;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
