package essais;

import entites.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle(4,7);
		Rectangle rectangle2 = new Rectangle(6,10);
		
		System.out.println(rectangle1.perimetre());
		System.out.println(rectangle2.perimetre());
		System.out.println(rectangle1.surface());
		System.out.println(rectangle2.surface());
	}

}
