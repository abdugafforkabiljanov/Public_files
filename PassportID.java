package Masala3;
//3
import java.util.ArrayList;
import java.util.List;

class PassportID implements Registrant {
//    String passportIdStr = String.valueOf(users.getPassportId());
//    int length = passportIdStr.length();
    private final List<Users> usersList = new ArrayList<>();
    @Override
    public void registration(Users users) {
        if(users.getGmail().endsWith("@gmail.com") && String.valueOf(users.getPassportId()).length()==6){
            usersList.add(users);
            System.out.println(users.getName() + " ro'yhatdan o'tkazildi");
        }
        else{
            System.out.println(users.getName() + " ro'yhatdan o'tkazilmadi");
        }
    }

    public List<Users> getUsersList() {
        return usersList;
    }
}
