package WithSynchronizedKeyword;

public class Synchron {
    public static void main(String[] args) {
        First f = new First();
        Second s1 = new Second(f,"Yash");
        Second s2 = new Second(f,"Sanjay");
        Second s3 = new Second(f,"Patil");

    }
}
