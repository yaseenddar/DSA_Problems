import java.util.Stack;

public class SortStack{
	public static void sort(Stack<Integer> stack){
		if(!stack.isEmpty()){
			int temp = stack.pop();
			sort(stack);
			insertSort(stack,temp);


		}
	}
	   
	public static void insertSort(Stack<Integer> stack,int x){
		if(stack.isEmpty() || x <= stack.peek()){
			stack.push(x);
			return;
		}
		int temp = stack.pop();
		insertSort(stack,x);
		stack.push(temp);
	}
 // Print the stack without emptying it
    public static void printStack(Stack<Integer> stack) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
public static void main(String[] args) {
	
	Stack<Integer> st = new Stack<>();
	st.push(3);
	st.push(5); 
	st.push(1); 
	st.push(6); 
	st.push(8); 
	st.push(56);
	printStack(st);
    sort(st);
	printStack(st);

}
}