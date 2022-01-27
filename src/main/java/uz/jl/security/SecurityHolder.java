package uz.jl.security;

import lombok.Setter;
import uz.jl.utils.Print;

/**
 * @author Bakhromjon Wed, 5:27 PM 1/26/2022
 */
@Setter
public class SecurityHolder {
    public static Session session;

    public static void setSession(Session sessiona) {
        session = sessiona;
    }

    public static void killSession() {
        if (session != null) {
            session = null;
            Print.println("Logged out!");
        }
    }
}
