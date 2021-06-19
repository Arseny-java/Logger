import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance = null;
    protected int num = 1;
    protected Date date = new Date();
    protected SimpleDateFormat currentTime = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + currentTime.format(date) + " " + msg);
    }

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }
}


