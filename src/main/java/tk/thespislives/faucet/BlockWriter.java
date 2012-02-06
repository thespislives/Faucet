package tk.thespislives.faucet;

import java.io.*;

public class BlockWriter {

    public static final String nameOfMod = "MyPlugin";
    public static final String nameOfBlock = "MyBlock";
    public static final String blockTexture = "Marble.png";
    public static final String blockMaterial = "Stone";
    public static final String nation = "tk";
    public static final String userName = "thespislives";
    public static final String packageName = nation + "." + userName + "." + nameOfBlock;
    public static final String ingredient1 = "boneMeal";
    public static final String ingredient2 = "boneMeal";
    public static final String ingredient3 = "boneMeal";
    public static final String ingredient4 = "boneMeal";
    public static final String ingredient5 = "cobblestone";
    public static final String ingredient6 = "boneMeal";
    public static final String ingredient7 = "boneMeal";
    public static final String ingredient8 = "boneMeal";
    public static final String ingredient9 = "boneMeal";
    public static final String uncraftable = "boneMeal";
    public static final String soundEffect = "sound.ogg";
    public static int friction = 0;
    public static int hardness = 0;
    public static int lightLevel = 0;
    public static boolean isOpaque = true;

    public static void main(String args[]) {

        try {
            // Create file
            FileWriter BLOCKLIST = new FileWriter(nameOfMod + ".java");
            BufferedWriter out = new BufferedWriter(BLOCKLIST);
            out.append(
                    "package "
                    + packageName
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
                    + "	public defaultPlugin(Plugin plugin) {\n"
                    + "		super(plugin, \""
                    + nameOfBlock
                    + "\",\n"
                    + "				\""
                    + blockTexture
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
            FileWriter BLOCKLIST = new FileWriter(nameOfBlock + ".java");
            BufferedWriter out = new BufferedWriter(BLOCKLIST);
            out.write(
                    "package "
                    + packageName
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
                    + nameOfBlock
                    + " extends JavaPlugin {"
                    + "\n"
                    + "	public static CustomBlock newBlock;\n"
                    + "\n"
                    + "	public void onDisable() {"
                    + "		Bukkit.getLogger().log(Level.INFO, \""
                    + nameOfMod
                    + " Disabled!\");\n"
                    + "			}\n"
                    + "	\n"
                    + "	public void onEnable() {"
                    + "		newBlock = new "
                    + nameOfMod
                    + "(this);\n"
                    + "		newBlock.setFriction(" + friction + ");"
                    + "		newBlock.setHardness(" + hardness + ");"
                    + "		newBlock.setLightLevel(" + lightLevel + ");"
                    + "		newBlock.setName(" + nameOfBlock + ");"
                    + "		newBlock.setOpaque(" + isOpaque + ");"
                    + "		newBlock.setStepSound(" + soundEffect + ");"
                    + "		Bukkit.getLogger().log(Level.INFO,"
                    + "				\""
                    + nameOfMod
                    + " by "
                    + userName
                    + " Enabled!\");\n"
                    + "		SpoutItemStack result = new SpoutItemStack("
                    + nameOfBlock
                    + ".newBlock, 1);\n"
                    + "		newBlock.setItemDrop(result);"
                    + "		SpoutShapedRecipe recipe = new SpoutShapedRecipe(result);\n"
                    + "		recipe.shape(\"ABC\", \"DEF\", \"GHI\")\n;"
                    + "		recipe.setIngredient('A', MaterialData."
                    + ingredient1
                    + ");\n"
                    + "		recipe.setIngredient('B', MaterialData."
                    + ingredient2
                    + ");\n"
                    + "		recipe.setIngredient('C', MaterialData."
                    + ingredient3
                    + ");\n"
                    + "		recipe.setIngredient('D', MaterialData."
                    + ingredient4
                    + ");\n"
                    + "		recipe.setIngredient('E', MaterialData."
                    + ingredient5
                    + ");\n"
                    + "		recipe.setIngredient('F', MaterialData."
                    + ingredient6
                    + ");\n"
                    + "		recipe.setIngredient('G', MaterialData."
                    + ingredient7
                    + ");\n"
                    + "		recipe.setIngredient('H', MaterialData."
                    + ingredient8
                    + ");\n"
                    + "		recipe.setIngredient('I', MaterialData."
                    + ingredient9
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
            File file1 = new File(nameOfMod+".java");
            File file2 = new File(nameOfBlock+".java");
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
        }
    }
}