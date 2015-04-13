package Test;

import MapReducePackage.IMapper;

public class Map implements IMapper{

	@Override
	public String map(String input) {
		if(input.toLowerCase().contains("city"))
			return input;
		else
			return null;
	}
	
}