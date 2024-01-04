package com.silent.moistlife86.core.interfaces;

import com.silent.moistlife86.core.view.View;
import javafx.beans.property.StringProperty;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Version 0.0.1
 * Create on  23/04/2023
 */
public interface Routes {

    Routes setView(String view);

    void putAndGo(View View);

    Routes put(View View);

    View getView(String view);

    Routes nav(String key);

    StringProperty title();

    void reset();

}
