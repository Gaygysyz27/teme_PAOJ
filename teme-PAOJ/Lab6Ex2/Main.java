package Lab6Ex2;

import Lab6Ex1.*;

public class Main {
    public static void main(String[] args) {
        // Test Stack (LIFO)
        System.out.println("Test Stack (LIFO):");
        Container stack = new Stack();
        
        stack.push(new OutTask("Primul mesaj"));
        stack.push(new OutTask("Al doilea mesaj"));
        stack.push(new OutTask("Al treilea mesaj"));
        
        while (!stack.isEmpty()) {
            Task task = stack.pop();
            task.execute();
        }
        
        // Test Queue (FIFO)
        System.out.println("\nTest Queue (FIFO):");
        Container queue = new Queue();
        
        queue.push(new OutTask("Primul mesaj"));
        queue.push(new OutTask("Al doilea mesaj"));
        queue.push(new OutTask("Al treilea mesaj"));
        
        while (!queue.isEmpty()) {
            Task task = queue.pop();
            task.execute();
        }
        
        // Test cu diferite tipuri de task-uri
        System.out.println("\nTest cu diferite tipuri de task-uri:");
        Container mixedContainer = new Stack();
        
        mixedContainer.push(new OutTask("Mesaj normal"));
        mixedContainer.push(new RandomOutTask());
        mixedContainer.push(new CounterOutTask());
        mixedContainer.push(new CounterOutTask());
        
        while (!mixedContainer.isEmpty()) {
            Task task = mixedContainer.pop();
            task.execute();
        }
    }
} 