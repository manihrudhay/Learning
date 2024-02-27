package designpatterns.behavioral.state;

class GreenSignalState implements TrafficSignalState {
    @Override
    public void display() {
        System.out.println("Green Signal - Go!");
    }

    @Override
    public void nextState(TrafficSignalContext context) {
        System.out.println("Switching to Yellow Signal");
        context.setCurrentState(new YellowSignalState());
    }
}
