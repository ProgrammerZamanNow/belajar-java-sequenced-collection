package belajar.sequenced.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.SequencedSet;
import java.util.TreeSet;

public class SetTest {

  @Test
  void set() {

    SequencedSet<String> set = new TreeSet<>();
    set.add("Eko"); // eko
    set.add("Budi"); // budi, eko
    set.add("Joko"); // budi, eko, joko

    Assertions.assertEquals("Budi", set.getFirst());
    Assertions.assertEquals("Joko", set.getLast());

    SequencedSet<String> reversed = set.reversed();

    Assertions.assertEquals("Budi", reversed.getLast());
    Assertions.assertEquals("Joko", reversed.getFirst());

    String value = set.removeFirst();
    Assertions.assertEquals("Budi", value);

    value = set.removeFirst();
    Assertions.assertEquals("Eko", value);

  }
}
