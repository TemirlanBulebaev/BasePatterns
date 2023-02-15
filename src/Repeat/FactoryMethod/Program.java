package Repeat.FactoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("c++");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String specialty) {
        if (specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + "is unknown speciality.");
        }
    }
}
