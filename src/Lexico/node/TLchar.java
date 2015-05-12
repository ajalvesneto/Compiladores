/* This file was generated by SableCC (http://www.sablecc.org/). */

package Lexico.node;

import Lexico.analysis.*;

public final class TLchar extends Token
{
    public TLchar()
    {
        super.setText("char");
    }

    public TLchar(int line, int pos)
    {
        super.setText("char");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TLchar(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLchar(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TLchar text.");
    }
}