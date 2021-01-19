public class House {
	Room[] rooms;
	String tipo;
	int mod;
	
	public House(String tipo) {
		this.tipo = tipo;
		this.rooms = new Room[8];
		this.mod = 4;
	}
	
	public House(String tipo, int roomsNum, int mod) {
		this.tipo = tipo;
		this.rooms = new Room[roomsNum];
		this.mod = mod;
	}
	
	public void addRoom(Room r) {

		for(int i=0; i<this.rooms.length;i++) {
			if(this.rooms[i]==null) {
				this.rooms[i] = new Room(r.infEsq,r.supDir,r.tipo);
				return;
			}
		}
		
		Room[] temp = new Room[rooms.length];
		System.arraycopy(rooms, 0, temp, 0, rooms.length);
		
		rooms = new Room[rooms.length+mod];
		System.arraycopy(temp, 0, rooms, 0, temp.length);
		
		for(Room t : this.rooms) {
			if(t == null) {
				t = new Room(r.infEsq,r.supDir,r.tipo);
				return;
			}
		}
	}
	
	public int size() {
		int n=0;
		
		for(Room r : this.rooms) {
			if(r != null) {n++;}
		}
			
		return n;
	}
	
	public int maxSize() {
		return this.rooms.length;
	}
	
	public Room room(int index) {
		return this.rooms[index];
	}
	
	public double area() {
		double area=0;
		for(Room r : rooms) {
			if(r == null)	break;
			area += r.area();
		}
		
		return area;
	}
	
	public RoomTypeCount[] getRoomTypeCounts() {
		RoomTypeCount[] temp = new RoomTypeCount[this.rooms.length];
		int count=0;//contador de roomtypeCOunt reamente necessarios, usado para criação posterior de array de tamanho correto 

		for(int j=0;j<this.rooms.length;j++) {
			if(rooms[j]==null) {break;}
			for(int i=0;i<temp.length;i++) {
				RoomTypeCount tp = temp[i];
				if(temp[i]!=null && temp[i].type.equals(rooms[j].tipo)) {
					temp[i].addOne();
					break;
				} else if(temp[i]==null){
					temp[i] = new RoomTypeCount(rooms[j].tipo);
					count++;
					break;
				}
			}
		}		
		
		RoomTypeCount[] roomTypes = new RoomTypeCount[count];
		
		System.arraycopy(temp, 0, roomTypes, 0, count);
		
		return roomTypes;
	}
	
	public double averageRoomDistance() {
		double dist=0, distAvg=0;
		int count=0;
		
		for(int i=0;i<rooms.length-2;i++) {
			if(rooms[i]==null) break;
			for(int j=1;j<rooms.length-1;j++) {
				if(rooms[j]==null) break;
				
				dist += rooms[i].geomCenter().distTo(rooms[j].geomCenter());
				count++;
			}
		}
		
		distAvg = dist/count;
		
		return distAvg;
	}
}

class RoomTypeCount {
	String type;
	int count;
	
	public RoomTypeCount(String type) {
		this.type=type;
		this.count=1;
	}
	
	public void addOne()
	{
		this.count++;
	}
}
