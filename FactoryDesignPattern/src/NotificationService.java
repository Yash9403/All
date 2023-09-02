public class NotificationService {
    public static void main(String[] args) throws IllegalAccessException {
        NotificationFactory n = new NotificationFactory();
        Notification n1 = n.createNotification("SMS");
        n1.notifyUser();
    }
}
