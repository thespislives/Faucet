package tk.thespislives.faucet;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class TextureFilter extends FileFilter {
	
	@Override
	public boolean accept(File file) {
		// Allow only directories, or files with ".txt" extension
		return file.isDirectory() || file.getAbsolutePath().endsWith(".png");
	}
	
	@Override
	public String getDescription() {
		// This description will be displayed in the dialog,
		// hard-coded = ugly, should be done via I18N
		return "PNG image files (*.png)";
	}
}