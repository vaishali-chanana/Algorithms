package queues;

public class QueueList<T> implements Queue<T>{

	private Node front;
	private Node rear;
	private int size = 0;
	
	public class Node{
		private T val;
		private Node next;
		
		public T getVal(){
			return this.val;
		}
		
		public Node getNext(){
			return this.next;
		}
		
		public void setVal(T val){
			this.val = val;
		}
		
		public void setNext(Node next){
			this.next = next;
		}
		
	}
	
	public boolean isEmpty(){
		if(size ==0)
			return true;
		return false;
	}

	@Override
	public Queue<T> enqueue(T ele) throws Exception {
		Node node = new Node();
		node.setVal(ele);
		node.setNext(null);
		if(front == null)
			front = node;
		if(rear==null)
			rear = node;
		else{
			rear.setNext(node);
			rear = node;
			size++;
		}
		
		return this;
	}

	@Override
	public T dequeue() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is full");
		Node ret = front;
		front = front.getNext();
		size--;
		return ret.getVal();
	}

	@Override
	public T front() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is full");
		return front.getVal();
	}
	
	public static void main(String[] args) throws Exception {
		QueueList<Integer> qa = new QueueList<Integer>();
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

	}

}
