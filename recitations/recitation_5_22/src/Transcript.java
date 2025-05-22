class Transcript implements Cloneable {
  private int earnedCredits;
  private String[] CoursesTaken;

  Transcript(int earnedCredits, String[] CoursesTaken) {
    this.earnedCredits = earnedCredits;
    this.CoursesTaken = CoursesTaken;
  }

  public Transcript clone() throws CloneNotSupportedException {
    return (Transcript) super.clone();
  }

  public String toString() {
    String toReturn = "";
    for (int i = 0; i < CoursesTaken.length; i++) {
      toReturn += CoursesTaken[i] + " ";
    }
    toReturn += earnedCredits;
    return toReturn;
  }
}
