package ro.mpp2025.domain;

public class Caz extends Entity<Long> {
    private String nume_caz;

    public Caz(String nume_caz) {
        this.nume_caz = nume_caz;
    }

    public String getNume_caz() {
        return nume_caz;
    }

    public void setNume_caz(String nume_caz) {
        this.nume_caz = nume_caz;
    }

    @Override
    public String toString() {
        return "Caz{" +
                "nume_caz='" + nume_caz + '\'' +
                '}';
    }
}
