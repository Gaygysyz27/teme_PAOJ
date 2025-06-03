package Lab6Ex2;

import Lab6Ex1.Task;

public abstract class AbsContainer implements Container {
    protected Task[] tasks;
    protected int size;
    protected static final int INITIAL_CAPACITY = 10;
    
    public AbsContainer() {
        tasks = new Task[INITIAL_CAPACITY];
        size = 0;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    protected void ensureCapacity() {
        if (size == tasks.length) {
            Task[] newTasks = new Task[tasks.length * 2];
            System.arraycopy(tasks, 0, newTasks, 0, tasks.length);
            tasks = newTasks;
        }
    }
} 