package config;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Map<String, String> config = new HashMap<>();

    private ConfigurationManager() {
        config.put("maxPlayers", "100");
        config.put("defaultLanguage", "en");
        config.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return config.getOrDefault(key, "not found");
    }

    public void printAllConfig() {
        for (Map.Entry<String, String> entry : config.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
