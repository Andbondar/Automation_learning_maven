import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by bondar on 4/7/2015.
 */
public class Task01_Task02 {
    enum Task1 {SPLIT, WONULLS, REPLACING, END}
    enum Task2 {SPLIT, WOENPTY, TRIMSPACE, TRIMNUMBERS}

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
        if (inputString.contains("1")) taskSwitcher = 1;
        else if (inputString.contains("2")) taskSwitcher = 2;

        switch (taskSwitcher){
            case 1:
                doTask1(Task1.SPLIT, myArrayListString);
                doTask1(Task1.WONULLS, myArrayListString);
                doTask1(Task1.REPLACING, myArrayListString);
                doTask1(Task1.END, myArrayListString);
                break;
            case 2:
                doTask2(Task2.SPLIT, inputStringForTask2);
                doTask2(Task2.WOENPTY, inputStringForTask2);
                doTask2(Task2.TRIMSPACE, inputStringForTask2);
                doTask2(Task2.TRIMNUMBERS, inputStringForTask2);
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

    public static void doTask1(Task1 inputTask1, ArrayList<String> inputArrayListString){
        switch (inputTask1){
            case SPLIT:
                ArraySplitter.splitArrayList(inputArrayListString);
                break;
            case WONULLS:
                ArraySplitter.splitArrayListWONulls(inputArrayListString);
                break;
            case REPLACING:
                ArraySplitter.splitArrayListWithReplacing(inputArrayListString);
                break;
            case END:
                ArraySplitter.splitArrayListWithStringJoiner(inputArrayListString);
                break;
        }
    }

    public static void doTask2(Task2 inputTask, String inputString){
        switch (inputTask){
            case SPLIT:
                StringSplitter.splitString(inputString);
                break;
            case WOENPTY:
                StringSplitter.splitStingWOEmptyStrings(inputString);
                break;
            case TRIMSPACE:
                StringSplitter.splitStringAndTrimSpaces(inputString);
                break;
            case TRIMNUMBERS:
                StringSplitter.splitStringAndTrimNumbers(inputString);
                break;
        }
    }
}
