package tk.thespislives.faucet;

import java.io.*;

public class BlockWriter {

    public String blockMaterial;
    public String soundEffect;
    public int friction;
    public int hardness;
    public int lightLevel;
    public boolean opaque;
    public boolean grows;
    public boolean gravity;
    public boolean entities;
    public boolean burns;
    public boolean canBreak;

    public void create() {

        try {
            // Create file
            FileWriter BLOCKLIST = new FileWriter(BasicWriter.nameOfMod + ".java");
            BufferedWriter out = new BufferedWriter(BLOCKLIST);
            out.append(
                    "package "
                    + BasicWriter.packageName
                    + ";\n"
                    + "\n"
                    + "import org.bukkit.World;\n"
                    + "import org.bukkit.block.BlockFace;\n"
                    + "import org.bukkit.entity.Entity;\n"
                    + "import org.bukkit.entity.LivingEntity;\n"
                    + "import org.bukkit.plugin.Plugin;\n"
                    + "import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;\n"
                    + "import org.getspout.spoutapi.player.SpoutPlayer;\n"
                    + "\n"
                    + "public class defaultPlugin extends GenericCubeCustomBlock {\n"
                    + "    public defaultPlugin(Plugin plugin) {\n"
                    + "		super(plugin, \""
                    + BasicWriter.nameOfBlock
                    + "\",\n"
                    + "				\""
                    + BasicWriter.texture
                    + "\", 16);\n"
                    + "	}\n"
                    + "\n"
                    + "	public void onNeighborBlockChange(World world, int x, int y, int z,\n"
                    + "			int changedId) {\n"
                    + "	}\n"
                    + "\n"
                    + "	public void onBlockPlace(World world, int x, int y, int z) {\n"
                    + "	}\n"
                    + "\n"
                    + "	public void onBlockPlace(World world, int x, int y, int z,\n"
                    + "			LivingEntity living) {\n"
                    + "	}\n"
                    + "\n"
                    + "	public void onBlockDestroyed(World world, int x, int y, int z) {\n"
                    + "	}\n"
                    + "\n"
                    + "	public boolean onBlockInteract(World world, int x, int y, int z,\n"
                    + "			SpoutPlayer player) {\n"
                    + "		return true;\n"
                    + "	}\n"
                    + "\n"
                    + "	public void onEntityMoveAt(World world, int x, int y, int z, Entity entity) {\n"
                    + "	}\n"
                    + "\n"
                    + "	public void onBlockClicked(World world, int x, int y, int z,\n"
                    + "			SpoutPlayer player) {\n"
                    + "	}\n"
                    + "\n"
                    + "	public boolean isProvidingPowerTo(World world, int x, int y, int z,\n"
                    + "			BlockFace face) {\n" + "		return false;\n" + "	}\n"
                    + "}\n");
            // Close the output stream
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
        try {
            // Create file
            FileWriter BLOCKLIST = new FileWriter(BasicWriter.nameOfBlock + ".java");
            BufferedWriter out = new BufferedWriter(BLOCKLIST);
            out.write(
                    "package "
                    + BasicWriter.packageName
                    + ";\n"
                    + "\n"
                    + "import java.util.logging.Level;\n"
                    + "\n"
                    + "import org.bukkit.Bukkit;\n"
                    + "import org.bukkit.plugin.java.JavaPlugin;\n"
                    + "import org.getspout.spoutapi.SpoutManager;\n"
                    + "import org.getspout.spoutapi.inventory.SpoutItemStack;\n"
                    + "import org.getspout.spoutapi.inventory.SpoutShapedRecipe;\n"
                    + "import org.getspout.spoutapi.material.*;\n"
                    + "\n"
                    + "public class "
                    + BasicWriter.nameOfBlock
                    + " extends JavaPlugin {"
                    + "\n"
                    + "	public static CustomBlock newBlock;\n"
                    + "\n"
                    + "	public void onDisable() {"
                    + "		Bukkit.getLogger().log(Level.INFO, \""
                    + BasicWriter.nameOfMod
                    + " Disabled!\");\n"
                    + "			}\n"
                    + "	\n"
                    + "	public void onEnable() {"
                    + "		newBlock = new "
                    + BasicWriter.nameOfMod
                    + "(this);\n"
                    + "		newBlock.setFriction(" + friction + ");"
                    + "		newBlock.setHardness(" + hardness + ");"
                    + "		newBlock.setLightLevel(" + lightLevel + ");"
                    + "		newBlock.setName(" + BasicWriter.nameOfBlock + ");"
                    + "		newBlock.setOpaque(" + opaque + ");"
                    + "		newBlock.setStepSound(" + soundEffect + ");"
                    + "		Bukkit.getLogger().log(Level.INFO,"
                    + "				\""
                    + BasicWriter.nameOfMod
                    + " by "
                    + BasicWriter.userName
                    + " Enabled!\");\n"
                    + "		SpoutItemStack result = new SpoutItemStack("
                    + BasicWriter.nameOfBlock
                    + ".newBlock, 1);\n"
                    + "		newBlock.setItemDrop(result);"
                    + "		SpoutShapedRecipe recipe = new SpoutShapedRecipe(result);\n"
                    + "		recipe.shape(\"ABC\", \"DEF\", \"GHI\")\n;"
                    + "		recipe.setIngredient('A', MaterialData."
                    + BasicWriter.ingredient1
                    + ");\n"
                    + "		recipe.setIngredient('B', MaterialData."
                    + BasicWriter.ingredient2
                    + ");\n"
                    + "		recipe.setIngredient('C', MaterialData."
                    + BasicWriter.ingredient3
                    + ");\n"
                    + "		recipe.setIngredient('D', MaterialData."
                    + BasicWriter.ingredient4
                    + ");\n"
                    + "		recipe.setIngredient('E', MaterialData."
                    + BasicWriter.ingredient5
                    + ");\n"
                    + "		recipe.setIngredient('F', MaterialData."
                    + BasicWriter.ingredient6
                    + ");\n"
                    + "		recipe.setIngredient('G', MaterialData."
                    + BasicWriter.ingredient7
                    + ");\n"
                    + "		recipe.setIngredient('H', MaterialData."
                    + BasicWriter.ingredient8
                    + ");\n"
                    + "		recipe.setIngredient('I', MaterialData."
                    + BasicWriter.ingredient9
                    + ");\n"
                    + "		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);"
                    + "	}\n" + "}\n");
            // Close the output stream
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

        try {
            //Create folder
            boolean success = (new File(BasicWriter.nameOfMod)).mkdir();
            if (success) {
                System.out.println("Directory: "
                        + BasicWriter.nameOfMod + " created");
            }

        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

        try {
            // File (or directory) to be moved
            File file1 = new File(BasicWriter.nameOfMod + ".java");
            File file2 = new File(BasicWriter.nameOfBlock + ".java");
            // Destination directory
            File dir = new File(BasicWriter.nameOfMod);
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
        }
    }
}