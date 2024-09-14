class Singers {

    // Private instance variables
    private String singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int numAlbumsPublished;

    // No-argument constructor
    public Singers() {
        this.singerId = "";
        this.singerName = "";
        this.singerAddress = "";
        this.dateOfBirth = "";
        this.numAlbumsPublished = 0;
    }

    // Constructor with 1 argument
    public Singers(String singerId) {
        this.singerId = singerId;
        this.singerName = "";
        this.singerAddress = "";
        this.dateOfBirth = "";
        this.numAlbumsPublished = 0;
    }

    // Constructor with 2 arguments
    public Singers(String singerId, String singerName) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = "";
        this.dateOfBirth = "";
        this.numAlbumsPublished = 0;
    }

    // Constructor with 3 arguments
    public Singers(String singerId, String singerName, String singerAddress) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = "";
        this.numAlbumsPublished = 0;
    }

    // Constructor with 4 arguments
    public Singers(String singerId, String singerName, String singerAddress, String dateOfBirth) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numAlbumsPublished = 0;
    }

    // Constructor with 5 arguments
    public Singers(String singerId, String singerName, String singerAddress, String dateOfBirth, int numAlbumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numAlbumsPublished = numAlbumsPublished;
    }

    // Getters
    public String getSingerId() {
        return singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getSingerAddress() {
        return singerAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumAlbumsPublished() {
        return numAlbumsPublished;
    }

    // Setters
    public void setSingerId(String singerId) {
        this.singerId = singerId;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNumAlbumsPublished(int numAlbumsPublished) {
        this.numAlbumsPublished = numAlbumsPublished;
    }

    // Setter to set all values at once
    public void setSingerData(String singerId, String singerName, String singerAddress, String dateOfBirth, int numAlbumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numAlbumsPublished = numAlbumsPublished;
    }

    // Driver class to test the Singer class
    public static void main(String[] args) {
        // Creating a Singer object using no-argument constructor
        Singers singer1 = new Singers();

        // Display default values
        System.out.println("Default values:");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getNumAlbumsPublished());

        // Setting values using setters
        singer1.setSingerId("S543");
        singer1.setSingerName("Michael Jackson");
        singer1.setSingerAddress("45 Parking St.");
        singer1.setDateOfBirth("1988-04-15");
        singer1.setNumAlbumsPublished(5);

        // Display updated values
        System.out.println("\nUpdated values:");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getNumAlbumsPublished());
    }
}
