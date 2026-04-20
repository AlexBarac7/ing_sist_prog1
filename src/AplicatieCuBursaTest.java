import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Comparator;
import java.util.List;

public class AplicatieCuBursaTest {
    AplicatieCuBursa appCuBursa = new AplicatieCuBursa();
    @Test
    public void sortTest1() {
        // arrange
        List<StudentiBursieri> bursieri = appCuBursa.genereaza();
        // act
        List<StudentiBursieri> bursieri_sortati = appCuBursa.sorteaza(bursieri);
        // assert
        Comparator<StudentiBursieri> comp =
                Comparator.comparing(StudentiBursieri::getFormatieDeStudiu)
                        .thenComparing(StudentiBursieri::getNume)
                        .thenComparing(StudentiBursieri::getPrenume)
                        .thenComparing(StudentiBursieri::getNota)
                        .thenComparing(StudentiBursieri::getCuantumBursa);

        for (int i = 0; i < bursieri_sortati.size() - 1; i++) {
            Assertions.assertTrue(comp.compare(bursieri_sortati.get(i), bursieri_sortati.get(i + 1)) <= 0);
        }
    }
}