package uz.jl.security;

/**
 * @author Bakhromjon Wed, 5:27 PM 1/26/2022
 */
public class SecurityHolder {
    private Session session;

    public void setSession(Session session) {
        this.session = session;
    }

    public void killSession() {
        this.session = null;
    }
}
