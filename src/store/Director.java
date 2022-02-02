package store;

public class Director {
    PhoneBuilder builder;

    public void setBuilder(PhoneBuilder builder) {
        this.builder = builder;
    }

    Phone buildPhone(){
        builder.createPhone();

        builder.buildInternalMemory();
        builder.buildExternalMemory();
        builder.buildSIMcards();
        builder.buildCPU();
        builder.endPrice();

        Phone phone = builder.getPhone();

        return phone;
    }
}
