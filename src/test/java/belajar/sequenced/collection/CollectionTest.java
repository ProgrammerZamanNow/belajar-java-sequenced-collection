package belajar.sequenced.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class CollectionTest {

  @Test
  void collection() {
    SequencedCollection<String> list = new ArrayList<>();
    list.addLast("Khannedy"); // Khannedy
    list.addFirst("Kurniawan"); // Kurniawan, Khannedy
    list.addFirst("Eko"); // Eko, Kurniawan, Khannedy

    Assertions.assertEquals(List.of("Eko", "Kurniawan", "Khannedy"), list);

    Assertions.assertEquals("Eko", list.getFirst());
    Assertions.assertEquals("Khannedy", list.getLast());

    SequencedCollection<String> reversed = list.reversed();
    Assertions.assertEquals(List.of("Khannedy", "Kurniawan", "Eko"), reversed);

    String value = list.removeFirst();
    Assertions.assertEquals("Eko", value);
    Assertions.assertEquals("Kurniawan", list.getFirst());

    value = list.removeLast();
    Assertions.assertEquals("Khannedy", value);
    Assertions.assertEquals("Kurniawan", list.getLast());
  }
}
