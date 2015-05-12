import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import Lexico.lexer.Lexer;
import Lexico.lexer.LexerException;
import Lexico.node.EOF;
import Lexico.node.Token;

public class Main {
	public static void main(String[] args) throws IOException {
		if (args.length > 0) {
			Lexer lexer = new Lexer(new PushbackReader(new FileReader(args[0])));
			analiseLexica(lexer);
		} else {
			System.out.println("Sem arquivos de entrada");
		}
	}

	public static void analiseLexica(Lexer lexer) {
		Token token = null;
		boolean analiseCompleta = false;
		try {
			while (!((token = lexer.next()) instanceof EOF)) {
				if (!token.getClass().getSimpleName().equals("TSpace")){
					System.out.print(token.getClass().getSimpleName());
					System.out.print(" ");
					if (token.getClass().getSimpleName().equals("TScolon"))
						System.out.println("");

				}
			}
			analiseCompleta = true;
		} catch(LexerException e) {
			System.out.print(e.getMessage().substring(0, e.getMessage().length()) + " ");
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}	