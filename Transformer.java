public class Transformer {

  /**
   * An static enum  for the types of
   * allowable transformations
   */
  public static enum Type {
    UNKNOWN,
    IDENTITY,
    ROTATION,
    VERTICAL_SYMMETRY,
    HORIZONAL_SYMMETRY,
  }

  /**
   * The list of all allowable symmetries for a n (numRows) x m (numColumns) board
   * by applying the following transformations
   * @param numRows The number of rows in your board
   * @param numColumns The number of columns in your board
   * @return All rotations for a symmetric board
   */
  public static Type[] symmetricTransformations(int numRows, int numColumns) {

    // -------------------
    // IMPLEMENT THIS METHOD
    // TODO: Based on the dimensions there are different allowable transformations
    // HINT: This method will help you determine the `allowable` tranformations
    //       in your TicTacToe game
    // -------------------

    // don't forget to delete this line of code!!!
    return null;
  }

  /**
   * Applies the transformation specified as parameter
   * to transformedBoard
   *
   * If the transformation was successful return true, if not return false;
   */
  public static boolean transform(Type transformation, int numRows, int numColumns, int[] board) {

    // -------------------
    // WRITE CODE HERE
    // TODO: Implement this method
    // HINT: See assignment details
    // -------------------

    // don't forget to delete this line of code!!!
    return false;
  }

  /**
   * Create the identity board, which means do not flip the board at all.
   * Here we ignore the current values within the provided board and
   * populate it with its index value.
   *
   * If we consider a 3x3 board, the identity board would be
   *
   * 0 | 1 | 2
   * ----------
   * 3 | 4 | 5
   * ----------
   * 6 | 7 | 8
   *
   *
   * If the transformation was successful return true, if not return false;
   */
  public static boolean identity(int numRows, int numColumns, int[] board) {

    // -------------------
    // WRITE CODE HERE
    // TODO: Implement this method
    // -------------------

    // don't forget to delete this line of code!!!
    return false;
  }

  /**
   * Flip a board horizontally based on the n (numRows) x m (numColumns) grid
   * editing the provided board in place.
   *
   * If we consider a 3x3 board
   *
   * 1 | 2 | 3
   * ----------
   * 4 | 5 | 6
   * ----------
   * 7 | 8 | 9
   *
   * The updated horizontally flipped board would be
   *
   * 7 | 8 | 9
   * ----------
   * 4 | 5 | 6
   * ----------
   * 1 | 2 | 3
   *
   * If the transformation was successful return true, if not return false;
   */
  public static boolean horizontalFlip(int numRows, int numColumns, int[] board) {

    // -------------------
    // WRITE CODE HERE
    // TODO: Implement this method
    // -------------------

    // don't forget to delete this line of code!!!
    return false;
  }

 /**
   * Flip a board vertically based on the n (numRows) x m (numColumns) grid
   * editing the provided board in place.
   *
   * If we consider a 3x3 board
   *
   * 1 | 2 | 3
   * ----------
   * 4 | 5 | 6
   * ----------
   * 7 | 8 | 9
   *
   * The updated vertically flipped board would be
   *
   * 3 | 2 | 1
   * ----------
   * 6 | 5 | 4
   * ----------
   * 9 | 8 | 7
   *
   * If the transformation was successful return true, if not return false;
   */
  public static boolean verticalFlip(int numRows, int numColumns, int[] board) {

    // -------------------
    // WRITE CODE HERE
    // TODO: Implement this method
    // -------------------

    // don't forget to delete this line of code!!!
    return false;
  }

 /**
   * Rotate a board 90 degrees based on the n x (numRows) x m (numColumns) grid
   * editing the provided board in place.
   *
   * If we consider a 3x3 board
   *
   * 1 | 2 | 3
   * ----------
   * 4 | 5 | 6
   * ----------
   * 7 | 8 | 9
   *
   * The updated 90 rotated board would be
   *
   * 7 | 4 | 1
   * ----------
   * 8 | 5 | 2
   * ----------
   * 9 | 6 | 3
   *
   * You can only rotate n x n boards.
   *
   * If the transformation was successful return true, if not return false;
   */
  public static boolean rotate90(int numRows, int numColumns, int[] board) {

    // -------------------
    // WRITE CODE HERE
    // TODO: Implement this method
    // -------------------

    // don't forget to delete this line of code!!!
    return false;
  }

  private static void test(int numRows, int numColumns) {
    int[] test;
    test = new int[numRows*numColumns];

    System.out.println("testing " + numRows + " numRows and " + numColumns + " numColumns.");

    identity(numRows, numColumns, test);
    System.out.println(java.util.Arrays.toString(test));

    horizontalFlip(numRows,numColumns,test);
    System.out.println("HF => " + java.util.Arrays.toString(test));

    horizontalFlip(numRows,numColumns,test);
    System.out.println("HF => " + java.util.Arrays.toString(test));

    verticalFlip(numRows,numColumns,test);
    System.out.println("VF => " + java.util.Arrays.toString(test));

    verticalFlip(numRows,numColumns,test);
    System.out.println("VF => " + java.util.Arrays.toString(test));

    for(int i = 0; i < 4; i++) {
      boolean didTransform = rotate90(numRows,numColumns,test);
      if (didTransform) {
        System.out.println("ROT => " + java.util.Arrays.toString(test));
      }
    }
  }

  public static void main(String[] args) {
    int[] test;
    int numRows, numColumns;

    test(2,2);
    test(2,3);
    test(3,3);
    test(4,3);
    test(4,4);
  }

}