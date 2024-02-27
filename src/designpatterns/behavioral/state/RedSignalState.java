package designpatterns.behavioral.state;

class RedSignalState implements TrafficSignalState {
    @Override
    public void display() {
        System.out.println("Red Signal - Stop!");
    }

    @Override
    public void nextState(TrafficSignalContext context) {
        System.out.println("Switching to Green Signal");
        context.setCurrentState(new GreenSignalState());
    }
}
