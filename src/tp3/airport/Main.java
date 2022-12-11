package tp3.airport;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower();
        IntStream.range(0, 5)
                .forEach(i -> {
                    Plane plane = new Plane(i,controlTower);
                    new Thread(plane).start();
                }
        );
    }
}
