/* This file was generated by SableCC (http://www.sablecc.org/). */

package Lexico.node;

import Lexico.analysis.*;

public final class TLcbrack extends Token
{
    public TLcbrack()
    {
        super.setText("{");
    }

    public TLcbrack(int line, int pos)
    {
        super.setText("{");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TLcbrack(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLcbrack(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TLcbrack text.");
    }
}