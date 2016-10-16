/**
 * Created by Helen on 14/10/2016.
 */
public class BarkRecognizer {
    private Door door;

    private BarkRecognizer(Door door) {
        this.door = door;
    }
    public void recognize(String bark) {
        System.out.println("BarkRecognizer: Heard a '" +
                bark + "'");
        door.open();
    }
}