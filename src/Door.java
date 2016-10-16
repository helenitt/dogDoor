import java.util.Timer;
import java.util.TimerTask;
/**
 * Created by Helen on 14/10/2016.
 */
public class Door {
    private boolean open;

    public Door() {
        this.open = false;
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void toggleDoor() {
        System.out.println("Pressing the remote control button...");
        if (isOpen()) {
            close();
        } else {
            open();
            coutdownTimer();
        }
    }

    public void coutdownTimer() {
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }
}
