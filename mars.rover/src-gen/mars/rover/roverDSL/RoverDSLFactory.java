/**
 * generated by Xtext 2.23.0
 */
package mars.rover.roverDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mars.rover.roverDSL.RoverDSLPackage
 * @generated
 */
public interface RoverDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RoverDSLFactory eINSTANCE = mars.rover.roverDSL.impl.RoverDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Mission</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mission</em>'.
   * @generated
   */
  Mission createMission();

  /**
   * Returns a new object of class '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color</em>'.
   * @generated
   */
  Color createColor();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RoverDSLPackage getRoverDSLPackage();

} //RoverDSLFactory
