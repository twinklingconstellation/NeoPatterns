package Adapter;

public class USBDevice implements USB {
    @Override
    public void readData() {
        System.out.println("USB Device read Data");
    }
}
