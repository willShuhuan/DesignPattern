package com.dsh.designpattern.builder.improve;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class House {
    private String basic;
    private String wall;
    private String rooft;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRooft() {
        return rooft;
    }

    public void setRooft(String rooft) {
        this.rooft = rooft;
    }

    @Override
    public String toString() {
        return "House{" +
                "basic='" + basic + '\'' +
                ", wall='" + wall + '\'' +
                ", rooft='" + rooft + '\'' +
                '}';
    }
}
