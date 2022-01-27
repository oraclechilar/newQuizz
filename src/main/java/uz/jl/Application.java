package uz.jl;

import uz.jl.configs.ApplicationContextHolder;
import uz.jl.ui.AuthUI;
import uz.jl.ui.Menu;
import uz.jl.utils.Input;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("org.mongodb.driver");
        logger.setLevel(Level.SEVERE);
        Menu.getMenu();
        run();
    }

    private static void run() {
        AuthUI authUI = ApplicationContextHolder.getBean(AuthUI.class);
        String choice = Input.getStr("Enter your choice: ").toUpperCase(Locale.ROOT);
        switch (choice) {
            case "REGISTER" -> authUI.register();
            case "LOGIN" -> authUI.login();
            case "LOGOUT" -> authUI.logout();
        }
        run();
    }
}
