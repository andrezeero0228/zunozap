package com.zunozap.api;

import static com.zunozap.Log.err;
import static com.zunozap.Log.out;

import java.io.File;
import java.net.URL;

import com.zunozap.Engine;
import com.zunozap.ZFile;

import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public abstract class Plugin {

    public final File folder = new File(new ZFile("plugins"), getInfo().name());

    public PluginInfo getInfo() {
        return getClass().getAnnotation(PluginInfo.class);
    }

    public static final void out(Object o) {
        out.log(o);
    }

    public static final void err(Object o) {
        err.log(o);
    }

    public void onTabCreate(Tab tab){/**/}

    public void onURLChange(Engine e, TextField field, Object oldURL, URL newURL) {/**/}

    public void onLoad(Stage stage, Scene scene, TabPane tabBar){/**/}

    @Deprecated
    public void onPopup(boolean bad){/**/}

    @Deprecated
    public void onPopup(String popupText) { onPopup(false); }

}