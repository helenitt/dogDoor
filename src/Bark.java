/**
 * Created by Helen on 16/10/2016.
 */
public class Bark {
    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public boolean equals(Object barkIn) {
        if(barkIn instanceof Bark) {
            Bark otherBark = (Bark)barkIn;
            if(this.sound.equalsIgnoreCase(otherBark.sound)) {
                return true;
            }
        }
        return false;
    }
}
