package edu.estatuas;

import java.util.List;

interface Item {
    int getBid();
    int getAsk();
    int getSale();
    void setBid(int bid);
    void setAsk(int ask);
    void setSale(int sale);
    void add(Offer offer);
    List<Offer> offers();
}
