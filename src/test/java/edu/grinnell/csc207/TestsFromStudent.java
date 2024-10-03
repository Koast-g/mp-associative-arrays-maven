package edu.grinnell.csc207;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Kostiantyn Tsymbal
 */
public class TestsFromStudent {
  /**
   * Checks if the remove method will decrease the number of elements in the array
   *
   * @throws Exception
   */
  @Test
  public void kostiantynTsymbalTest1() throws Exception {
    AssociativeArray<Integer, String> arr = new AssociativeArray<Integer, String>();
    try {
      arr.set(1, "Test");
    } catch (Exception e) {
      throw new Exception("Failed to set the value of the list");
    } // try/catch ();
    // checking if the number of elements in the array is right
    assertEquals(1, arr.size(), "The size of the array is one");
    arr.remove(1);
    // checking if the number of elements in the array is right
    assertEquals(0, arr.size(), "Empty array");
  } // kostiantynTsymbalTest1()

  /**
   * When passed the same key(when setting a new value) it overides it
   *
   * @throws Exception
   */
  @Test
  public void kostiantynTsymbalTest2() throws Exception {
    AssociativeArray<Integer, String> arr = new AssociativeArray<Integer, String>();
    try {
      arr.set(24, "Test");
    } catch (Exception e) {
      throw new Exception("Set failed");
    } // try/catch
    for (int i = 0; i < 100; i++) {
      try {
        arr.set(24, String.valueOf(i));
      } catch (Exception e) {
        throw new Exception("Set failed");
      } // try/catch
    } // for
    // checking set overide the same key
    assertEquals("99", arr.get(24), "Overided key");
  } // kostiantynTsymbalTest2()

  /**
   * Pasing a null as a key
   *
   * @throws NullKeyException
   */
  @Test
  public void kostiantynTsymbalEdge1() throws NullKeyException {
    AssociativeArray<Integer, String> arr = new AssociativeArray<Integer, String>();
    try {
      arr.set(null, "This is going to fail");
      fail("Key cant be null; should have thrown an exception");
    } catch (NullKeyException e) {
    } // try/catch
  } // kostiantynTsymbalEdge1()
} // class TestsFromSam
