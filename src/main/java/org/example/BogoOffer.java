package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BogoOffer {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(10,20,45,50,45,60);
        List<Integer> payableItems = new ArrayList<>();
        List<Integer> discountedItems = new ArrayList<>();

        prices.sort(Comparator.reverseOrder());
        for(int i = 0; i< prices.size(); i++){
            if(i % 2 == 0){
                payableItems.add(prices.get(i));
            } else {
                discountedItems.add(prices.get(i));
            }
        }
        System.out.println("Payable Items: " + payableItems);
        System.out.println("Discounted Items: " + discountedItems);
    }
}
