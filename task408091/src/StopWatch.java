import java.util.Random;

public class StopWatch {
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    public void Start() {
        this.startTime = System.currentTimeMillis();
        running = true;

    }

    public void Stop() {
        this.stopTime = System.currentTimeMillis();
        System.out.println(this.stopTime);
        System.out.println(this.startTime);
        running = false;
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (stopTime - startTime);

        }
        return (elapsed);
    }

    public long getElapsedTimeSecs() {
        long elapsed;
        if (running) {
            elapsed = ((System.currentTimeMillis() - startTime) / 1000);
        } else {
            elapsed = ((stopTime - startTime) / 1000);
        }
        return elapsed;
    }

    public static int[] Random(int count) {
        int[] arr = new int[count];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100000);
        }
        return arr;
    }
}
