package Lab6Ex1;

public class RandomOutTask implements Task {
    private int randomNumber;
    
    public RandomOutTask() {
        this.randomNumber = (int) (Math.random() * 100);
    }
    
    @Override
    public void execute() {
        System.out.println("Numarul generat este: " + randomNumber);
    }
} 