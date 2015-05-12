/* This file was generated by SableCC (http://www.sablecc.org/). */

package Lexico.node;

import Lexico.analysis.*;

public final class TIdentificador extends Token
{
    public TIdentificador(String text)
    {
        setText(text);
    }

    public TIdentificador(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TIdentificador(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIdentificador(this);
    }
}