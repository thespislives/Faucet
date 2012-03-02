package tk.thespislives.faucet;

import java.io.*;

public class ItemWriter {

    public String nameOfMod;
    public String nameOfItem;
    public String itemTexture;
    public String itemMaterial;
    public String nation;
    public String userName;
    public String packageName = nation + "." + userName + "." + nameOfItem;
    public String ingredient1;
    public String ingredient2;
    public String ingredient3;
    public String ingredient4;
    public String ingredient5;
    public String ingredient6;
    public String ingredient7;
    public String ingredient8;
    public String ingredient9;
    public String uncraftable;



    public void create() {

        //TODO: ITEMWRITER PRINT STATEMENTS
        /*
        try {
            // Create file
            FileWriter BLOCKLIST = new FileWriter(nameOfMod + ".java");
            BufferedWriter out = new BufferedWriter(BLOCKLIST);
            out.append("");
            // Close the output stream
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
        try {
            // Create file
            FileWriter BLOCKLIST = new FileWriter(nameOfItem + ".java");
            BufferedWriter out = new BufferedWriter(BLOCKLIST);
            out.write("");
            // Close the output stream
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

        try {
            //Create folder
            boolean success = (new File(nameOfMod)).mkdir();
            if (success) {
                System.out.println("Directory: "
                        + nameOfMod + " created");
            }

        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

        try {
            // File (or directory) to be moved
            File file1 = new File(nameOfMod + ".java");
            File file2 = new File(nameOfItem + ".java");
            // Destination directory
            File dir = new File(nameOfMod);
            // Move file to new directory
            boolean success = file1.renameTo(new File(dir, file1.getName()));
            if (!success) {
                // File was not successfully moved
            }

            success = file2.renameTo(new File(dir, file2.getName()));
            if (!success) {
                // File was not successfully moved
            }

        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }*/
    }
    
}