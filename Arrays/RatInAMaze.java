import java.util.*;	
public class RatInAMaze{
	 
	static boolean visited[][] = new boolean[4][4];

	public static void backtrack(int i,int j,int[][] arr,StringBuilder result,StringBuilder sub,String direction){
		// 🚫 Out of bounds, visited already, or blocked cell
		if(i < 0 || j < 0 || j >= arr[0].length || i >= arr.length || visited[i][j] || arr[i][j] == 0){
			return;
		}	

		
    sub.append(direction);
System.out.println(sub.toString());
		// 🎯 Destination reached
		if(i == arr.length-1 && j == arr[0].length-1){
			result.append(",").append(sub.toString());
			// 🔙 Backtrack: remove last appended direction
			sub.deleteCharAt(sub.length() - 1);
			return;
		}

		// 🚶 Explore all 4 directions
		visited[i][j] = true;
		backtrack(i+1,j,arr,result,sub,"D"); // Down
		backtrack(i-1,j,arr,result,sub,"U"); // Up
		backtrack(i,j+1,arr,result,sub,"R"); // Right
		backtrack(i,j-1,arr,result,sub,"L"); // Left
		visited[i][j] = false;

		// 🔙 Backtrack: remove last appended direction
		sub.deleteCharAt(sub.length() - 1);
	}

	public static void main(String[] args) {
		int [][] arr = {
			{1,0,1,0},
			{1,1,1,1},
			{1,0,0,1}
		};
		StringBuilder result = new StringBuilder();
		backtrack(1,0,arr,result,new StringBuilder(),"D"); 
		System.out.println("All paths: " + result.toString());
	}
}
