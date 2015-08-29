package Test;
import java.util.ArrayList;

import HDFSPackage.RequestResponse.*;


public class Tester {
	public static void main(String args[]) {
		ArrayList<Integer>a = new ArrayList<Integer>() ;
		a.add(10);a.add(100);a.add(210);
		ArrayList<DataNodeLocation> b = new ArrayList<DataNodeLocation>();
		b.add(new DataNodeLocation(10, 10));
		b.add(new DataNodeLocation(100, 20));
		

		ArrayList<DataNodeLocation> bc = new ArrayList<DataNodeLocation>();
		bc.add(new DataNodeLocation(100, 10));
		bc.add(new DataNodeLocation(10, 20));
		
		ArrayList<BlockLocations> c = new ArrayList<BlockLocations>();
		c.add(new BlockLocations(1010,b));
		c.add(new BlockLocations(100,bc));

		ArrayList<String> sa = new ArrayList<String>();
		sa.add("a.txt");
		sa.add("a.txt1");
		sa.add("a.txt2");
		WriteBlockRequest o = new WriteBlockRequest(new BlockLocations(82, bc),"Hello to Hell!".getBytes());
		WriteBlockRequest p = new WriteBlockRequest(o.toProto());
		
		System.out.println(new String(p.data));
		System.out.println(p.blockInfo.blockNumber);
		System.out.println(p.blockInfo.locations.get(0).ip);
	}

}
