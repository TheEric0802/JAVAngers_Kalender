import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> months = new LinkedHashMap<>();

        months.put("Januar", 31);
        months.put("Februar", 28);
        months.put("März", 31);
        months.put("April", 30);
        months.put("Mai", 31);
        months.put("Juni", 30);
        months.put("Juli", 31);
        months.put("August", 31);
        months.put("September", 30);
        months.put("Oktober", 31);
        months.put("November", 30);
        months.put("Dezember", 31);

        String calendarHead = "Mo Di Mi Do Fr Sa So";

        int start = 0;

        for (String month : months.keySet()) {
            System.out.println("\n" + month + "\n" + calendarHead);

            int count = 0;

            for (int i = 1; i <= months.get(month); i++) {

                if (i == 1) {
                    count = 0;
                    for (int j = 0; j < start; j++) {
                        System.out.print("   ");
                        count++;
                    }
                }

                count++;

                if (i < 10) {
                    System.out.print(" ");
                }

                System.out.print(i + " ");

                if (i == months.get(month)) {
                    start = count % 7;
                    System.out.println();
                } else if (count % 7 == 0) {
                    System.out.println();
                }

            }
        }

    }
}