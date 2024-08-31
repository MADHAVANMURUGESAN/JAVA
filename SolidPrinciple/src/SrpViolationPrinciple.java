class UserViolence {
    private String name;
    private String message;

    UserViolence(String name, String message) {
        this.name = name;
        this.message = message;
    }
    public String getName(){
        return  this.name;
    }
    public String getMessage(){
        return this.message;
    }
    public void sentNotifyService(String msg){
        System.out.println("msg: "+msg);
    }
    public void user(UserViolence userViolence){
        System.out.println("getMessage: "+userViolence.getMessage()+" ,getName: "+userViolence.getName());
    }
}

public class SrpViolationPrinciple {
    public static void main(String[] args) {
    UserViolence userViolence=new UserViolence("Pradeep","how are you :)");
    userViolence.user(userViolence);
    userViolence.sentNotifyService("acknowledgement completed..");
    }
}
