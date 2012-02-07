package tk.thespislives.faucet;

import java.io.*;

public class BlockWriter {

    public String nameOfMod;
    public String nameOfBlock;
    public String blockTexture;
    public String blockMaterial;
    public String nation;
    public String userName;
    public String packageName = nation + "." + userName + "." + nameOfBlock;
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

    public void create(){

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
                    + "		newBlock.setOpaque(" + opaque + ");"
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