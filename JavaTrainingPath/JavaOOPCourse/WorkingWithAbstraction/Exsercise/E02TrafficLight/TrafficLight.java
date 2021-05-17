package JavaOOPCourse.WorkingWithAbstraction.Exsercise.E02TrafficLight;

public class TrafficLight {

    private TrafficLightState state;


    public TrafficLight(TrafficLightState state) {
        this.state = state;

    }

    public TrafficLight(String state) {
        this(TrafficLightState.valueOf(state));
    }

    public void update() {
        switch (this.state) {
            case RED:
                this.state= TrafficLightState.GREEN;
                break;

            case GREEN:
                this.state = TrafficLightState.YELLOW;
                break;

            case YELLOW:
                this.state = TrafficLightState.RED;
                break;


        }
    }


    @Override
    public String toString() {
        return this.state.toString();
    }
}
