public class EmployerException extends Exception{
    private employe employe;

    public EmployerException() {
    }
    
    public EmployerException(String message) {
      super(message);
    }
    
    public EmployerException(String message, employe employe) {
      super(message);
      this.employe = employe;
    }
    
}
