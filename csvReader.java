package com.csv;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class csvReader {
   public static void main(String [] args) throws IOException
   {
	   String splitBy= ",";
	   String line;
	   BufferedReader bfr =new BufferedReader(new FileReader("/Users/eone/Documents/programming/Solving/src/com/csv/slatecodetest.csv"));
	   String cvsSplitBy = ",";
	    ArrayList<Integer> results = new ArrayList<>();
	    String  l= "";
	    int index = 1;
	    String output = String.format("%s\t%s", "id", "column");
        
        System.out.println(output);
	    while ((line = bfr.readLine()) != null) {

	    	
            // use comma as separator
            String[] column = line.split(cvsSplitBy);
            
            System.out.println(  column[4] + "\t" + column[5] );

        }

	  
	    }
	  }


