package com.lesleychang.chatapp;

/**
 * Created by lesleychang on 3/13/18.
 */

public class InstantMessage {

    private String message, author;

    InstantMessage(String m, String a) {
        this.message = m;
        this.author = a;
    }

    // Firebase requires no-argument constructor as well
    public InstantMessage() {

    }

    String getMessage() {
        return message;
    }

    String getAuthor() {
        return author;
    }
}
