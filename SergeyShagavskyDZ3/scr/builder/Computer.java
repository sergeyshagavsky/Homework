package builder;

public class Computer {

    private final String cpu;
    private final int ram;
    private final int ssd;
    private final String gpu;

    public Computer(String cpu, int ram, int ssd, String gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Компьютер {" +
                "CPU='" + cpu + '\'' +
                ", RAM=" + ram + " ГБ" +
                ", SSD=" + ssd + " ГБ" +
                ", GPU='" + gpu + '\'' +
                '}';
    }
}