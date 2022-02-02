package store;

public class Phone {
    private String internalMemory;
    private String externalMemory;
    private int simCards;
    private String CPU;
    private int endPrice;

    public void setInternalMemory(String internalMemory) {
        this.internalMemory = internalMemory;
    }

    public void setExternalMemory(String externalMemory) {
        this.externalMemory = externalMemory;
    }

    public void setSimCards(int simCards) {
        this.simCards = simCards;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setEndPrice(int endPrice) {
        this.endPrice = endPrice;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Внутренняя память ='" + internalMemory + '\'' +
                ", Внешняя память ='" + externalMemory + '\'' +
                ", Слоты SIM-карт = " + simCards +
                ", CPU ='" + CPU + '\'' +
                ", Итоговая цена ='" + endPrice + '\'' +
                '}';
    }
}
