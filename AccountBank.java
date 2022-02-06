/**
 * Se declara la clase AccountBank (que se refiere a la cuenta de banco de la persona)
 */


public class AccountBank {

    /**
     * En este espacio se declaran las variables que serán usadas en la creación del Objeto AccountBank.
     * Es de tipo privada, para que sólo pueda ser accedida a ella desde los métodos accesores.
     */
    private int accountNumber;


    /**
     * Esta es la variable usada para reconocer si la cuenta de banco se encuentra o no activa.
     */
    protected boolean activated;


    /**
     * Este es el método constructor, usado para ayudar al usuario a crear la clase AccountBank.
     * Recibe dos parámetros que se reconocen como los datos de la cuenta y la actividad.
     *
     * @param accountNumber
     * @param activated
     */
    public AccountBank(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * Inician métodos Accesores.
     */


    /**
     * Retorna el valor almacenado en la variable, el cual corresponde al número de la cuenta de banco.
     * @return
     */
    public int getAccountNumber(){
        return accountNumber;
    }


    /**
     * Recibe un parámetro que será establecido en la variable como el dato a guardar.
     *
     * @param accountNumber: Número de cuenta.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Devuelve el valor de True o False dependiendo del estado de la cuenta.
     * La variable se usa para conocer si la cuenta está o no activa.
     *
     * @return
     */
    public boolean isActivated() {
        return activated;
    }


    /**
     * Recibe como parámetro la variable ingresada en la construcción del objeto.
     * @param activated: True o False, para reconocer si una cuenta está activd o no.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Terminan métodos accesores.
     */
}
