package singletonMultiton;

import java.util.HashMap;
import java.util.Map;

public class CorConfig {
    private static Map<String, CorConfig> instances = new HashMap<>();
    private String corName;

    private CorConfig(String corName) {
        this.corName = corName;
    }

    public static CorConfig getInstance(String corName) {
        if (!instances.containsKey(corName)) {
            instances.put(corName, new CorConfig(corName));
        }
        return instances.get(corName);
    }

    public void showCor() {
        System.out.println("Cor configurada: " + corName);
    }
}
