/* An interpreter for the simple math language we all espouse. */ 
package Lexico.interpret; 
  
import Lexico.analysis.DepthFirstAdapter;
import Lexico.node.AProgram;
  
public class Interpreter extends DepthFirstAdapter { 
  
   public void caseAProgram(AProgram node) { 
      String lhs = node.getLeft().getText().trim(); 
      String rhs = node.getRight().getText().trim(); 
      int result = (new Integer(lhs)).intValue() + (new Integer(rhs)).intValue(); 
      System.out.println(lhs + "+" + rhs + "=" + result); 
   } 
}