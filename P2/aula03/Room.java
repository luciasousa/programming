public class Room {
	
	String tipo;
	Point infEsq;
	Point supDir;
	
	public Room (Point p1, Point p2, String tipo) {
		
		this.tipo = tipo;
		this.infEsq = p1;
		this.supDir = p2;
	}
	
	public String roomType() {
		
		return this.tipo;
	}
	
	public Point bottomLeft() {
		
		return this.infEsq;
	}
	
	public Point topRight() {
		
		return this.supDir;
	}
	
	public Point geomCenter() {
		
		//~ double x, y;
		
		//~ x = Math.abs((supDir.x() - infEsq.x()));
		//~ y = Math.abs((supDir.y() - infEsq.y()));
		
		//~ Point p = new Point();
		
		Point p = this.infEsq.halfWayTo(this.supDir);
		
		return p;
	}
	
	public double area() {
		
		double x = Math.sqrt((supDir.x() - infEsq.x()));
		double y = Math.sqrt((supDir.y() - infEsq.y()));
		
		double area = x*y;
		
		return area;
	}
}
