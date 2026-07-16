package builder;

public class ComputerBuilder {

    private String cpu;
    private int ram;
    private int ssd;
    private String gpu;

    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setSsd(int ssd) {
        this.ssd = ssd;
        return this;
    }

    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public Computer build() {
        return new Computer(cpu, ram, ssd, gpu);
    }
}