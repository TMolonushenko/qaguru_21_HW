package config;

import org.aeonbits.owner.ConfigFactory;

public class Credentials {

    public static AuthConfig authConfig = ConfigFactory.create(AuthConfig.class, System.getProperties());

    public static String getUser() {
        return authConfig.user();
    }

    public static String getPassword() {
        return authConfig.password();
    }

    public static  String getApp() {
        return authConfig.app();
    }

    public static String getUrl() {
        return authConfig.url();
    }
}
