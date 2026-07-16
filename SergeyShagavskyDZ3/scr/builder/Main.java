package builder;

public class Main {

    public static void main(String[] args) {

        Computer computer = new ComputerBuilder()
                .setCpu("Intel Core i7")
                .setRam(32)
                .setSsd(1000)
                .setGpu("RTX 4070")
                .build();

        System.out.println(computer);
    }
}