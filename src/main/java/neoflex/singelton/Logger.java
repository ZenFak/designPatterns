package main.java.neoflex.singelton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger logger;

    private Logger() {
    }

    public static synchronized Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void classLog(Object obj, String info) {
        if (obj != null) {
            String className = obj.getClass().getSimpleName();
            String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yy"));
            System.out.println("Log info: " + currentDate + " - " + className + " - " + info);
        } else {
            String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yy"));
            System.out.println("Log info: " + currentDate + " - NullObject - " + info);
        }
    }

}
