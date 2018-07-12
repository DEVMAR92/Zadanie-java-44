public class Test {
    public static void main(String[] args) {
        // 1.KOMPUTER
        Procesor procesor1 = new Procesor("AMD", "Ryzen 7", 4300);
        Memory memory1 = new Memory("GOODRAM", "IRDM", 16384, 2400);
        Computer computer1 = new Computer("Lenovo", procesor1, memory1);

        // 2. KOMPUTER
        Procesor procesor2 = new Procesor("INTEL", "i7", 4600);
        Memory memory2 = new Memory("Gorsair", "Vengeance", 8196, 2666);
        Computer computer2 = new Computer("SONY", procesor2, memory2);



        computer1.showInfo();
        computer2.showInfo();
    }
}
