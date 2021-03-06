/* This file was generated with JastAdd2 (http://jastadd.org) version R20121122 (r889) */
package ast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Modifier;
/**
 * @production JavaTypeName : {@link TypeName} ::= <span class="component">&lt;Name:String&gt;</span>;
 * @ast node
 * @declaredat C:/Users/Andy/Desktop/PL3007Compiler/lab3/lab3_solution/src/frontend/grammar.ast:25
 */
public class JavaTypeName extends TypeName implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    getDescriptor_visited = false;
    getDescriptor_computed = false;
    getDescriptor_value = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public JavaTypeName clone() throws CloneNotSupportedException {
    JavaTypeName node = (JavaTypeName)super.clone();
    node.getDescriptor_visited = false;
    node.getDescriptor_computed = false;
    node.getDescriptor_value = null;
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public JavaTypeName copy() {
      try {
        JavaTypeName node = (JavaTypeName)clone();
        if(children != null) node.children = (ASTNode[])children.clone();
        return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   */
  @SuppressWarnings({"unchecked", "cast"})
  public JavaTypeName fullCopy() {
    try {
      JavaTypeName tree = (JavaTypeName) clone();
      tree.setParent(null);// make dangling
      if (children != null) {
        tree.children = new ASTNode[children.length];
        for (int i = 0; i < children.length; ++i) {
          if (children[i] == null) {
            tree.children[i] = null;
          } else {
            tree.children[i] = ((ASTNode) children[i]).fullCopy();
            ((ASTNode) tree.children[i]).setParent(tree);
          }
        }
      }
      return tree;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " +
        getClass().getName());
    }
  }
  /**
   * @ast method 
   * 
   */
  public JavaTypeName() {
    super();


  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @ast method 
   * 
   */
  public void init$Children() {
  }
  /**
   * @ast method 
   * 
   */
  public JavaTypeName(String p0) {
    setName(p0);
  }
  /**
   * @ast method 
   * 
   */
  public JavaTypeName(beaver.Symbol p0) {
    setName(p0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * Replaces the lexeme Name.
   * @param value The new value for the lexeme Name.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setName(String value) {
    tokenString_Name = value;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  protected String tokenString_Name;
  /**
   * @ast method 
   * 
   */
  
  public int Namestart;
  /**
   * @ast method 
   * 
   */
  
  public int Nameend;
  /**
   * JastAdd-internal setter for lexeme Name using the Beaver parser.
   * @apilevel internal
   * @ast method 
   * 
   */
  public void setName(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
      throw new UnsupportedOperationException("setName is only valid for String lexemes");
    tokenString_Name = (String)symbol.value;
    Namestart = symbol.getStart();
    Nameend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Name.
   * @return The value for the lexeme Name.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public String getName() {
    return tokenString_Name != null ? tokenString_Name : "";
  }
  /**
   * @apilevel internal
   */
  protected boolean getDescriptor_visited = false;
  /**
   * @apilevel internal
   */
  protected boolean getDescriptor_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDescriptor getDescriptor_value;
  /** Determine type descriptor for type name. * @attribute syn
   * @aspect types
   * @declaredat C:/Users/Andy/Desktop/PL3007Compiler/lab3/lab3_solution/src/frontend/types.jrag:33
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDescriptor getDescriptor() {
    if(getDescriptor_computed) {
      return getDescriptor_value;
    }
    if(getDescriptor_visited)
      throw new RuntimeException("Circular definition of attr: getDescriptor in class: ");
    getDescriptor_visited = true;
    getDescriptor_value = getDescriptor_compute();
      if(true) getDescriptor_computed = true;
    getDescriptor_visited = false;
    return getDescriptor_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDescriptor getDescriptor_compute() {  return TypeDescriptor.forJavaType(getName());  }
}
