class ParsingStrings
{
    public static void main(String[] args)
    {
        String str1 = "-12345";
        String str2 = "756.83";

        int intNum;
        float floatNum;
        double decimalNum;

        intNum = Integer.parseInt(str1);
        floatNum = Float.parseFloat(str2);
        decimalNum = Double.parseDouble(str2);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("intNum = " + intNum);
        System.out.println("floatNum = " + floatNum);
        System.out.println("decimalNum = " + decimalNum);
    System.out.println("The numeric value of str1 + str2 = "+ (Integer.parseInt(str1)+ Double.parseDouble(str2)));
        System.out.println(Integer.parseInt("6543")
                                       + Integer.parseInt("50"));
    }
}
