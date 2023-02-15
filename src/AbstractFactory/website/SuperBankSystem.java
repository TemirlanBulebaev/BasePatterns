package AbstractFactory.website;

import AbstractFactory.Developer;
import AbstractFactory.ProjectManager;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Tester;
import AbstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank sytem");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
