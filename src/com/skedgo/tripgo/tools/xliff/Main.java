package com.skedgo.tripgo.tools.xliff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();

		// arg[0] destination path
		// arg[1] translations path
		// arg[2] Languages to generate separated by "#" (for example, en#es#de#fi#zh-Hant#zh-Hans)
		// arg[3] android file name (android_localizable_strings.xml)
		
		
		if(args != null && args.length == 4){
			String destinationStringPath = args[0] ;
			String translationsPath = args[1] ;
			String[] langsArray = args[2].split("#");
			String androidFileName = args[3] ;
			
			List<String> langs = new ArrayList<>(Arrays.asList(langsArray));
			
			StringsGeneratorUtils.getInstance().transformAllStrings(destinationStringPath,translationsPath,
					androidFileName, langs);			
			
		}else{
			throw new Error("Wrong parameters...");
		}
			
		System.out.println("Strings done! Time: " + (System.currentTimeMillis() - startTime) + "milisecs");
		
		
	}
	

}
