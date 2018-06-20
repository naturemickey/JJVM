public class Cmd {
    public boolean helpFlag;
    public boolean versionFlag;
    public String cpOption = "";
    public String clazz;
    public String[] args = {};

    public static Cmd parseCmd(String[] args) {
        Cmd cmd = new Cmd();

        for (int i = 0; i < args.length; ++i) {
            String arg = args[i];
            if (arg.equals("-help") || arg.equals("-?")) {
                cmd.helpFlag = true;
            } else if (arg.equals("-version")) {
                cmd.versionFlag = true;
            } else if (arg.equals("-cp") || arg.equals("-classpath")) {
                arg = args[++i];
                cmd.cpOption = arg;
            }
        }

        if (args.length > 0) {
            cmd.clazz = args[0];
            cmd.args = new String[args.length - 1];
            for (int i = 1; i < args.length; ++i) {
                cmd.args[i - 1] = args[i];
            }
        }

        return cmd;
    }

    public static void printUsage() {
        System.out.println("Usage: java [-options] class [args...]");
    }
}
