public class ConsoleLogger extends BaseLogger{
    @Override
    public void Log(String message) {
        System.out.println(message + " console logger called.");
    }
}
