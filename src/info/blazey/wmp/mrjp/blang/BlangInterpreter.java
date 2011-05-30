package info.blazey.wmp.mrjp.blang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.antlr.runtime.RecognitionException;

public class BlangInterpreter {

	public static void main(String[] args) throws RecognitionException, FileNotFoundException {
		File input = new File(args[0]);
		Scanner scanner = new Scanner(input).useDelimiter("\\Z");
		String program = scanner.next();

		int result = BlangProgramEvaluator.execute(program);
		
		System.out.println("The result is: " + result);
	}
	
}
