package ch.heigvd.res.chill.domain.scout407;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;


public class Blackwater implements IProduct {
    public final static String NAME = "Blackwater";
    public final static BigDecimal PRICE = new BigDecimal(50.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }

}
