package lsp;

import java.util.List;

/**
 * Refactor the code to ensure it adheres to LSP.
 */
public class Main {

    public static void main(String[] args) {

        Bird penguin = new Penguin("Penguin");
        Bird pigeon = new Pigeon("Pigeon");

        List<Bird> birds = List.of(penguin, pigeon);

        for (Bird bird : birds) {
            bird.eat();
            bird.sleep();

            if (bird instanceof FlyingBird flyingBird) {
                flyingBird.fly();
            }
        }

    }


    //                  Bird
    //                 /   \
    //           Penguin   FlyingBird
    //                      /
    //                   Pigeon
}
