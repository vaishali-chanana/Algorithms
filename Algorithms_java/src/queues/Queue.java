package queues;

public interface Queue<T> {

	Queue<T> enqueue(T ele) throws Exception;
	T dequeue() throws Exception;
	T front() throws Exception;
}
