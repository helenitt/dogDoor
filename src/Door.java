import java.util.Timer;
import java.util.TimerTask;
/**
 * Created by Helen on 14/10/2016.
 */
public class Door {
    private boolean open;
    private Bark allowedBark;
    private static final int TIMER_COUNT_DOWN = 5000;

    public Door() {
        this.open = false;
    }

    public void setAllowedBark(Bark bark) {
        this.allowedBark = bark;
    }

    public Bark getAllowedBark() {
        return allowedBark;
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
            coutDownTimer();
        }
    }

    public void coutDownTimer() {
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, TIMER_COUNT_DOWN);
    }
}
