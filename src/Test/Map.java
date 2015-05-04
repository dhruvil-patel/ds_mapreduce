package Test;

import MapReducePackage.IMapper;

public class Map implements IMapper{

	@Override
	public String map(String input) {
		if(input.contains("world"))
			return input;
		else
			return null;
	}
	
}