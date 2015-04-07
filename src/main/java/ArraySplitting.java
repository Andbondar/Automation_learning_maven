import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by bondar on 4/7/2015.
 */
public class ArraySplitting {
    public static void splitArrayList(ArrayList<String> inputArrayList){
        System.out.println("Input string(w/o trimming): " + String.join("; ", inputArrayList));
    }

    public static void splitArrayListWONulls(ArrayList<String> inputArrayList){
        System.out.println("String w/o nulls: " + Joiner.on("; ").skipNulls().join(inputArrayList));
    }

    public static void splitArrayListWithReplacing(ArrayList<String> inputArrayList){
        System.out.println("String with replaced nulls: " + Joiner.on("; ").useForNull("*").join(inputArrayList));
    }

    public static void splitArrayListWithStringJoiner(ArrayList<String> inputArrayList){
        StringJoiner sj = new StringJoiner("; ", "Concatenation with StringJoiner: ", " End!");
        for (String anInputArrayList : inputArrayList) {
            sj.add(anInputArrayList);
        }
        System.out.println(sj.toString());
    }
}
