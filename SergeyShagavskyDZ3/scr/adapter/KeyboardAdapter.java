package adapter;

public class KeyboardAdapter implements USB {

    private OldKeyboard oldKeyboard;

    public KeyboardAdapter(OldKeyboard oldKeyboard) {
        this.oldKeyboard = oldKeyboard;
    }

    @Override
    public void connectWithUsb() {
        oldKeyboard.connectWithPs2();
    }

}
