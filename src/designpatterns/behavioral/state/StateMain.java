package designpatterns.behavioral.state;

public class StateMain {
    public static void main(String[] args) {
        TrafficSignalContext trafficSignal = new TrafficSignalContext();

        // Display and switch signals
        trafficSignal.displaySignal();
        trafficSignal.switchToNextSignal();

        trafficSignal.displaySignal();
        trafficSignal.switchToNextSignal();

        trafficSignal.displaySignal();
        trafficSignal.switchToNextSignal();

        trafficSignal.displaySignal();
    }
}

