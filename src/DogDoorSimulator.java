public class DogDoorSimulator {

  public static void main(String[] args) {
    Door door = new Door();
    Remote remote = new Remote(door);

    System.out.println("Fido barks to go outside...");
    door.toggleDoor();

    System.out.println("\nFido has gone outside...");
    door.toggleDoor();

    System.out.println("\nFido's all done...");
    door.toggleDoor();

    System.out.println("\nFido's back inside...");
    door.toggleDoor();
  }
}
