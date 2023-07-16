package moonjo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Map<String, Map<String, String>> map = new HashMap<>();

        for (int i = 0; i < 200000; i++) {
            Map<String, String> tmp = new HashMap<>();
            for (int j = 0; j < 25; j++) {
                tmp.put(UUID.randomUUID().toString(), UUID.randomUUID().toString());
            }
            map.put(String.valueOf(i), tmp);
        }

        Thread.sleep(100_0000);
    }
}


