package AbstractFactory.website;

import AbstractFactory.ProjectManager;

public class WebistePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebistePM manages webiste project...");
    }
}
