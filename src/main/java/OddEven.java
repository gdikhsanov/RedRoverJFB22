import project_utils.Utils;

public class OddEven {

    public String oddEven(int number){
        if (Utils.isEven(number)){
            return "Even";
        }
        return "Odd";
    }
}
