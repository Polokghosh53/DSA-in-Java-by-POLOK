package com.company;

public class Stream {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bacappcdah"));
    }

    static void skip(String processed, String unprocessed){
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);

        if(ch == 'a'){
            skip(processed, unprocessed.substring(1));
        } else{
            skip(processed + ch, unprocessed.substring(1));
        }
    }
    // returning a string in itself
    static String skip(String unprocessed){
        if(unprocessed.isEmpty()) {
            return "";
        }
        char ch = unprocessed.charAt(0);

        if (ch == 'a'){
            return skip(unprocessed.substring(1));
        } else{
            return ch + skip(unprocessed.substring(1));
        }
    }
    // skip a string named apple
    static String skipApple(String unprocessed){
        if(unprocessed.isEmpty()) {
            return "";
        }

        if (unprocessed.startsWith("apple")){
            return skipApple(unprocessed.substring(5));
        } else{
            return unprocessed.charAt(0) + skipApple(unprocessed.substring(1));
        }
    }

    static String skipAppNotApple(String unprocessed){
        if(unprocessed.isEmpty()) {
            return "";
        }

        if (unprocessed.startsWith("app") && !unprocessed.startsWith("apple")){
            return skipAppNotApple(unprocessed.substring(5));
        } else{
            return unprocessed.charAt(0) + skipAppNotApple(unprocessed.substring(1));
        }
    }
}
