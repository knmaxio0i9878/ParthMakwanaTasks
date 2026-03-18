class CircleDemo{
	static final float pie=3.14f;
	CircleDemo(float radius){
		System.out.println("The Area of Circle:"+(pie*(radius*radius)));
	}
}
class Circle{

	public static void main(String []args){


	CircleDemo cd = new CircleDemo(3.0f);
	}
}