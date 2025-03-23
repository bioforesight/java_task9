import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StudentWithClock implements Learner {
    private Learner learner;

    public StudentWithClock(Learner learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        learner.learn();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String currentTime = now.format(formatter);
        System.out.println(currentTime);
    }
}
