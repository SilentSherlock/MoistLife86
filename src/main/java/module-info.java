module com.silent.moistlife {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
//    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
//    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires org.jetbrains.annotations;
    requires java.logging;

    opens com.silent.moistlife86 to javafx.fxml;
    exports com.silent.moistlife86;
    exports com.silent.moistlife86.controllers;
    opens com.silent.moistlife86.controllers to javafx.fxml;
    exports com.silent.moistlife86.core.interfaces;
    opens com.silent.moistlife86.core.interfaces to javafx.fxml;
}