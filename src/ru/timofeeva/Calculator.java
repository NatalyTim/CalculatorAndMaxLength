package ru.timofeeva;

public class Calculator {
    /**
     * @author Timofeeva Natalia
     * @see #Calculator(String)
     * @see #findOperation()
     * @see #findParameters()
     * @see #calculate()
     *
     */
    private String inputString;
    private double parameter1;
    private double parameter2;
    private String operation;

    public Calculator(String inputString) {
        this.inputString = inputString;
    }
    /*
    *в данном методе находим необходимую операцию
     */
    public void findOperation() throws Exception{
      if (inputString.contains("+")){
          operation = "\\+";
      }else if (inputString.contains("-")){
          operation = "\\-";
      }else if (inputString.contains("/")){
          operation = "\\/";
      }else if(inputString.contains("*")){
          operation = "\\*";
      }else {
          throw new Exception("Delimeter is not exist");
      }
    }
    /*
    *в данном методе парсимвходной параметр и получаем parameter1 и parameter2, для дальнейшего вычисления.
     */

    public void findParameters()throws Exception {
        String[] str;
        str = inputString.trim().replace(",",".").split(operation);
        if (str.length == 2) {
            try {
                parameter1 = Double.parseDouble(str[0]);
            }catch (Exception e){
                System.out.println("Wrong type!");
            }
            try {
                parameter2 = Double.parseDouble(str[1]);
            }catch (Exception e){
                System.out.println("Wrong type!");
            }
        } else {
            throw new Exception("More arguments than expected");
        }
    }
    /*
    *@return result, если switch находит вычесляемую оперцию.
     */
    public double calculate(){
        double result = 0;
        switch (operation){
            case "\\+": result = parameter1 + parameter2;
                break;
            case "\\-": result = parameter1 - parameter2;
                break;
            case "\\/": result = parameter1 / parameter2;
                break;
            case "\\*": result = parameter1 * parameter2;
                break;
        }
        return result;
    }
}
