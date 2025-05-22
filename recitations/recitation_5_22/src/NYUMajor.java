class NYUMajor {
  private String majorName;
  private NYUFaculty chair;
  private int requiredCredits;

  NYUMajor(String majorName, NYUFaculty chair, int requiredCredits) {
    this.majorName = majorName;
    this.chair = chair;
    this.requiredCredits = requiredCredits;
  }

  public String toString() {
    return "Chair: " + chair + " Required Credits: " + requiredCredits + " Major: " + majorName;
  }
}
