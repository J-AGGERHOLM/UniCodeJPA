package org.example.unicodejpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Unicode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer unicode;
    private char letter;
    private String description;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnicode(char c) {
        int unicodeHolder = c;
        return unicodeHolder;
    }

    public void setUnicode(char c) {
        int unicodeHolder = c;
        this.unicode = unicodeHolder;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }





}
