import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;

public class ConvertirMoneda {


    public double convertir(String monedaBase, String monedaObjetivo, double valor) {
            URI direccion= URI.create("https://v6.exchangerate-api.com/v6/7f1a393015a8d13a84d88d5a/pair/"+monedaBase+"/"+monedaObjetivo+"/"+valor);
            HttpClient client=HttpClient.newHttpClient();
            MonedaEquivalente monedaEquivalente= null;

            HttpRequest request=HttpRequest.newBuilder().uri(direccion).build();
            HttpResponse <String> response=null;
            try{
                response=client.send(request,HttpResponse.BodyHandlers.ofString());
                monedaEquivalente= new Gson().fromJson(response.body(), MonedaEquivalente.class);
            } catch (Exception e){
                System.out.println("Error al realizar la peticion"+ e.getMessage());
            }

            return  Objects.requireNonNull(monedaEquivalente).conversion_result();
    }
}
