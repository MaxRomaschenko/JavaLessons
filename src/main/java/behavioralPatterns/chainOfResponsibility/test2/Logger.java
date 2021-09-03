package behavioralPatterns.chainOfResponsibility.test2;

public abstract class Logger {
    private int priority;
    private Logger nextLogger;

    public Logger(int priority) {
        this.priority = priority;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void writeMessage(String message, int level) {
        if(level <= priority){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.writeMessage(message,level);
        }
    }

    public abstract void write(String message);

}
