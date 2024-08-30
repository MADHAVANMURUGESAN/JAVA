import java.io.File;

public class filepath {
    public static void main(String[] args) {
        String directoryPath = "A:\\resume\\new\\madhavan"; // Replace with your desired directory path
        File directory = new File(directoryPath);
        if (!directory.exists()) { // Check if directory already exists
            boolean created = directory.mkdirs(); // Create directory if it does not exist
            if (created) {
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Failed to create directory.");
            }
        } else {
            System.out.println("Directory already exists.");
        }
    }
}

