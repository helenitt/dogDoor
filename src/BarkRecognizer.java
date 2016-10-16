/**
 * Created by Helen on 14/10/2016.
 */
public class BarkRecognizer {
    private Door door;

    public BarkRecognizer(Door door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("BarkRecognizer: Heard a '" + bark.getSound() + "'");
        if(door.getAllowedBark().equals(bark)) {
            door.open();
        }
        else
            System.out.println("This dog is not allowed.");
    }
}