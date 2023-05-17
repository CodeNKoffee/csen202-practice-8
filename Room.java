public class Room {
  private int roomNumber, daysRented, numberOfBeds;
  private String guestName;
  private double rate;

  public Room(
    String guestName, int roomNumber, int numberOfBeds, double rate, int daysRented
  ) {
    this.guestName = guestName;
    this.roomNumber = roomNumber;
    this.numberOfBeds = numberOfBeds;
    this.rate = rate;
    this.daysRented = daysRented;
  }

  public double calculateTotal() {
    return rate * daysRented;
  }

  public void addBed() {
    if (numberOfBeds < 2) {
      numberOfBeds++;
      System.out.println("A bed has been added to room " + roomNumber);
    } else {
      System.out.println("The room already has the maximum number of beds.");
    }
  }

  @Override
  public String toString() {
    return "Guest name: " + guestName + "\n" +
            "Room number: " + roomNumber + "\n" +
            "Room beds: " + numberOfBeds + "\n" +
            "Rate: " + rate + "\n" +
            "Rented for: " + daysRented + " days";
  }

  public static void main(String[] args) {
    // Creating and testing Room objects
    Room room1 = new Room("Blake", 123, 1, 123.50, 5);
    System.out.println(room1.toString());
    System.out.println("Total rent: " + room1.calculateTotal());

    Room room2 = new Room("Emma", 456, 2, 200.0, 3);
    System.out.println(room2.toString());
    System.out.println("Total rent: " + room2.calculateTotal());

    room2.addBed();
    System.out.println(room2.toString());
  }
}
