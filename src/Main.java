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
        System.out.printf("class data:%s\n", Strings.join(classData));
    }

    private static ClassFile loadClass(String className, Classpath cp) {
        var classData = cp.readClass(className);
        return ClassFile.parser(classData);
    }

    private static void printClassInfo(ClassFile cf) {
        System.out.printf("version: %v.%v\n", cf.majorVersion(), cf.minorVersion());
        System.out.printf("constants count: %v\n", cf.constantPool().len());
        System.out.printf("access flags: 0x%x\n", cf.accessFlags());
        System.out.printf("this class: %v\n", cf.className());
        System.out.printf("super class: %v\n", cf.superClassName());
        System.out.printf("interfaces: %v\n", cf.interfaceNames());
        System.out.printf("fields count: %v\n", cf.fields().length);
        for (var f : cf.fields()) {
            System.out.printf("  %s\n", f.name());
        }
        System.out.printf("methods count: %v\n", cf.methods().length);
        for (var m : cf.methods()) {
            System.out.printf("  %s\n", m.name());
        }
    }

}
