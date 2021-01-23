/**
 * generated by Xtext 2.23.0
 */
package mars.rover.roverDSL.impl;

import mars.rover.roverDSL.Color;
import mars.rover.roverDSL.Colors;
import mars.rover.roverDSL.Mission;
import mars.rover.roverDSL.MissionType;
import mars.rover.roverDSL.RoverDSLFactory;
import mars.rover.roverDSL.RoverDSLPackage;
import mars.rover.roverDSL.Safety;
import mars.rover.roverDSL.Tasks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoverDSLPackageImpl extends EPackageImpl implements RoverDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tasksEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass missionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum missionTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum safetyEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see mars.rover.roverDSL.RoverDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RoverDSLPackageImpl()
  {
    super(eNS_URI, RoverDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link RoverDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RoverDSLPackage init()
  {
    if (isInited) return (RoverDSLPackage)EPackage.Registry.INSTANCE.getEPackage(RoverDSLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredRoverDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    RoverDSLPackageImpl theRoverDSLPackage = registeredRoverDSLPackage instanceof RoverDSLPackageImpl ? (RoverDSLPackageImpl)registeredRoverDSLPackage : new RoverDSLPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theRoverDSLPackage.createPackageContents();

    // Initialize created meta-data
    theRoverDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRoverDSLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RoverDSLPackage.eNS_URI, theRoverDSLPackage);
    return theRoverDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTasks()
  {
    return tasksEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTasks_Missionlist()
  {
    return (EReference)tasksEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMission()
  {
    return missionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMission_Missiontype()
  {
    return (EAttribute)missionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMission_Beginsentence()
  {
    return (EAttribute)missionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMission_Finalsentence()
  {
    return (EAttribute)missionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMission_Forwardspeed()
  {
    return (EReference)missionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMission_Reversespeed()
  {
    return (EReference)missionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMission_Turndirection()
  {
    return (EReference)missionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMission_Safetyproperty()
  {
    return (EAttribute)missionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMission_Objectdistance()
  {
    return (EReference)missionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMission_Bordercolor()
  {
    return (EReference)missionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMission_Lakelist()
  {
    return (EAttribute)missionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMission_Colorlist()
  {
    return (EAttribute)missionEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMission_Measurelist()
  {
    return (EAttribute)missionEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMission_Flashingcolor()
  {
    return (EReference)missionEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMission_Timeout()
  {
    return (EReference)missionEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInteger()
  {
    return integerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInteger_Integer()
  {
    return (EAttribute)integerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getColor()
  {
    return colorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getColor_Color()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getMissionType()
  {
    return missionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getColors()
  {
    return colorsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getSafety()
  {
    return safetyEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoverDSLFactory getRoverDSLFactory()
  {
    return (RoverDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    tasksEClass = createEClass(TASKS);
    createEReference(tasksEClass, TASKS__MISSIONLIST);

    missionEClass = createEClass(MISSION);
    createEAttribute(missionEClass, MISSION__MISSIONTYPE);
    createEAttribute(missionEClass, MISSION__BEGINSENTENCE);
    createEAttribute(missionEClass, MISSION__FINALSENTENCE);
    createEReference(missionEClass, MISSION__FORWARDSPEED);
    createEReference(missionEClass, MISSION__REVERSESPEED);
    createEReference(missionEClass, MISSION__TURNDIRECTION);
    createEAttribute(missionEClass, MISSION__SAFETYPROPERTY);
    createEReference(missionEClass, MISSION__OBJECTDISTANCE);
    createEReference(missionEClass, MISSION__BORDERCOLOR);
    createEAttribute(missionEClass, MISSION__LAKELIST);
    createEAttribute(missionEClass, MISSION__COLORLIST);
    createEAttribute(missionEClass, MISSION__MEASURELIST);
    createEReference(missionEClass, MISSION__FLASHINGCOLOR);
    createEReference(missionEClass, MISSION__TIMEOUT);

    integerEClass = createEClass(INTEGER);
    createEAttribute(integerEClass, INTEGER__INTEGER);

    colorEClass = createEClass(COLOR);
    createEAttribute(colorEClass, COLOR__COLOR);

    // Create enums
    missionTypeEEnum = createEEnum(MISSION_TYPE);
    colorsEEnum = createEEnum(COLORS);
    safetyEEnum = createEEnum(SAFETY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(tasksEClass, Tasks.class, "Tasks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTasks_Missionlist(), this.getMission(), null, "missionlist", null, 0, -1, Tasks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMission_Missiontype(), this.getMissionType(), "missiontype", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMission_Beginsentence(), ecorePackage.getEString(), "beginsentence", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMission_Finalsentence(), ecorePackage.getEString(), "finalsentence", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMission_Forwardspeed(), this.getInteger(), null, "forwardspeed", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMission_Reversespeed(), this.getInteger(), null, "reversespeed", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMission_Turndirection(), this.getInteger(), null, "turndirection", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMission_Safetyproperty(), this.getSafety(), "safetyproperty", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMission_Objectdistance(), this.getInteger(), null, "objectdistance", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMission_Bordercolor(), this.getColor(), null, "bordercolor", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMission_Lakelist(), this.getColors(), "lakelist", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMission_Colorlist(), this.getColors(), "colorlist", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMission_Measurelist(), this.getColors(), "measurelist", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMission_Flashingcolor(), this.getColor(), null, "flashingcolor", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMission_Timeout(), this.getInteger(), null, "timeout", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerEClass, mars.rover.roverDSL.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteger_Integer(), ecorePackage.getEInt(), "integer", null, 0, 1, mars.rover.roverDSL.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColor_Color(), this.getColors(), "color", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(missionTypeEEnum, MissionType.class, "MissionType");
    addEEnumLiteral(missionTypeEEnum, MissionType.FIND_COLORS);
    addEEnumLiteral(missionTypeEEnum, MissionType.MEASURE);
    addEEnumLiteral(missionTypeEEnum, MissionType.PARK);

    initEEnum(colorsEEnum, Colors.class, "Colors");
    addEEnumLiteral(colorsEEnum, Colors.WHITE);
    addEEnumLiteral(colorsEEnum, Colors.RED);
    addEEnumLiteral(colorsEEnum, Colors.BLUE);
    addEEnumLiteral(colorsEEnum, Colors.YELLOW);
    addEEnumLiteral(colorsEEnum, Colors.BLACK);

    initEEnum(safetyEEnum, Safety.class, "Safety");
    addEEnumLiteral(safetyEEnum, Safety.ON);
    addEEnumLiteral(safetyEEnum, Safety.OFF);

    // Create resource
    createResource(eNS_URI);
  }

} //RoverDSLPackageImpl
