package com.AliceBakery.CakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Flavor", havingValue = "strawberry")
public class StaFrost implements Frosting{
    @Override
    public String getFrostingType() {
        return "Strawberry";
    }
}
