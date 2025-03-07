package chat;

//adapter to connect new interface with legacy system

public class ChatServiceAdapter implements ChatService {
    private final LegacyChatService legacyChatService;

    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }

    public void sendMessage(String message) {

        //converting request

        legacyChatService.sendLegacyMessage(message);
    }
}
