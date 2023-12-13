import java.util.HashMap;
import java.util.Map;

public class EventTracker implements Tracker {

    private static EventTracker INSTANCE = new EventTracker();

    private Map<String, Integer> tracker;

    private EventTracker() {
        this.tracker = new HashMap<>();
    }

    synchronized public static EventTracker getInstance() {
        return null;
    }

    @Override
    public Map<String, Integer> tracker() {
        return this.tracker;
    }

    synchronized public void push(String message) {
    }

    synchronized public Boolean has(String message) {
        return null;
    }

    synchronized public void handle(String message, EventHandler e) {
    }

    // Do not use this. This constructor is for tests only
    // Using it breaks the singleton class
    EventTracker(Map<String, Integer> tracker) {
        this.tracker = tracker;
    }
}
