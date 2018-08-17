public class TowerOfHanoi {

  public void move(int numDisks, char from, char to, char using) {
    if (numDisks == 1) {
      System.out.println("Moving Disk 1 from " + from + " to " + to);
    } else {
      move(numDisks-1,from,using,to);
      System.out.println("Moving Disk " + numDisks + " from " + from + " to " + to);
      move(numDisks-1,using,to,from);
    }
  }
}
