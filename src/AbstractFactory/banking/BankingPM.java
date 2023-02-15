package AbstractFactory.banking;

import AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
