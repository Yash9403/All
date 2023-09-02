package SyncronizedBlock;

public class Synchron {
    public static void main(String[] args) {
        First f = new First();
        Second s1 = new Second("Yash",f);
        Second s2 = new Second("Sanjay", f);
        Second s3 = new Second("Patil",f);
    }
}
