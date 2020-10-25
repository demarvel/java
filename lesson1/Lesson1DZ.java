public class Lesson1DZ {
    public static void main(String[] args) {
        byte VariableByte = 127;
        short variableShort = 32127;
        int variableInt = 213;
        long variableLong = 1234567865L;
        float variableFloat = 432.04F;
        double variableDouble = 5342.5235D;
        boolean variableBoolean = true;
        String variableString = "Привет я строковый тип данных";
        System.out.println(ReturnResult(2,4,8,2));
        System.out.println(SumVariables(1,20));
        System.out.println(SumVariables(10,5));
        PositiveOrNegativeVariable(127);
        System.out.println(NegativeVariable(-3));
        HiMethod("Алексей");
        System.out.println(LeapYearMethod(4));
        System.out.println(LeapYearMethod(100));
        System.out.println(LeapYearMethod(400));
        System.out.println(LeapYearMethod(233));
    }
    public static int ReturnResult(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
    public static boolean SumVariables(int a, int b){
        int sum = a + b;
        if ( sum >= 10 && sum <=20){
            return true;
        }else {
            return false;
        }
    }
    public static void PositiveOrNegativeVariable(int variable){
        if (variable >= 0){
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное число");
        }
    }
    public static boolean NegativeVariable(int variable){
        if (variable < 0){
            return true;
        }else{
            return false;
        }
    }
    public static void HiMethod(String name){
        System.out.println("Привет, " + name + "!");
    }
    public static boolean LeapYearMethod(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }else {
            return false;
        }
    }
}
