import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String currentDirectory;
        String projectName;
        String mainClassName;

        if(args.length < 2) {
            System.out.println("\nInvalid parameters. You must at least provide the project name.");
            return;
        } else if(args.length == 2) {
            currentDirectory = args[0];
            projectName = args[1];
            mainClassName = "Main";
        } else {
            currentDirectory = args[0];
            projectName = args[1];
            mainClassName = args[2];
        }
        String projectDirectory = createProjectFolder(currentDirectory, projectName);
        if(projectDirectory != null){
            try {
                boolean createdFile = createMainClassFile(projectDirectory, mainClassName);
                if(createdFile){
                    System.out.println("\nJava project created with success! At:\n" + projectDirectory);
                    System.exit(0);
                } else {
                    System.out.println("\nError while trying to create the main class file.");
                    System.exit(1);
                }
            } catch (IOException error) {
                System.out.println("\nError while trying to create the main class file.");
                System.exit(1);
            }
        } else {
            System.out.println("\nError while trying to create the project folder.");
            System.exit(2);
        }

    }

    private static String createProjectFolder(String currentDirectory, String projectName) {
        String path = currentDirectory + "/" + projectName;
        File file = new File(path);
        boolean createdFolder = file.mkdir();
        if(createdFolder) return file.getAbsolutePath();
        return null;
    }

    private static boolean createMainClassFile(String projectDirectory, String mainClassName) throws IOException {
        mainClassName = Character.toUpperCase(mainClassName.charAt(0)) + mainClassName.substring(1);
        String path = projectDirectory + "/" + mainClassName + ".java";
        File file = new File(path);
        if(file.createNewFile()){
            FileWriter writer = new FileWriter(file);
            String javaCode = createJavaCode(mainClassName);
            writer.write(javaCode);
            writer.close();
            return true;
        }
        return false;
    }

    private static String createJavaCode(String mainClassName){
        String code = "public class " + mainClassName + " {\n";
        code += "   public static void main(String[] args) {\n";
        code += "   }\n";
        code += "}";
        return code;
    }
}
