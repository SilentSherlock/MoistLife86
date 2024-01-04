package com.silent.moistlife86.core.controls;

import javafx.css.PseudoClass;
import javafx.scene.layout.Pane;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  12/06/2023
 */
public class Star extends Pane {

    private static final PseudoClass PSEUDO_CLASS_ACTIVATE = PseudoClass.getPseudoClass("activate");
    public Star() {
        getStyleClass().add("star");
    }

//    @Override
//    public String getUserAgentStylesheet() {
//        return Objects.requireNonNull(Star.class.getResource("/com.silent.moistlife86/controls/star.css")).toExternalForm();
//    }
}
