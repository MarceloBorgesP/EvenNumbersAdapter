import java.util.ArrayList;
import java.util.List;

public class EvenNumbersAdapterOldApproach implements EvenNumbersAdapter
{
    private List<Integer> numbers;

    @Override
    public void addNumbers(List<Integer> numbers)
    {
        this.numbers = numbers;
    }

    @Override
    public List<Integer> getEvenNumbers()
    {
        List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 1; i < this.numbers.size(); i++)
        {
            Integer number = this.numbers.get(i);

            if (number % 2 == 0)
            {
                evenNumbers.add(number);
            }
        }

        return evenNumbers;
    }

}
