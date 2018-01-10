package homework02;
import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {
    private static final Random RANDOM = new SecureRandom();
    public String passwordGenerator(int passwnum) {
        StringBuilder sb = new StringBuilder();
        String letters ="[a-z][A-Z][0-9][!%?]";

        String pw = "";
        for (int i=0; i<passwnum; i++)
        {
            int index = (int)(RANDOM.nextDouble()*letters.length());
            pw += letters.substring(index, index+1);
        }
        return pw;
    }
};

