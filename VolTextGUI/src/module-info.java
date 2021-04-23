module VoltextGUI {
	
	requires java.desktop;
	requires javafx.base;
	requires javafx.graphics;
	requires javafx.controls;
	requires libraryVoltext;
	
	opens VolTEXTFX to javafx.graphics, javafx.fxml;
}
