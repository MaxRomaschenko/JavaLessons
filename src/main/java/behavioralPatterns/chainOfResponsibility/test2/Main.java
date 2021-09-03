package behavioralPatterns.chainOfResponsibility.test2;

public class Main {
    public static void main(String[] args) {
        Logger loggerError = new SMSLogger(Level.ERROR);
        Logger loggerInfo = new EmailLogger(Level.INFO);
        Logger loggerFile = new FileLogger(Level.DEBUG);

        loggerError.setNextLogger(loggerFile);
        loggerFile.setNextLogger(loggerInfo);
        loggerError.writeMessage("Всё хорошо",Level.INFO);
        loggerError.writeMessage("Всё плохо",Level.ERROR);
        loggerError.writeMessage("Обрабатываем",Level.DEBUG);


    }

}
