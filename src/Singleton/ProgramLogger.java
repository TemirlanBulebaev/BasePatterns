package Singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file. \n\n";

    public static synchronized ProgramLogger getProgramLogger(){ // если другой поток обратится к этому методу, то
        //другой поток подождет пока текущий закончит работу с ним
        if (programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger(){}

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}
