//1번 과제
public class nameScript {

    public static void main(String[] args) {

        char[] nameList = {'박', '민', '건'};
        int nameListPointer = 0;

        char startValue = Character.MIN_VALUE;
        char endValue = Character.MAX_VALUE;

        for (int i = startValue; i < endValue; i++) {
            if (i == nameList[nameListPointer]) {
                System.out.print("0x");
                System.out.format("%04X%n", i);
                nameListPointer += 1;
                i = startValue;
            }
            if (nameListPointer == nameList.length) {
                i = endValue;
            }
        }
    }
}