class Singers {

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

    // Constructor 1 argument
    public Singers(String singerId) {
        this.singerId = singerId;
        this.singerName = "";
        this.singerAddress = "";
        this.dateOfBirth = "";
        this.numAlbumsPublished = 0;
    }

    // Constructor 2 arguments
    public Singers(String singerId, String singerName) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = "";
        this.dateOfBirth = "";
        this.numAlbumsPublished = 0;
    }

    // Constructor 3 arguments
    public Singers(String singerId, String singerName, String singerAddress) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = "";
        this.numAlbumsPublished = 0;
    }

    // Constructor 4 arguments
    public Singers(String singerId, String singerName, String singerAddress, String dateOfBirth) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numAlbumsPublished = 0;
    }

    // Constructor 5 arguments
    public Singers(String singerId, String singerName, String singerAddress, String dateOfBirth, int numAlbumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numAlbumsPublished = numAlbumsPublished;
    }

    public static void main(String[] args) {
        // Create a Singer object using no-argument constructor
        Singers singer1 = new Singers();

        // Default values
        System.out.println("");
        System.out.println("Default values:");
        System.out.println("ID: " + singer1.singerId);
        System.out.println("Name: " + singer1.singerName);
        System.out.println("Address: " + singer1.singerAddress);
        System.out.println("Date of Birth: " + singer1.dateOfBirth);
        System.out.println("Number of Albums Published: " + singer1.numAlbumsPublished);

        // modify
        singer1.singerId = "S001";
        singer1.singerName = "John Doe";
        singer1.singerAddress = "123 Music St.";
        singer1.dateOfBirth = "1990-01-01";
        singer1.numAlbumsPublished = 5;

        System.out.println("");
        System.out.println("Updated values:");
        System.out.println("ID: " + singer1.singerId);
        System.out.println("Name: " + singer1.singerName);
        System.out.println("Address: " + singer1.singerAddress);
        System.out.println("Date of Birth: " + singer1.dateOfBirth);
        System.out.println("Number of Albums Published: " + singer1.numAlbumsPublished);
    }
}
