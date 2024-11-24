package Singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void classLog(Object obj, String info) {
    String className = obj.getClass().getName();
    String currentDate = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
    System.out.println(className + " " + currentDate + " - " + info);

    }
}


