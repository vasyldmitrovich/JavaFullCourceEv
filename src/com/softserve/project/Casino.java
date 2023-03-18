package com.softserve.project;

/**
 * Class Casino is the parent of all the following,
 * it contains the casinoName field and the main methods to work with it
 *
 * @author Marian Moh
 * @version 1.0  11 March 2023
 */

public class Casino implements Cloneable {
    private String casinoName;

    public Casino() {
        casinoName = "NewVegas";
    }

    public Casino(String casinoName) {
        this.casinoName = casinoName;
    }

    public String getCasinoName() {
        return casinoName;
    }

    public void setCasinoName(String casinoName) {
        this.casinoName = casinoName;
    }

    @Override
    public String toString() {
        return "Name of the casino: " + casinoName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Casino other = (Casino) obj;
        if (casinoName == null) {
            return other.casinoName == null;
        } else {
            return casinoName.equals(other.casinoName);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime * ((casinoName == null) ? 0 : casinoName.hashCode());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Casino cloneCasino = (Casino) super.clone();
        cloneCasino.setCasinoName(casinoName);
        return cloneCasino;
    }
}
