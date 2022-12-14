package company;


public record MobileAppListener(String username) implements Listener {

    @Override
    public void update(Event eventType) {
        // Enviar push notification para username
        System.out.println("Enviando push notification para o usu�rio " + username + " sobre " + eventType);
    }

}