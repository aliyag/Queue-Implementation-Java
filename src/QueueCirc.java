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
		System.out.println("The front is " + front);
		System.out.println("The rear is " + rear);
		
		if (isFull() == false){
			rear = rear + 1;
			if (rear == A.length){
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
		return null;
	}
	
	/*
	 *    front() - Return (but do not delete) the item
	 *              at the front of the queue.
	 */
	
    public T front()
    {
    	return null;
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
    	int i = front; 
    	while (i < (A.length-2)){
    		i++;
    		value += A[i] + ",";
    	}
    	return value;
    }
}
