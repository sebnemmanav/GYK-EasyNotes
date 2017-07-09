package com.erenutku.easynotes.model;

/**
 * Created by sebnem on 08.07.2017.
 */

public class NoteModel {
    private String title;
    private String body;
    private String key;
    private boolean isFavorite;

    public NoteModel(){

    }

    public  NoteModel(String title,String body,Boolean isFavorite,String key){
        this.title = title;
        this.body = body;
        this.isFavorite = isFavorite;
        this.key = key;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
