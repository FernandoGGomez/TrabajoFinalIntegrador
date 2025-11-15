package Models;

public class Categoria {
    private int id;
    private String nombre;
    private String descripcion;

    public Categoria(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
   /*    public Categoria getCategoriaPorId(int idCategoria){
            como traigo la categoria de la DB?
            Categoria categoriaEncontrada = 
            return categoriaEncontrada;
    }*/
    
}