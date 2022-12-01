public class DatabaseLogger extends BaseLogger{

    @Override
    public void Log(String message) {
        System.out.println(message + " database logger called.");
    }
}
