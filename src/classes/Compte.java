package classes;

public class Compte {
    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }
    public Compte() {}

    int code;
    double solde ;

}

