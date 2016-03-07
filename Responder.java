import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private ArrayList<String>lista;
    private Random resp;
    private HashMap <String, String> respuesta;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        resp = new Random();
        lista = new ArrayList<>();
        lista.add("That sounds interesting. Tell me more...");
        lista.add("It's so interesting, please, continue...");
        lista.add("That don't sounds well, you should stop.");
        lista.add("Please, be carefull, but... continue...");
        lista.add("Are you sure that all it it's real?");
        
        respuesta = new HashMap<>();
        respuesta.put("Hello", "Tell us what happends.");
        respuesta.put("Thanks", " If you have further questions or need assistance, please, contact us again.");
        respuesta.put("Solved", "Thank you for contacting to our technical Suppport.");
        respuesta.put("Bye", "Please do not hesitate to contact us again.");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String input)
    {
        String response;
        if (respuesta.get(input) != null)
        {
            response = respuesta.get(input);
        }
        else
        {
            response = lista.get(resp.nextInt(lista.size()));
        }
        return response;
    }
}
