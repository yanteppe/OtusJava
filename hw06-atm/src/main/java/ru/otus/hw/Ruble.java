package ru.otus.hw;

public class Ruble extends Banknote {

    public Ruble(int nominalValue) {
        super(nominalValue);
        super.setBanknoteType("Ruble");
    }

    @Override
    public void setBanknoteType(String banknoteType) {
        super.setBanknoteType(banknoteType);
    }

    @Override
    public String toString() {
        return "Banknote: " + super.getBanknoteType() + ", nominal = " + super.getNominalValue();
    }
}
