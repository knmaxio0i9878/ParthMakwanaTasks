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

		try{
			RectDemo r[] = new RectDemo[3];
			for(int i=0;i<3;i++){
				r[i].setData(10,20);
				r[i].displayData();
			}
		}/
		ca tch(NullPointerExcpetion e){
			9
			System.out.println("Null Pointer Exception");
		}
		catch(Exception e){
			9
			System.out.println("Null Pointer Exception");
		}
		
/*
		RectDemo r2 = new RectDemo();
		r2.setData(10,30);
		r2.displayData();

		RectDemo r3 = new RectDemo();
		r3.setData(90);
		r3.displayData(); */


	}
}