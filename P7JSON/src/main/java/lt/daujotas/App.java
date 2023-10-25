package lt.daujotas;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.lang.runtime.ObjectMethods;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

       final Person person=new Person("jonas", 25);
       File personJsonFile =new File("person.json");
        ObjectMapper objectMapper=new ObjectMapper();
        //serialization
        objectMapper.writeValue(personJsonFile, person);

        //deserialization
        final Person personDeserialized=objectMapper.readValue(personJsonFile, Person.class);
        System.out.println(personDeserialized);
    }


}
