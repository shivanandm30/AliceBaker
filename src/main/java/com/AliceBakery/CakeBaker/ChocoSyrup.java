package com.AliceBakery.CakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Flavor", havingValue = "chocolate")
public class ChocoSyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "Chocolate";
    }
}
