package WithoutSynchronization;

public class Synchron {
    public static void main(String[] args) {
        First f = new First();
        Second s = new Second("Yash",f);
        Second s1= new Second("Sanjay", f);
        Second s2 = new Second("Patil", f);


    }
}
