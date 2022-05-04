package config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:auth.properties"
})
public interface AuthConfig extends Config {
    @Key("user")
    String user();

    @Key("password")
    String password();

    @Key("app")
    String app();

    @Key("url")
    String url();

}
