package devoir.prog3;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component

public abstract class AbstractClass1 {
    private ConcreteDependance1 dependance1;
    private ConcreteDependance2 dependance2;
}
