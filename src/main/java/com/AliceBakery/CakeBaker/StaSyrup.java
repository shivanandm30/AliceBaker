package com.AliceBakery.CakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Flavor", havingValue = "strawberry")
public class StaSyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "Strawberry";
    }
}
