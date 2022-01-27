package uz.jl.security;

import lombok.Setter;

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
        session = null;
    }
}
