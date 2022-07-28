public class ExpressionTree{

  // INSTANCE VARIABLES
  private double value;
  private ExpressionTree left,right;
  private char operator;

  // YOU WILL FILL IN 2 METHODS: toString() and evaluate() -- see end of code


  //  ************** CONSTRUCTORS ****************
  // Constructor - tree can be just a value
  public ExpressionTree(double val){
   value = val;
   left = null;
   right = null;
  }

  // Constructor - Tree can be an operator that connects two sub-trees
  public ExpressionTree(char op, ExpressionTree l, ExpressionTree r){
    operator = op;
    left = l;
    right =r;
  }

  //  ************* PROVIDED METHODS ****************
  // checks if the expressionTree is a value (as opposed to an operator with subtrees)
  private boolean isValue(){
    return left==null && right ==null;
  }

  //Return false when the node is a value, true when it is an operator
  private boolean isOperator(){
    return !isValue();
  }

  //To simplify things, you get a method to use to convert the
  //operator and two values into a result.
  private double apply(double a, double b, char op){
   if(op == '+'){
    return a+b;
   }else if(op == '-'){
    return a-b;
   }else if(op == '*'){
    return a*b;
   }else{ //  if(op == '/'){ //or any invalid operators
    return a/b;
   }
  }


   //  ************* METHODS TO WRITE ****************
    

    /* Return a string representation of the tree
    EXAMPLES:
    "12.5"  //just a value
    "(5.0-8.0)" //a tree with 2 value children
    "(12.5*(5.0-8.0)) //a tree that is the product of the previous two example trees
    "(((2.0+1.0)/(8.0*0.43)) - 1.0)" //a tree with more 
    */
    public String toString(){
    // Set up empty String, as we will need to return one
      String result = "";
      if(isValue()){
        result += value;
      } else {
        result += "("+ left.toString() + " " + operator + " " + right.toString()  + ")";
      }
     return result;
    }


    //Calculate the value of the entire tree
    // Your thinking from toString() may help here
    // This method will also be recursive
    // Also, use provided method: apply(double a, double b, char op)
    public double evaluate(){
      double result = 0.0;
      if (isValue()){
        result = value;
      } else{
        result = apply(left.evaluate(), right.evaluate(), operator); 
      }
      return result;
    }
  }


 