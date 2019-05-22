public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Liczby parzyste z zakresu od 0 do 100 to:");
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) System.out.printf("%d ", i);
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

        sum = 0;
        for (i = 0; i <= 100; i++) {
            if (i % 2 == 0) System.out.printf("%d ", i);
            sum = sum + i;
        }
        System.out.println(sum);

    }

}
