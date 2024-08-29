package app.Printer;

import app.Interface.Printer;

public class PrinterImpl implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        if (message.getSender() == null || message.getSender().isEmpty()) {
            if (message.getText() == null || message.getText().isEmpty()) {
                Printer emptyMessagePrinter = new Printer() {
                    @Override
                    public void print(Message msg) {
                        System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                    }
                };
                emptyMessagePrinter.print(message);
            } else {
                System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
            }
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }
}
