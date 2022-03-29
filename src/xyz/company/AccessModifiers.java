package xyz.company;

 class Lesson{

    public String name;
    public String country;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    protected String password;
}

public class AccessModifiers {
    public static void main(String[] args) {

        Lesson l1= new Lesson();
        l1.setPassword("Ronaldo@30");
        System.out.println(l1.getPassword());

    }
}
