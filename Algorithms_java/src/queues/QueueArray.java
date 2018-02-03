package queues;

public class QueueArray<T> implements Queue<T> {

	private T[] arr;
	private int front, rear, size;
	private int capacity;
	
	public QueueArray(int capacity){
		this.capacity = capacity;
		this.arr = (T[]) new Object[capacity];
		front = 0;
		rear = capacity-1;
		size = 0;
	}
	
	public boolean isEmpty(){
		if(size==0)
			return true;
		return false;
	}
	@Override
	public QueueArray<T> enqueue(T ele) throws Exception {
		if(size == capacity)
			throw new Exception("Queue is full");
		else{
			arr[(++rear)%capacity] = ele;
			size++;
		}
		return this;
	}

	@Override
	public T dequeue() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is empty");
		
		T elem = arr[front];
		front = (front +1)%capacity;
		size--;
		
		return elem; 
	}

	@Override
	public T front() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is empty");
		
		return arr[front];
	}
	
	public static void main(String args[]){
		QueueArray<Integer> qa = new QueueArray<Integer>(5);
		
		try {
			qa.enqueue(1);
			qa.enqueue(2);
			qa.enqueue(3);
			qa.enqueue(4);
			qa.enqueue(5);
			
			
			System.out.println(qa.front());
			
			qa.dequeue();
			qa.dequeue();
			
			System.out.println(qa.front());
			qa.enqueue(9);
			qa.enqueue(10);
			System.out.println(qa.front());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
