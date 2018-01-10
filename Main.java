package homework02;

public class Main {

    public static void main(String[] args) {
	PasswordGenerator pgr=new PasswordGenerator();
        User user= new User();
        user.setPassword(pgr.passwordGenerator(6));
        System.out.print(user.getPassword());

    }
}
