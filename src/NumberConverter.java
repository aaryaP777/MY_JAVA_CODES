public class NumberConverter {
    // Integer to Double
    public static Double intTodouble(Integer num){
        if(num != null){
            return num.doubleValue();
        }
        else{
            return null;
        }
    }

    //Integer to String
    public static String intTostring(Integer num){
        if(num != null){
            return String.valueOf(num);
        }
        else{
            return null;
        }
    }
    
    //String to Integer
    public static Integer StringToInt(String s){
        try{
            return Integer.valueOf(s);
        }
        catch (NumberFormatException e){
            System.err.println("Error: " + e.getMessage());
            return null;
        }
    }

    //String to Double
    public static Double StringTodouble(String s){
        try{
            return Double.valueOf(s);
        }
        catch (NumberFormatException e){
            System.err.println("Error: " + e.getMessage());
            return null;
        }
    }

    // Double to Integer
    public static Integer doubleToint(Double num){
        if(num != null){
            return num.intValue();
        }
        else{
            return null;
        }
    }

    //Double to String
    public static String DoubleTostring(Double num) {
        if (num != null) {
            return String.valueOf(num);
        } else {
            return null;
        }
    }
    public static void main(String[] args) {

        String strFromInt = intTostring(456);
        System.out.println("String value from integer: " + strFromInt);

        Double doubleFromInt = intTodouble(234);
        System.out.println("Integer value from double: " + doubleFromInt);

        String strNum = "123";
        Integer intNum = StringToInt(strNum);
        System.out.println("Integer value from String: " + intNum);

        String strNum2 = "123";
        Double doubleNum = StringTodouble(strNum2);
        System.out.println("Double value from String: " + doubleNum);

        Integer intNum2 = doubleToint(123.456);
        System.out.println("Double from Integer: " + intNum2);

        String doubleFromstring = DoubleTostring(789.123);
        System.out.println("String value from double: " + doubleFromstring);

    }

}

