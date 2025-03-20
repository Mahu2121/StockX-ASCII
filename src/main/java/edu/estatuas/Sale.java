package edu.estatuas;

public class Sale implements Offer{
    private String size;
    private Integer price;

    Sale (String size, Integer price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public int value() {
        return price;
    }
}
