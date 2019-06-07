package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Issue {

    public String url;

    public int id;

    public int number;

    public String title;

    public String body;

    public boolean locked;

    public Issue() {

    }


    public int getId(int id){

        this.id = id;

        return id;

    }


    public Issue(String url, int id,  int number, String title, String body, boolean locked) {

        this.id = id;

        this.url = url;

        this.number = number;

        this.title = title;

        this.body = body;

        this.locked = locked;

    }

    @Override
    public String toString() {

        return Integer.toString(id);

    }

}
