
package pkg3hge;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;



public class RangePull {

    public static void main(String[] args) {
        String urlToCall = "https://api.opap.gr/draws/v3.0/5104/draw-date/2021-12-01/2021-12-31/draw-id";
        
        OkHttpClient client=new OkHttpClient();
        
        Request request = new Request.Builder().url(urlToCall).build();
        
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                String responseString=response.body().string();
                System.out.println(responseString);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }           

    }
}

    
