package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    public NewYearDiscountService() {
        getDiscount();
    }

    @Override
    public double getDiscount() {
        return 20;
    }
}
