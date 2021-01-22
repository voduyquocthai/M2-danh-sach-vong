

public class Queue {
    private Node rear;
    private Node front;
    private int size;

    public Queue() {
        this.rear = null;
        this.front = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        boolean response = false;
        if (size == 0)
            response = true;
        return response;
    }

    public void enqueue(int element) {
        Node node = new Node(element);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
        }
        rear = node;
        rear.setNext(front);
        size++;
    }

    public Node dequeue() {
        Node response = null;
        if (front != null) {
            if (front.getNext() != null) {
                response = new Node(front.getData());
                front = front.getNext();
                rear.setNext(front.getNext());
                size--;
            } else {
                response = new Node(front.getData());
                front = null;
                rear = null;
                size--;
            }
        }
        return response;
    }
}
