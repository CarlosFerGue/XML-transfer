package Model;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

public class User {
    private int id;
    private String nombre;
    private int edad;

    public User() {
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElement
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
