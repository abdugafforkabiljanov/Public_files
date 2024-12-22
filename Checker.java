package Masala3;



import java.util.List;
// 5
class Checker implements EmailChecker {
    private final List<Users> users;

    Checker(List<Users> users) {
        this.users = users;
    }

    public List<Users> getUsers() {
        return users;
    }

    @Override
    public void checkEmail(String email) {
        for(Users users1: users){
            if(users1.getGmail().equals(email)){
                System.out.println(users1.getName() + " ro'yhatdan o'tkazilgan");
            }
            else{
                System.out.println(users1.getName() + " ro'yhatdan o'tkazilmagan");
            }
        }

    }
}
