public class Computer {
    String name;
    Procesor procesor;
    Memory memory;

    public Computer(String name, Procesor procesor, Memory memory) {
        this.name = name;
        this.procesor = procesor;
        this.memory = memory;
    }
    void showInfo(){
        String info = "Nazwa komputera: " + name;
        String memoryInfo = memory.showInfo();
        String procesorInfo = procesor.showInfo();
        System.out.println(info + "\n" + memoryInfo + "\n" + procesorInfo + "\n");
    }
}
