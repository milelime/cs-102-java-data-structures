class Driver {
  public static void main(String[] args) {
    NYUStudent alex = new NYUStudent("Alex", "123");
    alex.setTranscript(new Transcript(23, new String[] { "Math", "English" }));
    // try {
    //
    // } catch (Exception e) {
    // System.err.println(e);
    // }
    alex.setMajor(new NYUMajor("Physics", new NYUFaculty("Dr. Doom", "11234"), 132));
    NYUStudent john = null;
    try {
      john = alex.clone();
    } catch (Exception e) {
      System.err.println(e);
    }
    john.name = "John";
    john.SID = "1234";
    System.out.println(john.toString());
    System.out.println(alex.toString());
  }
}
