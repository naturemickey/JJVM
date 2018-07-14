import classfile.ClassFile;
import classpath.Classpath;
import util.Strings;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
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
        String className = cmd.clazz.replace(".", "/");
        var cf = loadClass(className, cp);
        System.out.println(cmd.clazz);
        printClassInfo(cf);
    }

    private static ClassFile loadClass(String className, Classpath cp) {
        var classData = cp.readClass(className);
        return ClassFile.parser(classData);
    }

    private static void printClassInfo(ClassFile cf) {
        System.out.printf("version: %d.%d\n", (int)cf.majorVersion(), (int)cf.minorVersion());
        System.out.printf("constants count: %d\n", cf.constantPool().len());
        System.out.printf("access flags: 0x%x\n", (int)cf.accessFlags());
        System.out.printf("this class: %s\n", cf.className());
        System.out.printf("super class: %s\n", cf.superClassName());
        System.out.printf("interfaces: %s\n", Arrays.asList(cf.interfaceNames()));
        System.out.printf("fields count: %d\n", cf.fields().length);
        for (var f : cf.fields()) {
            System.out.printf("  %s\n", f.name());
        }
        System.out.printf("methods count: %d\n", cf.methods().length);
        for (var m : cf.methods()) {
            System.out.printf("  %s\n", m.name());
        }
    }

}
