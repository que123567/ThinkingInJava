package Chapter8;

/**
 * p165
 * Created by smaug on 2017/4/21.
 */
class Actor {
    public void act() {
    }
}

class HappyActor extends Actor {
    @Override
    public void act() {
        super.act();
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        super.act();
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    public void setChange() {
        actor = new SadActor();
    }

    public void perform() {
        actor.act();
    }
}


public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.perform();
        stage.setChange();
        stage.perform();
    }
}
