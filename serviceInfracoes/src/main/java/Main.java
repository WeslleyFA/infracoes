import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import service.GeradorService;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();

        final long segundos = 1000*3;
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                try {

                    HttpClient httpclient = HttpClients.createDefault();
                    HttpPost post = new HttpPost("http://localhost:8080/record");

                    post.addHeader("Content-Type", "application/json");

                    JSONObject record = new JSONObject();

                    record.put("placa", GeradorService.geraPlaca());
                    record.put("veiculo", GeradorService.geraVeiculos());
                    record.put("velocidade", GeradorService.geraVelocidade());

                    StringEntity entity = new StringEntity(record.toString());
                    post.setEntity(new StringEntity(record.toString(), "utf-8"));


                    HttpResponse response = httpclient.execute(post);

                    String jsonResponse = EntityUtils.toString(response.getEntity());
                    System.out.println(jsonResponse);


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        timer.scheduleAtFixedRate(tarefa,segundos,segundos);
    }
}
