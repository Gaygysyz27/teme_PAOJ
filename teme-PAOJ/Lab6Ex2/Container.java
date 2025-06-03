package Lab6Ex2;

import Lab6Ex1.Task;

public interface Container {
    Task pop();
    void push(Task task);
    int size();
    boolean isEmpty();
} 