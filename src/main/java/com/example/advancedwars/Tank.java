package com.example.advancedwars;

public class Tank extends Troop{
    public Tank(int _team, int _xpos, int _ypos) {
        super(_team, _xpos, _ypos);
    }

    public String getTroopImg() {
        return "/images/troops/tank" + this.team + ".png";
    }
}
