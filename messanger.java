package messenger;
interface MessagingService {
    void sendMessage(String message);
}

class SMSMessagingService implements MessagingService {
    
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
        
    }
}

class EmailMessagingService implements MessagingService {
    
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
      
    }
}

class WhatsAppMessagingService implements MessagingService {
    
    public void sendMessage(String message) {
        System.out.println("Sending WhatsApp message: " + message);
        
    }
}

public class Main {
    public static void main(String[] args) {
        MessagingService smsService = new SMSMessagingService();
        smsService.sendMessage(" SMS message");

        MessagingService emailService = new EmailMessagingService();
        emailService.sendMessage("email message");

        MessagingService whatsappService = new WhatsAppMessagingService();
        whatsappService.sendMessage("WhatsApp message");
    }
}
