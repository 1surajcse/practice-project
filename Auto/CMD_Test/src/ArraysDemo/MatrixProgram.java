package ArraysDemo;

public class MatrixProgram {

	public static void main(String[] args) {
		int arr[][]={  {1,  2,  3,  4,  5},
				   {6,  7,  8,  9,  10},
				   {11, 12, 13, 14, 15},
				   {16, 17, 18, 19, 20},
				   {21, 22, 23, 24, 25}
				  };
		
		int startRow=0;
		int startColumn=0;
		int rowLength=arr.length-1;
		int colLength=arr[0].length-1;
		
		while(startRow<=rowLength&&startColumn<=colLength){
			
			for(int i=startRow;i<=rowLength;i++){
				System.out.print(arr[startRow][i]+" ");
			}

			for(int j=startRow+1;j<=colLength;j++){
				System.out.print(arr[j][colLength]+" ");
			}

			if(startRow+1<=rowLength){
			for(int i=colLength-1;i>=startColumn;i--){
				System.out.print(arr[rowLength][i]+" ");
			}}
			if(startColumn+1<=colLength){
			for(int k=rowLength-1;k>startRow;k--){
				System.out.print(arr[k][startColumn]+ " ");
			}
			}
			startColumn++;
			startRow++;
			rowLength--;
			colLength--;
		}
		


	}

}
