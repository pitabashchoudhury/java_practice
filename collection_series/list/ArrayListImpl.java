package collection_series.list;

import collection_series.interface_folder.BankingInterface;

abstract class Vechile {

    int wheel;
    String country;

    public Vechile(int wheel, String country) {
        this.wheel = wheel;
        this.country = country;
    }

    public abstract void getName();

    public int getWheel() {

        return this.wheel;
    }
}

public class ArrayListImpl extends Vechile {

    ArrayListImpl() {
        super(12, "truck Z");
    }

    public static void main(String args[]) {
        Vechile vh = new ArrayListImpl();
        vh.getName();

        PhonePe paytmInterface = new PhonePe();

        Integer balance = paytmInterface.checkbalance(2);

        System.out.println(balance);
        System.out.println(paytmInterface.maxAmount());
    }

    @Override
    public void getName() {
        System.out.println(country);
    }
}
