package config;

public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();


        System.out.println("individual config values:");
        System.out.println("max players: " + configurationManager.getConfig("maxPlayers"));
        System.out.println("default language: " + configurationManager.getConfig("defaultLanguage"));
        System.out.println("game difficulty: " + configurationManager.getConfig("gameDifficulty"));

        System.out.println();

        System.out.println("all config:");
        configurationManager.printAllConfig();
    }
}
