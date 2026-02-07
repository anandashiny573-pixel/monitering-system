import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SmartFarmMonitor {

    public static void main(String[] args) {

        try {

            String channelID = "YOUR_CHANNEL_ID";
            String readAPI = "YOUR_READ_API_KEY";

            String urlString =
                    "https://api.thingspeak.com/channels/"
                    + channelID +
                    "/feeds/last.json?api_key=" +
                    readAPI;

            URL url = new URL(urlString);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in =
                    new BufferedReader(new InputStreamReader(con.getInputStream()));

            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();

            System.out.println("Latest Sensor Data:");
            System.out.println(response.toString());

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
