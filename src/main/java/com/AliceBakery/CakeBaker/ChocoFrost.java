package com.AliceBakery.CakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Flavor", havingValue = "chocolate")
public class ChocoFrost implements Frosting{
    @Override
    public String getFrostingType() {
        return "Chocolate";
    }
}
