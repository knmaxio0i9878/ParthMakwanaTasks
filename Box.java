class RectDemo{
	float length,width;

	RectDemo(float length,float width){
		this.length = length;
		this.width = width;
	}
	void displayData(){
		System.out.println("The Length:"+length);
		System.out.println("The Width:"+width);
		System.out.println("The Area:"+(length+width));
	}

}

class BoxDemo extends RectDemo{

	float height;
	BoxDemo(float length,float width,float height){
		super(length,width);
		this.height = height;
	}
	void displayData(){
		super.displayData();
		System.out.println("The Height:"+height);
		System.out.println("The Volume:"+(length*width*height));
	}

}
class BoxColour extends BoxDemo{
	
	String colour;
	BoxColour(float length,float width,float height,String colour){
		super(length,width,height);
		this.colour = colour;
	}
	void displayData(){
		super.displayData();
		System.out.println("The Colour:"+colour);
	}


}
class Box {
	public static void main(String args[]){

		RectDemo r1 = new RectDemo(10,20);
		r1.displayData();
		
		BoxDemo b1 = new BoxDemo(29,45,50);
		b1.displayData();


		BoxColour bc = new BoxColour(12,32,43,"Yellow");
		bc.displayData();



	}
}