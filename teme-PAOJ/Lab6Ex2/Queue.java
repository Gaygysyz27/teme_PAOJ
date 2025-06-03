package Lab6Ex2;

import Lab6Ex1.Task;

public class Queue extends AbsContainer {
    private int front;
    private int rear;
    
    public Queue() {
        super();
        front = 0;
        rear = 0;
    }
    
    @Override
    public Task pop() {
        if (isEmpty()) {
            return null;
        }
        Task task = tasks[front];
        front = (front + 1) % tasks.length;
        size--;
        return task;
    }
    
    @Override
    public void push(Task task) {
        ensureCapacity();
        tasks[rear] = task;
        rear = (rear + 1) % tasks.length;
        size++;
    }
} 