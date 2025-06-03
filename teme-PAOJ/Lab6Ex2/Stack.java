package Lab6Ex2;

import Lab6Ex1.Task;

public class Stack extends AbsContainer {
    @Override
    public Task pop() {
        if (isEmpty()) {
            return null;
        }
        return tasks[--size];
    }
    
    @Override
    public void push(Task task) {
        ensureCapacity();
        tasks[size++] = task;
    }
} 