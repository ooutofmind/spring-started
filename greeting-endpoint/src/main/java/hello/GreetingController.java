package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Webservice body
 * Created by Vladimir on 29.10.2016.
 */
@RestController
public class GreetingController {
    private static final String TEMPLATE = "Hello, %s!";
    private static AtomicInteger counter = new AtomicInteger(0);

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(name = "message", defaultValue = "WORLD!") String message) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, message));
    }
}
