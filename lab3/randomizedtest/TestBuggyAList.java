package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
  @Test
  public void testThreeAddThreeRemove() {
      AListNoResizing<Integer> correct = new AListNoResizing<>();
      BuggyAList<Integer> broken = new BuggyAList<>();
      int i;
      for(i=0;i<1000;i++)
      {
          correct.addLast(i);
          broken.addLast(i);
      }
      assertEquals(correct.size(), broken.size());
      for(i=0;i<1000;i++)
      {
          //assertEquals(correct.removeLast(), broken.removeLast());
          correct.removeLast();
          broken.removeLast();
      }

  }
}
