package Chapter5;

/**
 * Created by smaug on 2017/4/24.
 */
public class Test
{

}
class Person{
    public void eat(Apple apple){
        Apple peeled=apple.getPeeled();

    }
}
class Peeler
{
    static Apple peel(Apple apple){
        //remove peel
        return apple;
    }
}

class Apple
{
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}
