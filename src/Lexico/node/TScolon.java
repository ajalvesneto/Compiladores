/* This file was generated by SableCC (http://www.sablecc.org/). */

package Lexico.node;

import Lexico.analysis.*;

public final class TScolon extends Token
{
    public TScolon()
    {
        super.setText(";");
    }

    public TScolon(int line, int pos)
    {
        super.setText(";");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TScolon(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTScolon(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TScolon text.");
    }
}
