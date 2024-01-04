package com.silent.moistlife86.core;

import com.silent.moistlife86.core.impl.Layout;
import com.silent.moistlife86.core.interfaces.Routes;
import com.silent.moistlife86.core.impl.layout.Flow;
import com.silent.moistlife86.core.interfaces.ActionView;
import com.silent.moistlife86.core.model.SearchItem;
import com.silent.moistlife86.core.view.layout.SnackBar;
import com.silent.moistlife86.core.view.layout.Wrapper;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import org.jetbrains.annotations.ApiStatus;

import java.net.URL;
import java.util.logging.Logger;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Version 0.0.1
 * Create on  19/04/2023
 */
public interface Context {

    URL getResource(String res);

    Layout layout();

    void setLayout(Layout layout);

    Routes routes();

    Wrapper wrapper();

    Flow flow();

    Stage stage();

    ObservableList<SearchItem> searchItems();

    @ApiStatus.Experimental
    Logger logger();

    /*********************************************************
     *
     * Util methods
     *
     *******************************************************/

    SnackBar createSnackBar();

    void openLink(String uri);

    ActionView controllerOf(String view);

}
