module co.edu.uniquindio.poo.empresajfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo.empresajfx to javafx.fxml;
    opens co.edu.uniquindio.poo.empresajfx.ViewController to javafx.fxml;
    opens co.edu.uniquindio.poo.empresajfx.Controller to javafx.fxml;

    exports co.edu.uniquindio.poo.empresajfx;
    exports co.edu.uniquindio.poo.empresajfx.ViewController;
}
