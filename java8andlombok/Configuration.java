package java8andlombok;

import lombok.Value;

@Value
public class Configuration {
    String appName;
    String version;
    String environment;
}
