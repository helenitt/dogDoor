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
}
