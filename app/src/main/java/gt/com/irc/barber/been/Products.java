package gt.com.irc.barber.been;

public class Products   {
    private String nombre;
    private double precio;
    private int image;
    private int tiempo;



    public Products() {
        super();
    }


    // constructor

    public Products(String nombre, double precio, int image, int tiempo) {
        this.nombre = nombre;
        this.precio = precio;
        this.image = image;
        this.tiempo = tiempo;
    }


    // getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }



}
