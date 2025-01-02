public class ArrayListDriver {
    public static void main(String[] args) {
        ArrayList strings = new ArrayList();
        int index;
        String str;

        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");

        for(index = 0; index < strings.size(); index++){
            str = (String) strings.get(index);
            System.out.printf("[%d]: %s\n", index, str);
        }

        strings.status();
    }
}
