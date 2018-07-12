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

        Overclock overclock = new Overclock();

        computer1.showInfo();
        computer2.showInfo();

        // PODKRĘCAMY PROCESOR 1. KOMPUTERA O 200

        double overclockCpu1 = overclock.increaseCpuClock(computer1,200);

        System.out.println("Podkręcono procesor do " + overclockCpu1);

        // ZMNIEJSZAMY PROCESOR 2. KOMPUTERA O 400

        double overclockCpu2 = overclock.decreaseCpuClock(computer2, 400);

        System.out.println("Zmniejszono procesor do " + overclockCpu2);

        // TWORZYMY 3. KOMPUTER POPRZEZ METODE ASSEMBLY

        ComputerAssembly computerAssembly = new ComputerAssembly();

        Computer computer3 = computerAssembly.assembly("Komputer3","AMD", 4400,
                "G.SKILL", 2048, 2200);
        computer3.showInfo();

    }
}
