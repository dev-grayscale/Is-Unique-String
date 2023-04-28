import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void isUniqueV1() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV1(null));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV1(""));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV1("    "));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV1(" "));

    Assertions.assertFalse(Main.isUniqueV1("aba"));
    Assertions.assertFalse(Main.isUniqueV1("1231"));
    Assertions.assertFalse(Main.isUniqueV1("bb"));
    Assertions.assertFalse(Main.isUniqueV1("44"));
    Assertions.assertFalse(Main.isUniqueV1("!!"));
    Assertions.assertFalse(Main.isUniqueV1("!!"));
    Assertions.assertFalse(Main.isUniqueV1("   e"));
    Assertions.assertFalse(Main.isUniqueV1("TesTing"));
    Assertions.assertFalse(Main.isUniqueV1("abcdeefgh"));
    Assertions.assertFalse(Main.isUniqueV1("a12bc#$%^de!@|fghi+_0jk lm n"));
    Assertions.assertFalse(Main.isUniqueV1(" what !@#$%"));
    Assertions.assertFalse(Main.isUniqueV1("what is no"));

    Assertions.assertTrue(Main.isUniqueV1("Testing"));
    Assertions.assertTrue(Main.isUniqueV1("ram"));
    Assertions.assertTrue(Main.isUniqueV1("Uncopyrightable"));
    Assertions.assertTrue(Main.isUniqueV1("dermatoglyphics"));
    Assertions.assertTrue(Main.isUniqueV1("abcdefghijklmnop"));
    Assertions.assertTrue(Main.isUniqueV1("a12bc#$%^de!@|fghi+_0jklmn"));
    Assertions.assertTrue(Main.isUniqueV1("a12bc#$%^de!@|fghi+_0jk lmn"));
    Assertions.assertTrue(Main.isUniqueV1("a12bc#$%^de!@|fghi+_0jk lmnABCDEFGHIJKLMNOPp"));
  }

  @Test
  void isUniqueV2() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV2(null));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV2(""));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV2("    "));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV2(" "));

    Assertions.assertFalse(Main.isUniqueV2("aba"));
    Assertions.assertFalse(Main.isUniqueV2("1231"));
    Assertions.assertFalse(Main.isUniqueV2("bb"));
    Assertions.assertFalse(Main.isUniqueV2("44"));
    Assertions.assertFalse(Main.isUniqueV2("!!"));
    Assertions.assertFalse(Main.isUniqueV2("!!"));
    Assertions.assertFalse(Main.isUniqueV2("   e"));
    Assertions.assertFalse(Main.isUniqueV2("TesTing"));
    Assertions.assertFalse(Main.isUniqueV2("abcdeefgh"));
    Assertions.assertFalse(Main.isUniqueV2("a12bc#$%^de!@|fghi+_0jk lm n"));
    Assertions.assertFalse(Main.isUniqueV2(" what !@#$%"));
    Assertions.assertFalse(Main.isUniqueV2("what is no"));

    Assertions.assertTrue(Main.isUniqueV2("Testing"));
    Assertions.assertTrue(Main.isUniqueV2("ram"));
    Assertions.assertTrue(Main.isUniqueV2("Uncopyrightable"));
    Assertions.assertTrue(Main.isUniqueV2("dermatoglyphics"));
    Assertions.assertTrue(Main.isUniqueV2("abcdefghijklmnop"));
    Assertions.assertTrue(Main.isUniqueV2("a12bc#$%^de!@|fghi+_0jklmn"));
    Assertions.assertTrue(Main.isUniqueV2("a12bc#$%^de!@|fghi+_0jk lmn"));
    Assertions.assertTrue(Main.isUniqueV2("a12bc#$%^de!@|fghi+_0jk lmnABCDEFGHIJKLMNOPp"));
  }

  @Test
  void isUniqueV3() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV3(null));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV3(""));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV3("    "));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV3(" "));

    Assertions.assertFalse(Main.isUniqueV3("aba"));
    Assertions.assertFalse(Main.isUniqueV3("1231"));
    Assertions.assertFalse(Main.isUniqueV3("bb"));
    Assertions.assertFalse(Main.isUniqueV3("44"));
    Assertions.assertFalse(Main.isUniqueV3("!!"));
    Assertions.assertFalse(Main.isUniqueV3("!!"));
    Assertions.assertFalse(Main.isUniqueV3("   e"));
    Assertions.assertFalse(Main.isUniqueV3("TesTing"));
    Assertions.assertFalse(Main.isUniqueV3("abcdeefgh"));
    Assertions.assertFalse(Main.isUniqueV3("a12bc#$%^de!@|fghi+_0jk lm n"));
    Assertions.assertFalse(Main.isUniqueV3(" what !@#$%"));
    Assertions.assertFalse(Main.isUniqueV3("what is no"));

    Assertions.assertTrue(Main.isUniqueV3("Testing"));
    Assertions.assertTrue(Main.isUniqueV3("ram"));
    Assertions.assertTrue(Main.isUniqueV3("Uncopyrightable"));
    Assertions.assertTrue(Main.isUniqueV3("dermatoglyphics"));
    Assertions.assertTrue(Main.isUniqueV3("abcdefghijklmnop"));
    Assertions.assertTrue(Main.isUniqueV3("a12bc#$%^de!@|fghi+_0jklmn"));
    Assertions.assertTrue(Main.isUniqueV3("a12bc#$%^de!@|fghi+_0jk lmn"));
    Assertions.assertTrue(Main.isUniqueV3("a12bc#$%^de!@|fghi+_0jk lmnABCDEFGHIJKLMNOPp"));
  }

  @Test
  void isUniqueV4() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV4(null));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV4(""));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV4("    "));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.isUniqueV4(" "));

    Assertions.assertFalse(Main.isUniqueV4("aba"));
    Assertions.assertFalse(Main.isUniqueV4("1231"));
    Assertions.assertFalse(Main.isUniqueV4("bb"));
    Assertions.assertFalse(Main.isUniqueV4("44"));
    Assertions.assertFalse(Main.isUniqueV4("!!"));
    Assertions.assertFalse(Main.isUniqueV4("!!"));
    Assertions.assertFalse(Main.isUniqueV4("   e"));
    Assertions.assertFalse(Main.isUniqueV4("TesTing"));
    Assertions.assertFalse(Main.isUniqueV4("abcdeefgh"));
    Assertions.assertFalse(Main.isUniqueV4("a12bc#$%^de!@|fghi+_0jk lm n"));
    Assertions.assertFalse(Main.isUniqueV4(" what !@#$%"));
    Assertions.assertFalse(Main.isUniqueV4("what is no"));

    Assertions.assertTrue(Main.isUniqueV4("Testing"));
    Assertions.assertTrue(Main.isUniqueV4("ram"));
    Assertions.assertTrue(Main.isUniqueV4("Uncopyrightable"));
    Assertions.assertTrue(Main.isUniqueV4("dermatoglyphics"));
    Assertions.assertTrue(Main.isUniqueV4("abcdefghijklmnop"));
    Assertions.assertTrue(Main.isUniqueV4("a12bc#$%^de!@|fghi+_0jklmn"));
    Assertions.assertTrue(Main.isUniqueV4("a12bc#$%^de!@|fghi+_0jk lmn"));
    Assertions.assertTrue(Main.isUniqueV4("a12bc#$%^de!@|fghi+_0jk lmnABCDEFGHIJKLMNOPp"));
  }
}
