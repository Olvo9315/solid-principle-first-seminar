package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        ReportUser report = new ReportUser(user);
        report.report();
        SaveUser save = new SaveUser(user);
        save.save();
    }
}