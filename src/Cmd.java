import java.util.ArrayList;

public class Cmd {
    public boolean helpFlag;
    public boolean versionFlag;
    public String cpOption;
    public String XjreOption;
    public String clazz;
    public String[] args = {};

    public static Cmd parseCmd(String[] args) {
        var cmd = new Cmd();

        var argList = new ArrayList<String>();

        for (int i = 0; i < args.length; ++i) {
            var arg = args[i];
            if (arg.equals("-help") || arg.equals("-?")) {
                cmd.helpFlag = true;
            } else if (arg.equals("-version")) {
                cmd.versionFlag = true;
            } else if (arg.equals("-cp") || arg.equals("-classpath")) {
                cmd.cpOption = args[++i];
            } else if (arg.equals("-Xjre")) {
                cmd.XjreOption = args[++i];
            } else {
                argList.add(arg);
            }
        }

        if (argList.size() > 0) {
            cmd.clazz = argList.get(0);
            cmd.args = new String[argList.size() - 1];
            for (int i = 1; i < argList.size(); ++i) {
                cmd.args[i - 1] = args[i];
            }
        }

        return cmd;
    }

    public static void printUsage() {
        System.out.println("Usage: java [-options] class [args...]");
    }
}
