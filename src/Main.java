import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < 11; i++)
        {
            numbers.add(i);
        }

        EvenNumbersAdapterOldApproach evenNumbersOld = new EvenNumbersAdapterOldApproach();
        evenNumbersOld.addNumbers(numbers);

        System.out.println("First approach:" + evenNumbersOld.getEvenNumbers());

        EvenNumbersAdapterNewApproach evenNumbersNew = new EvenNumbersAdapterNewApproach();
        evenNumbersNew.addNumbers(numbers);

        System.out.println("Second approach:" + evenNumbersNew.getEvenNumbers());
    }

}
