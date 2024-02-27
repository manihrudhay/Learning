package designpatterns.behavioral.state;

// State interface
interface TrafficSignalState {
    void display();

    void nextState(TrafficSignalContext context);
}
