package Lab6Ex1;

public class TaskTest {
    public static void main(String[] args) {
        // Test OutTask
        Task outTask = new OutTask("Acesta este un mesaj de test");
        outTask.execute();
        
        // Test RandomOutTask
        Task randomTask1 = new RandomOutTask();
        Task randomTask2 = new RandomOutTask();
        randomTask1.execute();
        randomTask2.execute();
        
        // Test CounterOutTask
        Task counterTask1 = new CounterOutTask();
        Task counterTask2 = new CounterOutTask();
        Task counterTask3 = new CounterOutTask();
        
        counterTask1.execute();
        counterTask2.execute();
        counterTask3.execute();
    }
} 