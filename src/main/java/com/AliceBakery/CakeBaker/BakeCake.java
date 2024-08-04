package com.AliceBakery.CakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BakeCake {

    @Autowired
    Frosting fs;

    @Autowired
    Syrup sr;

    public void bekeCake(){
        System.out.println("Start");
        System.out.println(" Flavor : " + fs.getFrostingType());
        System.out.println(" Syrup : " + sr.getSyrupType());
    }

}
