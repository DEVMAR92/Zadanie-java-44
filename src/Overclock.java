public class Overclock {

    Computer computer;

    double increaseCpuClock(Computer computer, double overAmount){
        double result = computer.procesor.timing + overAmount;
        return result;
    }

    double decreaseCpuClock(Computer computer, double overAmount) {
        double result = computer.procesor.timing - overAmount;
        return result;
    }
}
