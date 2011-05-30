package info.blazey.wmp.mrjp.blang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.antlr.runtime.RecognitionException;

/**
 * Blang programming language interpreter.
 * Github repository: https://github.com/blazeyo/Blang
 * 
 * @author Błażej Owczarczyk
 */
public class BlangInterpreter {

	public static void main(String[] args) {
		System.out.println(getWelcomeMessage());
		
		if (args.length != 1) {
			System.out.println("No input file specified.");
		} else {
			File input = new File(args[0]);
			Scanner scanner = null;
			try {
				scanner = new Scanner(input).useDelimiter("\\Z");
			} catch (FileNotFoundException e1) {
				System.out.println("Error:");
				System.out.println("File not found.");
			}
			String program = scanner.next();

			int result = 0;
			try {
				result = BlangProgramEvaluator.execute(program);
				System.out.println(program + "\n");
				System.out.println("The result is: " + result);
			} catch (RecognitionException e) {
				System.out.println("Recognition exception:");
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static String getWelcomeMessage() {
		return  "*************************************************\r\n" +
				"* Blang programming language interpreter        *\r\n" +
				"*                                               *\r\n" +
				"* Github: https://github.com/blazeyo/Blang      *\r\n" +
				"* Author: Błażej Owczarczyk                     *\r\n" +
				"*************************************************\r\n";
	}
	
}
