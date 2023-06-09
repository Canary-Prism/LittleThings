package canaryprism.littlethings.files;

public class Files {

    /**
     * Returns either the result of {@code %appdata%} for windows or Application Support for Macs
     * @return
     */
    public static String saveDirectory() {
        String workingDirectory;
        //here, we assign the name of the OS, according to Java, to a variable...
        String OS = (System.getProperty("os.name")).toUpperCase();
        if (OS.contains("WIN")) {
            workingDirectory = System.getenv("AppData");
        }
        else {
            //in either case, we would start in the user's home directory
            workingDirectory = System.getProperty("user.home");
            //if we are on a Mac, we are not done, we look for "Application Support"
            workingDirectory += "/Library/Application Support";
        }
        //we are now free to set the workingDirectory to the subdirectory that is our 
        //folder.
        return workingDirectory;
    }
}
