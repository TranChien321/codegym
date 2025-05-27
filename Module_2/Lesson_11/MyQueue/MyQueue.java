package Lesson_11.MyQueue;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head;
    private int tail;
    private int currentSize;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
       queueArr=new int[this.capacity];
    }

//    Cài đặt phương thức isQueueFull ()
    private boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

//    Cài đặt phương thức isQueueEmpty()
    private boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }
//    Cài đặt phương thức enqueue ()
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            queueArr[tail] = item;
            tail++;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

//    Cài đặt phương thức dequeue ()
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
