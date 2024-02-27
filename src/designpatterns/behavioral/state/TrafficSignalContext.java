package designpatterns.behavioral.state;

// Context: TrafficSignalContext
class TrafficSignalContext {
    private TrafficSignalState currentState;

    public TrafficSignalContext() {
        // Initial state is Red Signal
        this.currentState = new RedSignalState();
    }

    public void setCurrentState(TrafficSignalState state) {
        this.currentState = state;
    }

    public void displaySignal() {
        currentState.display();
    }

    public void switchToNextSignal() {
        currentState.nextState(this);
    }
}
