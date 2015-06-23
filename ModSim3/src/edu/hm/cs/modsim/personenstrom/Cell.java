package edu.hm.cs.modsim.personenstrom;

public class Cell {

	private int row;
	private int col;
	private Pedestrian pedestrian;
	private Barrier barrier;
	private Target target;

	public Cell(int row, int col, Pedestrian pedestrian) {
		this.row = row;
		this.col = col;
		this.pedestrian = pedestrian;
		this.barrier = null;
		this.target = null;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public Pedestrian getPedestrian() {
		return pedestrian;
	}

	public void setPedestrian(Pedestrian pedestrian) {
		this.pedestrian = pedestrian;
	}

	public Barrier getBarrier() {
		return barrier;
	}

	public void setBarrier(Barrier barrier) {
		this.barrier = barrier;
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}
	
	public String toString() {
		return "[" + row + col + "]";
	}

	public boolean equals(Cell other) {
		return (this.getRow() == other.getRow() && this.getCol() == other
				.getCol()) ? true : false;
	}

	public void printToConsole(int sideLength) {
		if (this.barrier != null) {
			System.out.print("[+]");
		} else if (this.pedestrian != null) {
			System.out.print("[P]");
		} else if (this.target != null) {
			System.out.print("[T]");
		} else {
			System.out.print("[ ]");
		}
		if (sideLength - 1 == this.getCol()) {
			System.out.println();
		}
	}

	public boolean isOccupied() {
		return this.pedestrian != null || this.barrier != null;
	}
	
	public String guiToString(int sideLength,String result) {
		if (this.barrier != null) {
			result+="[+]";
		} else if (this.pedestrian != null) {
			result+="[p]";
		} else if (this.target != null) {
			result+="[T]";
		} else {
			result+="[ ]";
		}
		if (sideLength - 1 == this.getCol()) {
			result+="\n";
		}
		return result;
	}

}
