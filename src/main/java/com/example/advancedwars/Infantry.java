package com.example.advancedwars;

public class Infantry extends Troop{
    public Infantry(int _team, int _xpos, int _ypos) {
        super(_team, _xpos, _ypos);
    }

    public String getTroopImg() {
        return "/images/troops/infantry" + this.team + ".png";
    }
}
