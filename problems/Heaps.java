// heaps are the tree data structure 
// Heaps have min heaps and max heaps
// heaps are implemented by arrays and ArrayList 
// becz class makes it hectic to do heap operations like heapify
// left child of the node = 2i * 1
// right child of the node = 2i * 2
// parent of the child = (i-1)/2
import java.util.*;

class Heaps{
    static class Heap{
		ArrayList<Integer> heap = new ArrayList<>();

		public void add(int data){
			heap.add(data);
			int x = heap.size() - 1;
			int parent = (x-1) / 2;
			while(heap.get(x) > heap.get(parent)){// O(log n)// heapify happens only one side of the heap tree
				int temp = heap.get(x);
				heap.set(x,heap.get(parent));
				heap.set(parent,temp);

			} 
		}

		// get peek
		public int peek(){
			return heap.get(0);
		}

		// remove the element from heap
		// deletion happens from leaf last node 
		//(1) swap 1st and last elem
		//(2) heapify the new tree
		public int remove(){
			// swap the fisrt and last element of the heap 
			int temp = heap.get(0);
			heap.set(0,heap.get(heap.size() - 1));

			// remove now the last node
			heap.remove(heap.size() - 1);

			//heapify the new heap
			heapify(0);
			return temp;
		}

		// heapify the heap
		public void heapify(int i){
			int leftChild = 2*i +1;
			int rightChild = 2*i +2;
			int minIndx = i;
			if(leftChild < heap.size() && heap.get(leftChild) < heap.get(minIndx)){
				minIndx = leftChild;
			}
			if(rightChild < heap.size() && heap.get(rightChild) < heap.get(minIndx)){
				minIndx = rightChild;
			}

			// swap the ith and the minindx
			if(minIndx != i){
			int temp = heap.get(minIndx);
			heap.set(minIndx,heap.get(i));
			heap.set(i,temp);
			heapify(minIndx);
			}

		}
		public boolean isEmpty(){
			return heap.size() == 0;
		}

		//print
		public void print(){
			if(!heap.isEmpty()){
				for(int i = 0 ; i < heap.size() ; i++){
					System.out.print(heap.get(i)+" ");
				}
			}else{
				System.out.println("Heap is Empty");
			}
		}
    }

		public static void main(String[] args) {
			Heap hp = new Heap();
			hp.add(4);
			hp.add(1);
			hp.add(2);
			hp.add(30);
			hp.add(22);
			hp.add(35);
			// hp.print();
			while(!hp.isEmpty()){
				System.out.println(hp.peek());
				hp.remove();
				
			}
		}
	}
