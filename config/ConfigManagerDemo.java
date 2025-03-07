package config;

public class ConfigManagerDemo {
    public static void main(String[] args) {
        //singleton instance
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();

        //retrieve and print each config values individually
        System.out.println("individual config values:");
        System.out.println("max players: " + configurationManager.getConfig("maxPlayers"));
        System.out.println("default language: " + configurationManager.getConfig("defaultLanguage"));
        System.out.println("game difficulty: " + configurationManager.getConfig("gameDifficulty"));

        System.out.println();

        //print all config
        System.out.println("all config:");
        configurationManager.printAllConfig();
    }
}
