package Chapter5;

/**
 * Created by smaug on 2017/4/21.
 */

class Game
{
    Game(int i) {
        System.out.println("game con");
    }
}

class BoardGame extends Game
{

    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame");
    }
}

public class Chess extends BoardGame
{
    Chess() {
        super(11);
        System.out.println("chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}


