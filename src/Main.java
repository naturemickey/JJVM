import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cmd cmd = Cmd.parseCmd(args);

        if (cmd.versionFlag) {
            System.out.println("version 0.0.1");
        } else if (cmd.helpFlag || cmd.clazz == null) {
            Cmd.printUsage();
        } else {
            startJVM(cmd);
        }
    }

    private static void startJVM(Cmd cmd) {
        System.out.println("classpath:" + cmd.cpOption + " class:" + cmd.clazz + " args:" + Arrays.asList(cmd.args));
    }

}
