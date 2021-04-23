module VoltextGUI {
	
	requires library.voltext;
	requires java.desktop;
	requires javafx.base;
	requires javafx.graphics;
	requires javafx.controls;
	
	opens VolTEXTFX to javafx.graphics, javafx.fxml;
}
