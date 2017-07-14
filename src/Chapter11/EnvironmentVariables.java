package Chapter11;

import java.util.Map;

/**
 * Created by smaug on 2017/7/14.
 */
public class EnvironmentVariables
{
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet())
            System.out.println(entry.getKey()+":"+entry.getValue());
    }
}
