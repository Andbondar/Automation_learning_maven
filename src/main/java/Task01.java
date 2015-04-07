import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by bondar on 4/7/2015.
 */
public class Task01 {
    enum Tasks {Task1, Task2}

    public static void main(String[] args) throws IOException {
        ArrayList<String> myArrayListString = new Task01().sampleArrayList();
        System.out.println("Input Array: " + Arrays.toString(myArrayListString.toArray()));

        System.out.println("Input task name (Task1 or Task2):");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();

        int taskSwitcher = 0;//select task using User Input
        if (inputString.matches("[Tt]ask ?0?1")) taskSwitcher = 1;
        else if (inputString.matches("[Tt]ask ?0?2")) taskSwitcher = 2;

        switch (taskSwitcher){
            case 1:
                ArraySplitter.splitArrayList(myArrayListString);
                ArraySplitter.splitArrayListWONulls(myArrayListString);
                ArraySplitter.splitArrayListWithReplacing(myArrayListString);
                ArraySplitter.splitArrayListWithStringJoiner(myArrayListString);
                break;
            case 2:
                System.out.println("Task2 will be here");
                break;
            default:
                System.out.println("No such task");
        }
    }


    //create ArrayList<String> for testing
    public ArrayList<String> sampleArrayList(){
        ArrayList<String> myArrayListString = new ArrayList<String>();
        myArrayListString.add("dog");
        myArrayListString.add("cat");
        myArrayListString.add(null);
        myArrayListString.add("anotherDog");
        myArrayListString.add(null);
        myArrayListString.add("catty43");
        myArrayListString.add("test14.22");
        return myArrayListString;
    }
}
