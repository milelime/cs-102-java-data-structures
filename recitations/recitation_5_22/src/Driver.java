class Driver {
  public static void main(String[] args) {
    NYUStudent alex = new NYUStudent("Alex", 123);
    alex.setTranscript(new Transcript(23, new String[] { "Math", "English" }));
    alex.setMajor(new NYUMajor("Physics", new NYUFaculty("Dr. Doom", 11234), 132));
    NYUStudent john = alex.clone();
    john.name = "John";
    john.SID = "1234";
  }
}
