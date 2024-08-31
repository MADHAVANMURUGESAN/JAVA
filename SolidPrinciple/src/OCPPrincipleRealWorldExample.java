import java.util.ArrayList;
import java.util.List;

interface Notification {
    public void send(String message);
}

class EmailNotification implements Notification {
    @Override
    public void send(String emailMessage) {
        System.out.println("emailMessage: " + emailMessage);
    }
}

class SmsNotification implements Notification {

    @Override
    public void send(String smsMessage) {
        System.out.println("smsMessage: " + smsMessage);
    }
}

class NotificationService {
    public List<Notification> notifications;

    NotificationService() {
        this.notifications = new ArrayList<>();
    }

    public void setTypeOfNotification(Notification notification) {
      notifications.add(notification);
    }
    public void sendAll(String msg){
        for (Notification notification:notifications){
            notification.send(msg);
        }
    }
}

public class OCPPrincipleRealWorldExample {
    public static void main(String[] args) {
      NotificationService notificationService = new NotificationService();
      notificationService.setTypeOfNotification(new SmsNotification());
      notificationService.setTypeOfNotification(new EmailNotification());
      notificationService.sendAll("Acc: 1213***, Debited Rs.500.00");
    }
}
