
public class NYUStudent extends NYUPerson implements Cloneable {

  public String SID;
  private NYUMajor major;
  public Transcript transcript;

  public NYUStudent(String inname, String inid) {
    name = inname;
    SID = inid;
  }

  public Transcript getTranscript() {
    return transcript;
  }

  public void setTranscript(Transcript transcript) {
    this.transcript = transcript;
  }

  public NYUMajor getMajor() {
    return major;
  }

  public void setMajor(NYUMajor major) {
    this.major = major;
  }

  public String toString() {
    return " Student Name: " + name + " ID: " + SID + " Major: " + major.toString() + " Transcript "
        + transcript.toString();
  }

  public void sendemail(String message) {
    // send an email with above message with priority normal
    System.out.println("NYUStudent class " + message);
  }

  public void sendemail(String message, int priority) {
    // send an email with above message with given priority
    System.out.println("NYUStudent class " + message + " " + Integer.toString(priority));
  }

  public NYUStudent clone() throws CloneNotSupportedException {
    NYUStudent newStudent;
    newStudent = (NYUStudent) super.clone();
    newStudent.transcript = this.transcript.clone();
    return newStudent;
  }
}
