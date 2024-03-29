package Pr7.bridge;

import Pr7.bridge.computer.CyberLaptop;
import Pr7.bridge.computer.Laptop;
import Pr7.bridge.network.MobileData;
import Pr7.bridge.network.Network;
import Pr7.bridge.network.WiFi;

/**
 * Демонстрация работы паттерна "Мост"
 */
public class Demo {

    public static void main(String[] args) {
        testNetwork(new MobileData());
        testNetwork(new WiFi());
    }

    public static void testNetwork(Network network) {
        System.out.println("Test laptop:");
        Laptop laptop = new Laptop(network);
        laptop.launch();
        System.out.println(laptop);
        laptop.shutDown();
        System.out.println(laptop);
        System.out.println("-------------------------");

        System.out.println("Test cyber laptop:");
        CyberLaptop cyberLaptop = new CyberLaptop(network);
        cyberLaptop.launch();
        System.out.println(cyberLaptop);
        cyberLaptop.shutDown();
        System.out.println(cyberLaptop);
        cyberLaptop.makeConnectedPermanently();
        System.out.println(cyberLaptop);
        System.out.println("-------------------------");
    }
}
