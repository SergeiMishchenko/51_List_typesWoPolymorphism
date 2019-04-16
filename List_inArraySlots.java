/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements; // the number of elements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
         intElements = new int[5];
         doubleElements = new double[5];
         stringElements = new String[5];
         typeOfElements = new int[5];
         filledElements = 0;
    }


    /**
      @return the number of elements in this list
     */
     public int size() {
           return filledElements;
     }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
     public String toString() {
       String descrip = "[";
       for (int i = 0; i < filledElements; i++) {
           if (typeOfElements[i] == 0)
               descrip += intElements[i] + ",";
           else if (typeOfElements[i] == 1)
               descrip += doubleElements[i] + ",";
           else if (typeOfElements[i] == 2)
               descrip += stringElements[i] + ",";
        }
        return descrip + "]";
     }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
      public boolean add( int type   // same meaning as in typeOfElements
                        , int    intValue
                        , double doubleValue
                        , String stringValue
                        ) {
        if (filledElements == typeOfElements.length)
            expand();
        intElements[filledElements] = intValue;
        doubleElements[filledElements] = doubleValue;
        stringElements[filledElements] = stringValue;
        typeOfElements[filledElements ++] = type;
        return true;
      }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
      private void expand() {
          System.out.println( "expand... (for debugging)");
          
		  int[] intCopy = intElements; 
          intElements = new int[2 * filledElements]; 
          for(int i = 0; i < intCopy.length; i++) 
			intElements[i] = intCopy[i];   
          
		  double[] doubleCopy = doubleElements; 
          doubleElements = new double[2 * filledElements]; 
          for(int i = 0; i < doubleCopy.length; i++) 
			doubleElements[i] = doubleCopy[i];  
	  
          String[] stringCopy = stringElements; 
          stringElements = new String[2 * filledElements]; 
          for(int i = 0; i < stringCopy.length; i++) 
			stringElements[i] = stringCopy[i];  
          
		  int[] typeCopy = typeOfElements; 
          typeOfElements = new int[2 * filledElements]; 
          for(int i = 0; i < typeCopy.length; i++) 
			typeOfElements[i] = typeCopy[i];         
      }
	  
	  public Element get(int index){
          Element returnElement = new Element (typeOfElements[index],
                                               intElements[index],
                                               doubleElements[index],
                                               stringElements[index]);
          return returnElement;
      }
}