package online.florbert.recap.run;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "Monday Morning Run",LocalDateTime.now(), LocalDateTime.now().plus(30,ChronoUnit.MINUTES), 10, Location.INDOOR));
        runs.add(new Run(2, "Tuesday Morning Run",LocalDateTime.now(), LocalDateTime.now().plus(40,ChronoUnit.MINUTES), 15, Location.OUTDOOR));
    }

}
