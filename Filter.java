import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Применяем фильтр по заданному значению");
        return source.stream()
                .filter(value -> value < treshold)
                .collect(Collectors.toList());
    }
}
