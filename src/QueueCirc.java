/*
 *   class QueueCirc
 *   
 *   A Circular Implementation of the generic QueueInterface.
 */

public class QueueCirc<T> implements QueueInterface<T>
{
	private int front = 0;   // Index of the front item in the queue.
	private int rear = -1;   // Index of the rear item in the queue.
	
	T[] A = (T[]) new Object[20];  // Generic arrays cannot be constructed in Java.
	                               // A solution is to create an array of Object
	                               // and type cast as an array of a generic type.
	                               // Ignore any warnings the compiler generates.
	/*
	 *    The Queue constructor.
	 */
	
	
	public QueueCirc()
	{
		return;
	}

	/*
	 *    enqueue() - add an item to the rear of the queue.
	 *                Do nothing if the queue is full.
	 */
	
	public void enqueue(T item)
	{ 
		
		if (isFull() == false){
			rear = rear + 1;
			if (rear == A.length-1){
				rear = 0;
			}
			A[rear] = item;
		}
		
	}
	
    /*
     *   dequeue() - delete and return the front item
     *               in the queue. Return null if 
     *               the queue is empty.
     */
	
	public T dequeue()
	{
		if (front == A.length-1){
			front = 0;
			
		}
		else {front++;}
				 //increment front
	
		System.out.println("The value of the front is " + front);
		System.out.println("The value of the rear is " + rear);
		return A[front];//print new front value
		
	}
	
	/*
	 *    front() - Return (but do not delete) the item
	 *              at the front of the queue.
	 */
	
    public T front()
    {
    	return A[front]; //return front item
    }
    
    /*
     *    isEmpty() - returns true if the queue is empty 
     *                else returns false.
     */
    
    public boolean isEmpty()
    {
    	if ((front-1) == rear) {
    		return true; 
    	}
    	return false;
    }
    
    /*
     *    isFull() - returns true if the queue is empty 
     *               else returns false.
     */
    
    public boolean isFull()
    {  
    	int tempRear = rear;
   		if (tempRear == A.length-1){
    		tempRear=0;
   		}
   		else {tempRear++;}
   		if (tempRear == A.length-1){
    		tempRear=0;
   		}
   		else {tempRear++;}
   		if (front == tempRear) {
	    	return true;
	    }
    	return false;
    }
    
    /*
     *  toString() - return a printable display of
     *               the items in the queue. 
     */
    
    public String toString()
    {
    	String result = "Array is empty";
    	String value = "";
    	
    	if (isEmpty()){
    		return result;
    	}
 
    	int tempFront = front;
    	int tempRear = rear; 
    	if ((tempRear + 1) == A.length) {
    		tempRear = 0;
    	}
    	while (tempFront != tempRear + 1){
    		if (tempFront == A.length-1){
    			tempFront=0;
    			value += A[tempFront] + ",";
    			tempFront++;
    		}
    		else {value += A[tempFront] + ","; tempFront++;}
    	}

    	return value;
    }
}
