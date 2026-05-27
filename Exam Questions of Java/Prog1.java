class Prog1{
    public static void main(String[] args) {
        
        float num1 = Float.parseFloat(args[0]);
        float num2 = Float.parseFloat(args[2]);
        if(args[1].equals("+")){
            System.out.println("Addition:"+(num1+num2));
        }
        else if(args[1].equals("-")){
            System.out.println("Addition:"+(num1-num2));
        }
        else if(args[1].equals("*")){
            System.out.println("Addition:"+(num1*num2));
        }
        else if(args[1].equals("/")){
            System.out.println("Addition:"+(num1/num2));
        }
        else{
            System.out.println("Enter Valid Operator");
        }
    }
}