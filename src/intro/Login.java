package intro;

import java.awt.*;

public class Login {
    public static void main(String[] args) {
        String user="user";
        int pass=2345;
        if(user=="user" && pass==2345){
            System.out.println("Login successful");
        }
        else
        {
            System.out.println("Login failed");
        }
    }
}
