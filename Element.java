public class Element{
    public int type;
    public int intElement;
    public double doubElement;
    public String strElement;

    public Element(int type,
                   int intElement,
                   double doubElement,
                   String strElement
                  ){

        this.type = type;
        this.intElement = intElement;
        this.doubElement = doubElement;
        this.strElement = strElement;
    }

    public String toString(){
        String output = "";
        if (type == 0)
            output += intElement;
        else if (type == 1)
            output += doubElement;
        else
            output += strElement;
        return output;
    }


}