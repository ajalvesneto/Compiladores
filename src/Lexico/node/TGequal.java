/* This file was generated by SableCC (http://www.sablecc.org/). */

package Lexico.node;

import Lexico.analysis.*;

public final class TGequal extends Token
{
    public TGequal()
    {
        super.setText(">=");
    }

    public TGequal(int line, int pos)
    {
        super.setText(">=");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TGequal(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTGequal(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TGequal text.");
    }
}
