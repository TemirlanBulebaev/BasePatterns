package AbstractFactory.website;

import AbstractFactory.Tester;
import AbstractFactory.banking.QATester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester tests webite...");
    }
}
