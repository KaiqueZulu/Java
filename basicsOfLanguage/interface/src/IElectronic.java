
/*
 * Interfaces are known as "contracts"
 * An interface can contain:
 *       - Constants;
 *       - Abstract methods.
 */

/*
 * Interface for contract server for electronic products. Every electronic product that implements this interface MUST implement the abstracted methods.
 */

public interface IElectronic {
    public String BRAND = "Geek";

    public void on();

    public void off();
}
