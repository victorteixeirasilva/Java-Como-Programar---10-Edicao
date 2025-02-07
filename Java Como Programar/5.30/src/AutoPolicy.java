/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class AutoPolicy {
    private int accountNumber; // Número da conta da apólice
    private String makeAndModel; // Carro ao qual a apólice é aplicada
    private String state; // Abreviatura do estado com duas letras

    // construtor
    public AutoPolicy (int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        setState(state);
    }

    // Define o accountNumber
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    // Retorna o accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // Configura o makeAndModel
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    // Retorna o makeAndModel
    public String getMakeAndModel() {
        return makeAndModel;
    }

    // Define o estado
    public void setState(String state) {
        if (
            state == "CT" ||
            state == "MA" ||
            state == "ME" ||
            state == "NH" ||
            state == "NJ" ||
            state == "NY" ||
            state == "PA" ||
            state == "VT"
        ) {
            this.state = state;
        } else {
            System.out.println("ERROR!");
        }
    }

    // Retorna o estado
    public String getState() {
        return state;
    }

    // Método predicado é retornado se o estado tem seguros "sem culpa"
    public boolean inNoFaultState() {
        boolean noFaultState;

        // Determina se o estado tem seguros de automóvel "sem culpa"
        switch (getState()) { // Obtém a abreviatura do estado do objeto AutoPolicy
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;

        }
        return noFaultState;
    }
}
