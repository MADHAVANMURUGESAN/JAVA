interface NotificationProvider {
    public void sendNotification(String message);
}

class EmailNotificationService implements NotificationProvider {

    @Override
    public void sendNotification(String message) {
        System.out.println("EmailNotification: " + message);
    }
}

class NotificationServices {
    private NotificationProvider notificationProvider;

    NotificationServices(NotificationProvider notificationProvider) {
        this.notificationProvider = notificationProvider;
    }

    public void notifyMessage(String message) {
        notificationProvider.sendNotification(message);
    }
}

public class DipPrinciple {
    public static void main(String[] args) {
        NotificationProvider emailNotificationService = new EmailNotificationService();
        NotificationServices notificationServices = new NotificationServices(emailNotificationService);
        notificationServices.notifyMessage("debited your amt:$50.00");
    }
}
