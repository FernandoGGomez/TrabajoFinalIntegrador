package Models;

public class Producto extends Base {

    private String nombre;
    private double precio;
    private double peso;
    private int idCategoria;
    private int idMarca;
    private int idCodigo;

    public Producto(String nombre, double precio, double peso, int idCategoria, int idMarca, int id, boolean eliminado, int idCodigo) {
        super(id, eliminado);
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.idCategoria = idCategoria;
        this.idMarca = idMarca;
        this.idCodigo = idCodigo;
    }
    
     public Producto(String nombre, double precio, double peso, int idCategoria, int idMarca, int idCodigo){
        super();
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.idCategoria = idCategoria;
        this.idMarca = idMarca;
        this.idCodigo = idCodigo;
    }
    
    public Producto(){
        super();
    }

    public int getIdCodigo() {
        return idCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }

    /*  
    public String getMarcaPorId(){
        return getMarcaPorId(idMarca);
    }
    
     public String getCategoriaPorId(){
        return getMarcaPorId(idMarca);
    }
     */
    @Override
    public String toString() {
        return "Producto{"
                + "id= " + getId()
                + ", nombre= '" + nombre + '\''
                + ", precio= $" + precio
                + ", peso= " + peso + 'g'
                + //", Categoria= " + getCategoriaPorId +
                //", Marca= "+ getMarca()+
                '}';
    }

}
