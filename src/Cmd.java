public class Cmd {
    public boolean helpFlag;
    public boolean versionFlag;
    public String cpOption;
    public String clazz;
    public String[] args;

    public static Cmd parseCmd(String[] args) {
        Cmd cmd = new Cmd();

        cmd.clazz = args[0];

        return cmd;
    }

    public static void printUsage() {
        System.out.println("Usage: java [-options] class [args...]");
    }
}
