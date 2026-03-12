class RectDemo{
	int length,width;
	void setData(){
		length = 10;
		width = 30;
	}
	void setData(int length,int width){
		this.length = length;
		this.width = width;
	}
	void setData(int length){
		this.length = length;
	}
	void displayData(){
		System.out.println("The Area:"+(length+width));
	}

}
class Rect {
	public static void main(String args[]){

		RectDemo r1 = new RectDemo();
		r1.setData();
		r1.displayData();

		RectDemo r2 = new RectDemo();
		r2.setData(10,30);
		r2.displayData();

		RectDemo r3 = new RectDemo();
		r3.setData(90);
		r3.displayData();


	}
}