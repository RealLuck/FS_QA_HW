

import java.io.Serializable;

import java.util.HashMap;

import java.util.Map;



public class Dictionary implements Serializable {

    private Map<String, String> dictionary;

    public Dictionary() {

        dictionary = new HashMap<>();
    }


    public void addWord(String english, String russia) {

        dictionary.put(english, russia);
    }

    public Map<String, String> getDictionary() {

        return dictionary;
    }



}