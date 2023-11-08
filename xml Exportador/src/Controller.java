import model.ArticulosDAO;
import model.DireccionesDAO;
import model.ParticularesDAO;
import model.TicketsDAO;

public class Controller {
    public static void ejecutar(String tabla, String action){
        switch (tabla){
            case "ARTICULOS":
                new ArticulosDAO().ejecutar(action);
                break;
            case "PARTICULARES":
                new ParticularesDAO().ejecutar(action);
                break;
            case "TICKETS":
                new TicketsDAO().ejecutar(action);
                break;
            case "DIRECCIONES":
                new DireccionesDAO().ejecutar(action);
                break;
        }
    }
}
