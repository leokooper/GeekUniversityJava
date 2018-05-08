import java.util.*;

public class PlayWithMassAndLists {
    public static void main(String[] args) {
        String[] str = {"Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый", "Красный", "Красный", "Оранжевый", "Желтый"};
        TreeSet<String> clrshs = new TreeSet<>(Arrays.asList(str));
        System.out.println(clrshs);


        Map<String, Integer> colorsHm = new HashMap<String, Integer>();

        ArrayList<String> clrsas = new ArrayList<>(Arrays.asList(str));

        for (int i = 0; i < clrsas.size(); i++) {
            String tempStr = clrsas.get(i);

            if (!colorsHm.containsKey(tempStr)) {
                colorsHm.put(tempStr, 1);
            } else {
                colorsHm.put(tempStr, colorsHm.get(tempStr) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : colorsHm.entrySet()) {
            System.out.println("Слово = " + entry.getKey() + ", Повторений = " + entry.getValue());
        }
    }
}
