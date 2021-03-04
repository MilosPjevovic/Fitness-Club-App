package main;

import controller.Controller;
import view.LogovanjeOkvir;

/**
 *
 * @author Pjevovic
 */
public class Main {

    public static void main(String[] args) {
        
        LogovanjeOkvir logovanje = new LogovanjeOkvir();

        Controller controller = new Controller(logovanje);

    }
}
