package Assignments;
public class TestEncapsulation{
    public static void main(String[] args)
    {
         student s= new student();
         s.setname("ABD");
         s.setage(21);
         s.setemail("abd@gmail.com");
         s.setLocation("Banglore");
         System.out.println("studentname:" +s.getname());
         System.out.println("studentage:" +s.getage());
         System.out.println("studentemail:" +s.getemail());
         System.out.println("studentLocation:" +s.getLocation());
         Teacher t= new Teacher();
         t.setname("Lisa");
         t.setage(31);
         t.setemail("lisa@gmail.com");
         t.setLocation("Chennai");
         System.out.println("Teachername:" +t.getname());
         System.out.println("Teacherage:" +t.getage());
         System.out.println("Teacheremail:" +t.getemail());
         System.out.println("TeacherLocation:" +t.getLocation());
         Batch b= new Batch();
         b.setname("Github");
         b.setsize(5);
         System.out.println("Batchname:" +b.getname());
         System.out.println("Batchsize:" +b.getsize());
    }
}
class student {
    private String name;
    private int age;
    private String email;
    private String Location;
    public student()
    {
        System.out.println("student itself a constructor");
    }

    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getemail(){
        return email;
    }
    public String getLocation(){
        return Location;
    }
    public void setname(String newname){
           name=newname;
    }
    public void setage(int newage){
        age=newage;
    }
    public void setemail(String newemail){
        email=newemail;
    }
    public void setLocation(String newaddress){
        Location=newaddress;
    }
}
class Teacher {
    private String name;
    private int age;
    private String email;
    private String Location;
    public Teacher()
    {
        System.out.println("Teacher itself a constructor");
    }

    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getemail(){
        return email;
    }
    public String getLocation(){
        return Location;
    }
    public void setname(String newname){
           name=newname;
    }
    public void setage(int newage){
        age=newage;
    }
    public void setemail(String newemail){
        email=newemail;
    }
    public void setLocation(String newaddress){
        Location=newaddress;
    }
}
class Batch {
    private String name;
    private int size;
    public Batch()
    {
        System.out.println("Batch itself a constructor");
    }

    public String getname(){
        return name;
    }
    public int getsize(){
        return size;
    }
    public void setname(String newname){
           name=newname;
    }
    public void setsize(int newsize){
           size=newsize;
    }
}