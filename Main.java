package Masala3;
// 6
public class Main {
    public static void main(String[] args) {
        PassportID passportID = new PassportID();
        passportID.registration(new Users("Abdulaziz" , "abcd@gmail.com" , 1234 , 123456));
        passportID.registration(new Users("Abdug'affor" , "def@gmail.com" , 890 , 789012));
        passportID.registration(new Users("Aka" , "Aka@gmail.com" , 9864 , 123456));
        passportID.registration(new Users("Uka" , "Ukaa" , 789 , 902065));
        Checker checker = new Checker(passportID.getUsersList());
        checker.getUsers();
    }
}
