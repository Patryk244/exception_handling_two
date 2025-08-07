package com.kodilla.exception.nullpointer;

public class MessageSender {

    public void sendMessage(User user, String message){
        if (user != null){
            System.out.println("Message sent to user " + user.getName() + " with message: " + message);
        } else {
            throw new MessageNotSentException("Object User was null");
        }
    }
}
