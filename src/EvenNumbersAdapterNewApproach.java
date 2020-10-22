import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersAdapterNewApproach implements EvenNumbersAdapter
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
        return numbers
                .stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

}
