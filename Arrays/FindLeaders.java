/*
Given an array arr of n positive integers, 
your task is to find all the leaders in the array. 
An element of the array is considered a leader 
if it is greater than all the elements on its 
right side or if it is equal to the maximum element on its right side. 
The rightmost element is always a leader.

Examples

Input: n = 6, arr[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.*/
import java.util.*;
class FindLeaders {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[]) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int greater = 0;
        int arr1[] = new int[arr.length];
        for(int i = arr.length -1 ; i >=0 ; i--){
            greater = Math.max(greater,arr[i]);
            if(arr[i] >= greater){
                list.add(0,greater);                
            }else{
                list.add(0,0);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{16,17,4,3,5,2};
        System.out.println(leaders(arr).toString());
    }
}
