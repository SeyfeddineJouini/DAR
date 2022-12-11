package tp3.airport;

public class ControlTower {

    private boolean isRunwayAvailable;

    public ControlTower() {
        this.isRunwayAvailable = true;
    }

    synchronized void requestRunway(Plane plane){
        while(!isRunwayAvailable){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(plane + " requested runway");
        isRunwayAvailable = false;
        notify();
    }

    synchronized void freeRunway(Plane plane){
        while(isRunwayAvailable){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(plane + " freed runway");
        isRunwayAvailable = true;
        notify();
    }
}
