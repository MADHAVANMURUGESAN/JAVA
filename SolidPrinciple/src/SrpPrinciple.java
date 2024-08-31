class User {
    private String name;
    private String message;

    User(String name, String message) {
        this.name = name;
        this.message = message;
    }
    public String getName(){
        return  this.name;
    }
    public String getMessage(){
        return this.message;
    }
}
class UserRepository{
    public void saveUser(User user){
        System.out.println("user: "+user.getName()+" message: "+user.getMessage());
    }
}
class EmailService {
    public void sendMail(User user, String msg){
        System.out.println("user: "+user.getName()+" message: "+user.getMessage()+" msg: "+msg);
    }
}
public class SrpPrinciple {
    public static void main(String[] args) {
        User user = new User("Nithish","Are you there?..");

        UserRepository userRepo = new UserRepository();
        userRepo.saveUser(user);

        EmailService emailService = new EmailService();
        emailService.sendMail(user,"completed");
    }
}
