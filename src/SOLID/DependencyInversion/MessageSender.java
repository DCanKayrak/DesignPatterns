package SOLID.DependencyInversion;

public class MessageSender {
    public void sendEmail(String message) {
        EmailService emailService = new EmailService();
        emailService.sendMessage(message);
    }

    public void sendSMS(String message) {
        SMSService smsService = new SMSService();
        smsService.sendMessage(message);
    }
}

// Düşük seviyeli bileşen - E-posta gönderimi
class EmailService {
    public void sendMessage(String message) {
        System.out.println("E-posta gönderiliyor: " + message);
        // E-posta gönderme işlemleri
    }
}

// Düşük seviyeli bileşen - SMS gönderimi
class SMSService {
    public void sendMessage(String message) {
        System.out.println("SMS gönderiliyor: " + message);
        // SMS gönderme işlemleri
    }
}

// Kullanım
class Main {
    public static void main(String[] args) {
        MessageSender sender = new MessageSender();
        sender.sendEmail("Merhaba, bu bir e-posta");
        sender.sendSMS("Merhaba, bu bir SMS");
    }
}
