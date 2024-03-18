
import java.util.Stack;
public class Stack1 {
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static class InnerStack {
    
        static Node head;
        InnerStack(){
            head = null;
        }
        public void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }
        public void pop(){
            if(head == null){
               System.out.println("The stack is empty");
               return;
            }
            System.out.println("popped "+head.data);
            head = head.next;
        }
        public void print(){
            if(head == null){
                System.out.println("underflow condition");
            }
             Node temp = head;
            System.out.println("___________The Stack is___________");

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        public void pushAtBottom(Stack<Integer> st,int data){
            if(st.isEmpty()){
                st.push(data);
                return;
            }
            int top = st.pop();
            pushAtBottom(st,data);
            st.push(top);



        }
        public void pushAtBottom(int data){
            Node newNode = new Node(data);
            if(head == null){
                    head = newNode;
                    return;
            }
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        public void  pushAtBottomRec(int data, Node node){
            if(node == null){
                Node newNode = new Node(data);
                head = newNode;
                return;
            }
            pushAtBottomRec(data,node.next);
            node.next = head;
            head = node;
        }
        public Node getHead(){
            if(head == null){
                System.out.println("Stack is Empty");
                return null;
            }
            return head;
        }

        // peek the top of the stack
        public int peek(){
            if(head == null){
                return -1;
            }
            else{
                return head.data;
            }
        }
        //
        public boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }
        // next Greater Element
        public void nextGreaterElement(int arr[]){
            
            int [] newArr = new int [arr.length];
            for(int j = arr.length -1 ; j>=0 ; j--){
            while(!isEmpty() && peek() <= arr[j]){
                pop();
            }
            if(isEmpty()){
                newArr[j] = -1;
            }
            else{
                newArr[j] = peek();
            }
                push(arr[j]);

        }

            for(int i = 0 ; i < newArr.length ; i++){
            System.out.print(newArr[i]+" ");
        }
        }

        // Valid Parenthesis {'(','[','{','}',']',')'}
        public boolean validParenthesis(char arr[]){
            Stack<Character> st = new Stack<>();
            for(int i = 0 ; i < arr.length ; i++){
                char ch = arr[i];
                if(ch == '('|| ch == '[' || ch == '{'){
                    st.push(ch);
                }else if(st.pop() != ')' || st.pop() != '}' || st.pop() != ']'){
                    return false;
                }
                st.pop();
            }
            return st.isEmpty();
        }

        // check valid parenthesis
        public void validParenthesis(String str){
            for(int i = 0 ; i < str.length() ; i++){
                char ch = str.charAt(i);
                if(ch == '('|| ch == '[' || ch == '{'){
                    push(ch);
                    // System.out.println("this is peek"+(char)peek());
                }else if(!isEmpty() && ((peek() == '(' && ch == ')') || (peek() == '{' && ch == '}') || (peek() == '[' && ch == ']'))){
                    pop();
                }else push(ch);
            }
             if(isEmpty()){
                System.out.println("valid");
            }else{
                System.out.println("Not valid");
            }
        }

    }

    public static void main(String[] args) {
        // InnerStack st = new InnerStack();
        // st.push(7);
        // st.push(22);
        // st.push(28);
        // st.print();
        //     Node head = st.getHead();
        //     st.pushAtBottomRec(1,head);
        //     st.pushAtBottomRec(56,head);
        //     st.pushAtBottomRec(9,head);
        //     st.print();

        InnerStack st = new InnerStack(); 
        // String str = "abcdef";
        // for(int i = 0 ;i < str.length() ; i++){
        //     st.push(str.charAt(i));
        // }
        // // System.out.println("Hello this is not working"+st.isEmpty());
        // StringBuilder stri = new StringBuilder();
        // while(!st.isEmpty()){
        //     char ch = st.pop();
        //     stri.append(ch);

        // }
        // System.out.println(stri.toString());


            // st.push(1);
            // st.push(3);
            // st.push(2);
            // st.push(15);
            // st.push(10);
            // // System.out.println(st.peek());
            // InnerStack stack = new InnerStack();
            // stack.pushAtBottom(st,12); 
            // stack.pushAtBottom(st,2); 
            // stack.pushAtBottom(st,172); 
            // while(!st.isEmpty())System.out.println(st.pop());

        // **************Next Generater***********
        // int [] arr = {6,8,0,1,3};//[8,-1,1,3,-1]
        // // next greater element
        // st.nextGreaterElement(arr);

        // ***********Valid Parenthesis*********

        // String str = "{}{}{}{}()()))){}{}";
        // st.validParenthesis(str);
        //     Stack<Character> st = new Stack<>();
        //     for(int i = 0 ; i < str.length() ; i++){
        //         char ch = str.charAt(i);
        //         if(ch == '('|| ch == '[' || ch == '{'){
        //             st.push(ch);
        //         }else if(!st.isEmpty() && ((st.peek() == '(' && ch == ')') || (st.peek() == '{' && ch == '}') || (st.peek() == '[' && ch == ']'))){
        //             st.pop();
        //         }else st.push(ch);
        //     }
        //     if(st.isEmpty()){
        //         System.out.println("valid");
        //     }else{
        //         System.out.println("Not valid");
        //     }
        
            


            }}