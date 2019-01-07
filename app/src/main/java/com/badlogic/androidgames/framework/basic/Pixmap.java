package com.badlogic.androidgames.framework.basic;

import com.badlogic.androidgames.framework.basic.Graphics.PixmapFormat;

public interface Pixmap {
    public int getWidth();

    public int getHeight();

    public PixmapFormat getFormat();

    public void dispose();
}
