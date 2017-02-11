package cz.ejstn.learnlanguageapp.model;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Slovicko {

    private String cestina;
    private String anglictina;
    private int idObrazku;
    private int idZvuku;

    private static final int nemaObrazek = -1;

    public Slovicko(String anglictina, String cestina, int idZvuku) {
        this.cestina = cestina;
        this.anglictina = anglictina;
        this.idObrazku = nemaObrazek;
        this.idZvuku = idZvuku;
    }

    public Slovicko(String anglictina, String cestina, int idObrazku, int idZvuku) {
        this.cestina = cestina;
        this.anglictina = anglictina;
        this.idObrazku = idObrazku;
        this.idZvuku = idZvuku;
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

    public int getIdZvuku() {
        return idZvuku;
    }

    public boolean maObrazek() {
        return idObrazku != nemaObrazek;
    }


    public boolean equalsPodleAnglictiny(Slovicko porovnavaneSlovicko) {
        if (this.getAnglictina().equals(porovnavaneSlovicko.getAnglictina())) {
            return true;
        } else {
            return false;
        }


    }

    public boolean equalsPodleAnglictinyACestiny(Slovicko porovnavaneSlovicko) {
        if (this.getAnglictina().equals(porovnavaneSlovicko.getAnglictina())
                && this.getCestina().equals(porovnavaneSlovicko.getCestina())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equalsPodleAnglictinyCestinyAZvuku(Slovicko porovnavaneSlovicko) {
        if (this.getAnglictina().equals(porovnavaneSlovicko.getCestina())
                && this.getCestina().equals(porovnavaneSlovicko.getCestina())
                && this.getIdZvuku() == porovnavaneSlovicko.getIdZvuku()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Slovicko{" +
                "anglictina='" + anglictina + '\'' +
                ", cestina='" + cestina + '\'' +
                ", idObrazku=" + idObrazku +
                ", idZvuku=" + idZvuku +
                '}';
    }
}
