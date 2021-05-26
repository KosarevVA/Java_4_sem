package Pr6.abstractFactory.enterprise;

import Pr6.abstractFactory.SoftwareDeveloper;

public class EnterpriseSoftwareDeveloper implements SoftwareDeveloper {
    @Override
    public void develop() {
        System.out.println("SD works on enterprise project");
    }
}