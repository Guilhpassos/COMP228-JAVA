class Singers {

    // Public instance variables
    public String singerId;
    public String singerName;
    public String singerAddress;
    public String dateOfBirth;
    public int numAlbumsPublished;

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

    // Driver class to test the Singers class
    public static void main(String[] args) {
        // Create a Singer object using no-argument constructor
        Singers singer1 = new Singers();

        // Display the default values
        System.out.println("");
        System.out.println("Default values:");
        System.out.println("ID: " + singer1.singerId);
        System.out.println("Name: " + singer1.singerName);
        System.out.println("Address: " + singer1.singerAddress);
        System.out.println("Date of Birth: " + singer1.dateOfBirth);
        System.out.println("Number of Albums Published: " + singer1.numAlbumsPublished);

        // Directly modify the public variables
        singer1.singerId = "S001";
        singer1.singerName = "John Doe";
        singer1.singerAddress = "123 Music St.";
        singer1.dateOfBirth = "1990-01-01";
        singer1.numAlbumsPublished = 5;

        // Display the updated values
        System.out.println("");
        System.out.println("Updated values:");
        System.out.println("ID: " + singer1.singerId);
        System.out.println("Name: " + singer1.singerName);
        System.out.println("Address: " + singer1.singerAddress);
        System.out.println("Date of Birth: " + singer1.dateOfBirth);
        System.out.println("Number of Albums Published: " + singer1.numAlbumsPublished);
    }
}
