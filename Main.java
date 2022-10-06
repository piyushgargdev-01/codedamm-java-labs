class DatabaseService {

  private static DatabaseService obj;

  private DatabaseService() {
    System.out.println("Open a connection with DB");
  }

  public static DatabaseService getInstance() {
    if (obj == null) obj = new DatabaseService();
    return obj;
  }

  public void getDataFromTables() {
    System.out.println("Getting data from db");
  }

  public void putDataInDatabase() {
    System.out.println("Putting data in db");
  }
}

public class Main {

  public static void main(String args[]) {
    DatabaseService db = DatabaseService.getInstance();
    db = DatabaseService.getInstance();
    db = DatabaseService.getInstance();

    db.getDataFromTables();
    db.putDataInDatabase();
  }
}
