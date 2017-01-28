package cz.ejstn.learnlanguageapp.model;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Slovicko {

    private String cestina;
    private String anglictina;
    private int idObrazku;

    private static final int nemaObrazek = -1;

    public Slovicko (String anglictina, String cestina) {
        this.cestina = cestina;
        this.anglictina = anglictina;
        this.idObrazku = nemaObrazek;
    }

    public Slovicko (String anglictina, String cestina, int idObrazku) {
        this.cestina = cestina;
        this.anglictina = anglictina;
        this.idObrazku = idObrazku;
    }

    public String getAnglictina() {
        return anglictina;
    }

    public String getCestina() {
        return cestina;
    }

    public int getIdObrazku() {
        return idObrazku;
    }

    public boolean maObrazek() {
        return idObrazku != nemaObrazek;
    }
}
