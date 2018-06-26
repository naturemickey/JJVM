import classpath.Classpath;
import util.Strings;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception{
        var cmd = Cmd.parseCmd(args);

        if (cmd.versionFlag) {
            System.out.println("version 0.0.1");
        } else if (cmd.helpFlag || cmd.clazz == null) {
            Cmd.printUsage();
        } else {
            startJVM(cmd);
        }
    }

    private static void startJVM(Cmd cmd) {
        var cp = Classpath.parse(cmd.XjreOption, cmd.cpOption);
        System.out.printf("classpath:%s class:%s args:%s\n", cp, cmd.clazz, Arrays.asList(cmd.args));

        String className = cmd.clazz.replace(".", "/");
        byte[] classData = cp.readClass(className);

        System.out.printf("class data:%s\n", Strings.join(classData));
    }

}
