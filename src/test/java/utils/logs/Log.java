package utils.logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Log {

    //Initialize Log4j instance
    public static final Logger logger = (Logger) LogManager.getLogger(Log.class);

    //Info Level Logs
    public static void info (String message) {
        logger.info(message);
    }

//    //Warn Level Logs
//    public static void warn (String message) {
//        logger.warn(message);
//    }
//
//    //Error Level Logs
//    public static void error (String message) {
//        logger.error(message);
//    }
//
//    //Fatal Level Logs
//    public static void fatal (String message) {
//        logger.fatal(message);
//    }
//
//    //Debug Level Logs
//    public static void debug (String message) {
//        logger.debug(message);
//    }
}
