

public class Building{
	
	String buildingName,colorOfBuilding;
	int numberOfFloors, roomsPerFloor;	
	
	public void setname(String name){
		buildingName=name;
	}
	
	public void setcolor(String color){
		colorOfBuilding=color;
	}
	
	public void setfloors(int floors){
		numberOfFloors=floors;
	}
	
	public void setrooms(int rooms){
		roomsPerFloor=rooms;
	}
	
	public static void buildingsList(Building[] aListOfBuildings){
		for (Building s:aListOfBuildings)
		System.out.println(s.buildingName+" is a "+s.colorOfBuilding+" building and has "+s.numberOfFloors*s.roomsPerFloor+" rooms.");
	}
	

	public static void main(String[] args){
		Building[] listOfBuildings=new Building[5];
		
		Building b1=new Building();
		b1.setname("Mukeu");
		b1.setcolor("Grey");
		b1.setfloors(4);
		b1.setrooms(4);
		
		Building b2=new Building();
		b2.setname("Pritt");
		b2.setcolor("Red & Orange");
		b2.setfloors(6);
		b2.setrooms(2);
		
		Building b3=new Building();
		b3.setname("Savannah");
		b3.setcolor("Golden");
		b3.setfloors(5);
		b3.setrooms(2);
		
		Building b4=new Building();
		b4.setname("Spring");
		b4.setcolor("Brown");
		b4.setfloors(1);
		b4.setrooms(1);
		
		Building b5=new Building();
		b5.setname("The Camber");
		b5.setcolor("Amber");
		b5.setfloors(3);
		b5.setrooms(3);
		
		listOfBuildings[0]=b1;
		listOfBuildings[1]=b2;
		listOfBuildings[2]=b3;
		listOfBuildings[3]=b4;
		listOfBuildings[4]=b5;
		
		buildingsList(listOfBuildings);
	}
}
		
		
