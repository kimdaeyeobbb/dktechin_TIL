package week08.day33.hw;

import org.springframework.stereotype.Component;

@Component("nightGreeting")
public class NightGreetingImpl implements Greeting {
    @Override
    public void greet() {
        System.out.println("안녕히 주무세요.");
    }
}
