package com.nasa.mars.model;
 
import com.nasa.mars.enums.CardinalPointsEnum;
 
public class MarsRobot {
 	
 	private int x;
 	private int y; 	
 	private int xMax;
 	private int yMax;
 	private CardinalPointsEnum cardinalPoint;
 	
 	public MarsRobot(int x, int y, int xMax, int yMax, CardinalPointsEnum cardinalPoint) {
 		this.x = x;
 		this.y = y; 		
 		this.xMax = xMax;
 		this.yMax = yMax;
 		this.cardinalPoint = cardinalPoint;
 	}
 	
 	public int getX() {
 		return x;
 	}
 
 	public void setX(int x) {
 		this.x = x;
 	}
 
 	public int getY() {
 		return y;
 	}
 
 	public void setY(int y) {
 		this.y = y;
 	}
 
 	public int getXMax() {
 		return xMax;
 	}
 
 	public int getYMax() {
 		return yMax;
 	}
 	
 	public CardinalPointsEnum getCardinalPoint() {
 		return cardinalPoint;
 	}
 
 	public void setCardinalPoint(CardinalPointsEnum cardinalPoint) {
 		this.cardinalPoint = cardinalPoint;
 	}
 
 	public String getPosition() {
 		return "(" + this.getX() + ", " + this.getY() + ", " + this.getCardinalPoint().getCode() + ")";
 	}
 
}