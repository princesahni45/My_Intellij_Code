package Student_Spring_1;

public class Address_POJO {

    private int rollno;
    private String Name;
    private String address;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + Name);
        System.out.println("Address: " + address);
    }
}