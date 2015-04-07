import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by bondar on 4/7/2015.
 */
public class Task01_Task02 {
    enum Tasks {Task1, Task2}

    public static void main(String[] args) throws IOException {
        ArrayList<String> myArrayListString = new Task01_Task02().sampleArrayList();
        System.out.println("Input Array(Task1): " + Arrays.toString(myArrayListString.toArray()));
        String inputStringForTask2 = new Task01_Task02().sampleString();
        System.out.println("Input string(Task2): " + inputStringForTask2);

        System.out.println("Input task name (Task1 or Task2):");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();


        //select task using User Input
        int taskSwitcher = 0;
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
                StringSplitter.splitString(inputStringForTask2);
                StringSplitter.splitStingWOEmptyStrings(inputStringForTask2);
                StringSplitter.splitStringAndTrimSpaces(inputStringForTask2);
                StringSplitter.splitStringAndTrimNumbers(inputStringForTask2);
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

    public String sampleString(){
        return "   cat, dog, null  , cat18, abc, , 22, 58.74, , abomination   , 12rat34, 12abc12def34";
    }
}
