public class DogDoorSimulator {

  public static void main(String[] args) {
      Door door = new Door();
      door.setAllowedBark(new Bark("Woof"));
      BarkRecognizer barkRecognizer = new BarkRecognizer(door);
      Remote remote = new Remote(door);

      // Simulate the hardware hearing a bark
      System.out.println("Bruce starts barking.");
      barkRecognizer.recognize(new Bark("Woof"));

      System.out.println("\nBruce has gone outside...");

      try {
          Thread.currentThread().sleep(10000);
      } catch (InterruptedException e) { }

      System.out.println("\nBruce all done...");
      System.out.println("...but he's stuck outside!");

      // Simulate the hardware hearing a bark (not Bruce!)
      System.out.println("A small dog starts barking.");
      barkRecognizer.recognize(new Bark("Yip"));

      try {
          Thread.currentThread().sleep(5000);
      } catch (InterruptedException e) { }

      // Simulate the hardware hearing a bark again
      System.out.println("\nBruce starts barking.");
      barkRecognizer.recognize(new Bark("Woof"));

      System.out.println("\nBruce's back inside...");
  }
}
