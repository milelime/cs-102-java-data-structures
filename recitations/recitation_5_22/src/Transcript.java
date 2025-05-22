class Transcript {
  private int earnedCredits;
  private String[] CoursesTaken;

  Transcript(int earnedCredits, String[] CoursesTaken) {
    this.earnedCredits = earnedCredits;
    this.CoursesTaken = CoursesTaken;
  }

  public Transcript clone() {
    return (Transcript) super.clone();
  }
}
