package farrel.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Gson gson = new Gson();

        Person person = new Person("Farrel Athaillah Putra");
        String json = gson.toJson(person); // convert object to json

        System.out.println(json);
    }
}
