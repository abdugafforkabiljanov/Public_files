package Masala3;
//1
public class Users {
    private String name;
    private String gmail;
    private int phoneNumber;
    private int passportId;

    public Users(String name, String gmail, int phoneNumber , int passportId) {
        this.name = name;
        this.gmail = gmail;
        this.phoneNumber = phoneNumber;
        this.passportId = passportId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public int getPassportId() {
        return passportId;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", gmail='" + gmail + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", passportId=" + passportId +
                '}';
    }
}
