public class ComputerAssembly {


    Computer assembly(String name, String procesorName, double procesorClock, String memoryName, double memoryAmount, double memoryClock ){

        Procesor procesor = new Procesor(procesorName, procesorClock);
        Memory memory = new Memory(memoryName, memoryAmount, memoryClock);
        Computer computer = new Computer(name, procesor, memory);
        return computer;
    }
}
