package Test;

import MapReducePackage.IReducer;


public class Reduce implements IReducer {

		@Override
		public String reduce(String input) {
			return input;
		}
		
	}
