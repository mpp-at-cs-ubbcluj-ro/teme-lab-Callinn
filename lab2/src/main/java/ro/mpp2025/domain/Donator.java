package ro.mpp2025.domain;

public class Donator extends Entity<Long> {
    private String nume;
    private String prenume;
    private String adresa;
    private Integer numarTelefon;

    public Donator(String nume, String prenume, String adresa, Integer numarTelefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
        this.numarTelefon = numarTelefon;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Integer getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(Integer numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    @Override
    public String toString() {
        return "Donatori{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", numarTelefon=" + numarTelefon +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Donator)) return false;
        Donator that = (Donator) o;
        return getNume().equals(that.getNume()) &&
                getPrenume().equals(that.getPrenume()) &&
                getAdresa().equals(that.getAdresa()) &&
                getNumarTelefon().equals(that.getNumarTelefon());
    }
}
