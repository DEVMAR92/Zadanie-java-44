public class Procesor {
    String producer;
    String model;
    double timing;

    public Procesor(String producer, String model, double timing) {
        this.producer = producer;
        this.model = model;
        this.timing = timing;
    }

    String showInfo() {
        String info = "PROCESOR: Producent: " + producer + ", model: " + model + ", taktowanie: " + timing;
        return info;
    }

}
