package store;

public abstract class PhoneBuilder {
    Phone phone;

    void createPhone(){
        phone = new Phone();
    }

    public abstract void buildInternalMemory();
    public abstract void buildExternalMemory();
    public abstract void buildSIMcards();
    public abstract void buildCPU();
    public abstract void endPrice();

    public Phone getPhone() {
        return phone;
    }
}
