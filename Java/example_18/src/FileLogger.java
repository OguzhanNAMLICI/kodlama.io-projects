public class FileLogger extends BaseLogger{
    @Override
    public void Log(String message) {
        System.out.println(message + " file logger called.");
    }
}
