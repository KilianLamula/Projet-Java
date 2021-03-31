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
public class GrilleException extends Exception {

    /**
     * Creates a new instance of <code>GrilleException</code> without detail
     * message.
     */
    public GrilleException() {
    }

    /**
     * Constructs an instance of <code>GrilleException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public GrilleException(String msg) {
        super(msg);
    }
}
