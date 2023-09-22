package belajar.sequenced.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
import java.util.TreeMap;

public class MapTest {

  @Test
  void map() {
    SequencedMap<String, String> map = new TreeMap<>();
    map.put("c", "Eko");
    map.put("b", "Kurniawan");
    map.put("a", "Khannedy");

    Assertions.assertEquals("Khannedy", map.firstEntry().getValue());
    Assertions.assertEquals("Eko", map.lastEntry().getValue());

    SequencedMap<String, String> reversed = map.reversed();
    Assertions.assertEquals("Khannedy", reversed.lastEntry().getValue());
    Assertions.assertEquals("Eko", reversed.firstEntry().getValue());
  }

  @Test
  void linkedMap() {
    SequencedMap<String, String> map = new LinkedHashMap<>();
    map.putFirst("a", "Eko"); // a
    map.putFirst("b", "Kurniawan"); // b, a
    map.putFirst("c", "Khannedy"); // c, b, a

    Assertions.assertEquals("Khannedy", map.firstEntry().getValue());
    Assertions.assertEquals("Eko", map.lastEntry().getValue());
  }
}
