package Models;

public class Marca {
    private int id;
    private String nombre;
    private String logo;

    public Marca(int id, String nombre, String logo) {
        this.id = id;
        this.nombre = nombre;
        this.logo = logo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLogo() {
        return logo;
    }
    
}
