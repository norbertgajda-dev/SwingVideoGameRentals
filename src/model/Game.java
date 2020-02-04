package model;

import java.io.Serializable;

/**
 *
 * @author GAJDA NORBERT
 */
public class Game implements Serializable{
    
    private int id;
    private String name;
    private String genre;
    private String platform;
    private int members_id;
    private String rental_date;

    public Game() {
    }

    public Game(String name, String genre, String platform, int members_id, String rental_date) {
        this.name = name;
        this.genre = genre;
        this.platform = platform;
        this.members_id = members_id;
        this.rental_date = rental_date;
    }
    
    public Game(int id, String name, String genre, String platform, int members_id, String rental_date) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.platform = platform;
        this.members_id = members_id;
        this.rental_date = rental_date;
    }

    @Override
    public String toString() {
        return name;
    }
    
    

    public String getRental_date() {
        return rental_date;
    }

    public void setRental_date(String rental_date) {
        this.rental_date = rental_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getMembers_id() {
        return members_id;
    }

    public void setMembers_id(int members_id) {
        this.members_id = members_id;
    }
    
    
}
