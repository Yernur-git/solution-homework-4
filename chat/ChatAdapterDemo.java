package chat;

public class ChatAdapterDemo {
    public static void main(String[] args) {

        //instance of legacy chat system
        LegacyChatService legacyChatService = new LegacyChatService();

        //wrapping up with adapter
        ChatService chatService = new ChatServiceAdapter(legacyChatService);

        //using modern interface to send message
        chatService.sendMessage("hello world");
    }
}
