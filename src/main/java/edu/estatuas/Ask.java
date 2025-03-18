package edu.estatuas;

public class Ask implements Offer{
    private String size;
    private Integer value;

    Ask(String size,Integer value) {
        this.size = size;
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getSize() {
        return size;
    }

}
