import java.util.ArrayList;
import java.util.List;


public class Program4_Colours {


    public static void main(String[] args) {
        tv();
    }

    public static void tv() {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Pink");
        list_Strings.add("Purple");
        list_Strings.add("Gold");
        list_Strings.add("Yellow");
        list_Strings.add("Blue");
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        for (Object name : list_Strings) {
            System.out.println(name);

        }
    }
}

