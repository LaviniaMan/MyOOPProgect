import java.util.HashMap;
import java.util.Map;

public class HashMapStudenti {
    public static void main(String[] args) {
        HashMap<String, Boolean> studenti = new HashMap<>();
        studenti.put("Mihail", true);
        studenti.put("Eliza", true);
        studenti.put("Aurora", false);
        studenti.put("Ianis", true);
        studenti.put("David", false);

            for (Map.Entry<String, Boolean> promovati : studenti.entrySet()){
            if (promovati.getValue()){
                System.out.println(promovati.getKey());
                }
            }

            for (String c:studenti.keySet()){
                if (studenti.get(c)){
                    System.out.println(c);
                }
            }

        }
    }


