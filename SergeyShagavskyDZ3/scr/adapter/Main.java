package adapter;

public class Main {

    public static void main(String[] args) {

        OldKeyboard oldKeyboard = new OldKeyboard();

        USB adapter = new KeyboardAdapter(oldKeyboard);

        adapter.connectWithUsb();

    }

}