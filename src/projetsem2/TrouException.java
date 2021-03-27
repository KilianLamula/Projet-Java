/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

/**
 *
 * @author lamul
 */
public class TrouException extends GrilleException {

    /**
     * Creates a new instance of <code>TrouException</code> without detail
     * message.
     */
    public TrouException() {
    }

    /**
     * Constructs an instance of <code>TrouException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TrouException(String msg) {
        super(msg);
    }
}
