package com.cursochat.ws.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comunication {
    private String id;

    @JsonProperty("player") // Mapeia o campo "player" do JSON para a classe Player
    private Player player = new Player();

    @JsonProperty("monster")
    private Monsters monster = new Monsters();

    @JsonProperty("dtHour") // Mapeia o campo "dtHour" do JSON
    private String dtHour;

    @JsonProperty("ip") // Mapeia o campo "ip" do JSON
    private String ip;

    @JsonProperty("action") // Mapeia o campo "action" do JSON
    private String action;

    @JsonProperty("color") // Mapeia o campo "positionY" do JSON
    private String color;

    private String[][] map; // Altere para aceitar um mapa de Strings

    public String[][] getMap() {
        return map;
    }

    public void setMap(String[][] map) {
        this.map = map;
    }

    public Comunication() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    // Getters e Setters
    public Player getPlayer() {
        return player;
    }

    public Monsters getMonster() {
        return monster;
    }

    public void setMonster(Monsters monster) {
        this.monster = monster;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getDtHour() {
        return dtHour;
    }

    public void setDtHour(String dtHour) {
        this.dtHour = dtHour;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}