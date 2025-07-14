package collection_series.list;

import java.util.Arrays;
import java.util.List;

import collection_series.interface_folder.BankingInterface;
import collection_series.interface_folder.UPiInterface;

public class PhonePe implements UPiInterface, BankingInterface {

    List<Integer> totalAmt;

    public PhonePe() {

        this.totalAmt = Arrays.asList(120, 40, 56, 2345, 90, 56, 12, 8, 87, 34);
    }

    @Override
    public Integer checkbalance(int id) {

        Integer amount = totalAmt.stream().reduce(0, (a, b) -> a + b);

        return amount;
    }

    public Integer maxAmount(){

        Integer max= totalAmt.stream().reduce(Integer.MIN_VALUE, Integer::max );

        return max;
    }

}
