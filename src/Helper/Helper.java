/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import IO.IO;

/**
 *
 * @author Tobias
 */
public class Helper {

    static int input;

    /**
     *
     * @param message Hint
     * @param min Minimum Value
     * @param max Maximum Value
     * @return
     */
    public static int checkUserInput(String message, int min, int max) {
        boolean error = false;
        do {
            IO.println(message);
            input = IO.readInt();
            if (input < min || input > max) {
                IO.println("Eingabe, außerhalb des gültigen Bereiches (" + min + "-" + max + ")");
                error = true;
            } else {
                error = false;

            }
        } while (error);
        return input;
    }
}
