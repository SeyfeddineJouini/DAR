package tp3.airport;

public class Plane implements Runnable{

    private final int id;
    private final ControlTower controlTower;

    public Plane(int id, ControlTower controlTower) {
        this.id = id;
        this.controlTower = controlTower;
    }

    @Override
    public void run() {
        controlTower.requestRunway(this);
        land();
        controlTower.freeRunway(this);
    }

    void land(){
        System.out.println(this + " is landing");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id='" + id + '\'' +
                '}';
    }
}
