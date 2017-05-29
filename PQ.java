package ut1;

import java.util.*;

class PriorityQueue{
	private int maxSize;
	private int[] queueArray;
	private int nItems;

	public PriorityQueue(int size){ //Constructor
		maxSize = size;
		queueArray = new int[size];
		nItems = 0;
	}

	public void insert(int value){ //Inserts an element in it's appropriate place
		if(nItems == 0){
			queueArray[0] = value;
		}
		else{
			int j = nItems;
			while(j > 0 && queueArray[j-1] < value){
				queueArray[j] = queueArray[j-1]; //Shifts every element up to make room for insertion
				j--;
			}
			queueArray[j] = value; //Once the correct position is found the value is inserted
		}
		nItems++;
	}

	public int remove(){ //Remove the element from the front of the queue
		return queueArray[--nItems];
	}

	public int peek(){ //Checks what's at the front of the queue
		return queueArray[nItems-1];
	}

	public boolean isEmpty(){ //Returns true is the queue is empty
		return(nItems == 0);
	}

	public boolean isFull(){ //Returns true is the queue is full
		return(nItems == maxSize);
	}

	public int getSize(){ //Returns the number of elements in the queue
		return nItems;
	}
}
//Example
public class PQ{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size please: ");
		int size = sc.nextInt();
		PriorityQueue myQueue = new PriorityQueue(size);
		/*myQueue.insert(10);
		myQueue.insert(2);
		myQueue.insert(5);
		myQueue.insert(3);*/
		//[2, 3, 5, 10] Here higher numbers have higher priority, so they are on the top
		
		for(int i=0;i<size;i++){
			System.out.println("Enter nums please: ");
			myQueue.insert(sc.nextInt());
		}
		
		
		for(int i = size-1; i>=0; i--)
			System.out.print(myQueue.remove() + " "); //will print the queue in reverse order [10, 5, 3, 2]

		//As you can see, a Priority Queue can be used as a sorting algotithm
	}
}