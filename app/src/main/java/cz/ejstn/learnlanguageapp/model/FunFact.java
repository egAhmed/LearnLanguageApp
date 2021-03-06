package cz.ejstn.learnlanguageapp.model;

/**
 * Created by Martin Soukup on 8.2.2017.
 */

public class FunFact {

    private String textFunFactAnglicky;
    private String textFunFactCesky;
    private int obrazekFunFact;

    public FunFact(int obrazekFunFact, String textFunFactAnglicky, String textFunFactCesky) {
        this.obrazekFunFact = obrazekFunFact;
        this.textFunFactAnglicky = textFunFactAnglicky;
        this.textFunFactCesky = textFunFactCesky;
    }

    public int getObrazekFunFact() {
        return obrazekFunFact;
    }

    public String getTextFunFactAnglicky() {
        return textFunFactAnglicky;
    }

    public String getTextFunFactCesky() {
        return textFunFactCesky;
    }

    @Override
    public String toString() {
        return "FunFact{" +
                "obrazekFunFact=" + obrazekFunFact +
                ", textFunFactAnglicky='" + textFunFactAnglicky + '\'' +
                ", textFunFactCesky='" + textFunFactCesky + '\'' +
                '}';
    }

    public boolean equalsPodleObrazkuAAnglictiny(FunFact porovnavny) {
        return this.getObrazekFunFact() == porovnavny.getObrazekFunFact()
                && this.getTextFunFactAnglicky().equals(porovnavny.getTextFunFactAnglicky());
    }
}
