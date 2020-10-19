package introduction;

import org.apache.log4j.Logger;

public class HelloWorld {
    static Logger log = Logger.getLogger("myLogger");

    public static void main(String [ ] args) {
        log.info("Hello");
    }
}