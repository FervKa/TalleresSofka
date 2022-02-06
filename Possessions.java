/**
 * Esta clase abstrae aspectos que todas las posesiones que las personas tienen y las convierte en código.
 * @author Stiven Suárez Marín. (FervKa)
 */

/**
 * Estas son las importaciones correspondientes para el correcto funcionamiento de la clase.
 */



/**

 * Esta importación se utiliza para atrapar los errores al hacer un Parseo.
 */
import java.text.ParseException;

/**
 * Esta importación se utiliza para darle un formato específico a una fecha deseada.
 */
import java.text.SimpleDateFormat;

/**
 * Esta importación se utiliza para traer información de tipo fecha.
 */
import java.util.Date;




/**
 * Comienza la clase Possessions, que se refiere a atributos de las posesiones que las personas tienen, tales como:
 * - Casa.
 * - Carro.
 * - Propiedades Raíz.
 * Y los respectivos atributos que estos pueden tener, tales como:
 *
 * - Color.
 * - Fecha de Pago.
 * - Método de Pago.
 */
public class Possessions {

    /**
     * En esta parte se encuentran las variables que serán usadas para 
     */

    /**
     *
     */
    public String type;
    public String color;
    private String dateOfPurchase;
    private String paymentMethod;


    public Possessions(String type, String color, String dateOfPurchase, String paymentMethod) {
        this.type = type;
        this.color = color;
        this.dateOfPurchase = dateOfPurchase;
        this.paymentMethod = paymentMethod;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date dateOfPurchase1 = format.parse(dateOfPurchase);
        String dateOfPurchaseParsed = dateOfPurchase1.toString();
        this.dateOfPurchase = dateOfPurchaseParsed;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
