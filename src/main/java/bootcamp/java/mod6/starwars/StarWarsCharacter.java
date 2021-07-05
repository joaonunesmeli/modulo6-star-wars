package bootcamp.java.mod6.starwars;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StarWarsCharacter {
    private String name;
    private String height;
    private String mass;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private String birthYear;
    private String gender;
    private String homeWorld;
    private String species;

    public StarWarsCharacter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    @JsonProperty("hair_color")
    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @JsonProperty("skin_color")
    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    @JsonProperty("eye_color")
    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @JsonProperty("birth_year")
    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("homeworld")
    public String getHomeWorld() {
        return homeWorld;
    }

    public void setHomeWorld(String homeWorld) {
        this.homeWorld = homeWorld;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
