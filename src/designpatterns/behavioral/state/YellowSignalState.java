package designpatterns.behavioral.state;

// Concrete State 3: YellowSignalState
class YellowSignalState implements TrafficSignalState {
    @Override
    public void display() {
        System.out.println("Yellow Signal - Prepare to Stop!");
    }

    @Override
    public void nextState(TrafficSignalContext context) {
        System.out.println("Switching to Red Signal");
        context.setCurrentState(new RedSignalState());
    }
}
