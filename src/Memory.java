public class Memory {
    String producer;
    String model;
    double amount;
    double timing;

    public Memory(String producer, String model, double amount, double timing) {
        this.producer = producer;
        this.model = model;
        this.amount = amount;
        this.timing = timing;
    }

    String showInfo() {
        String info = "MEMORY: Producent: " + producer + ", model: " + model + ", ilość: " + amount + ", taktowanie: " + timing;
        return info;
    }
}
