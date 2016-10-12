package org.campagnelab.antlr.tomps.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public final class ChildDestination__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9099L, "org.campagnelab.antlr.tomps.structure.ChildDestination");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> name_id2uLbzznpwAh = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("name").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("2uLbzznpwAh").registry(REGISTRY).build();
  public static final SMethod<SNode> to_idWSCumwYo$I = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("to").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("WSCumwYo$I").registry(REGISTRY).build();
  public static final SMethod<SNode> type_id5qM9mr9Mqo7 = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("type").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("5qM9mr9Mqo7").registry(REGISTRY).build();
  public static final SMethod<SNode> cellModel_id1AEWcuffMHI = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("cellModel").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1AEWcuffMHI").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""));
  public static final SMethod<SNode> textGenAppendPart_id3V2IUSqzmkO = new SMethodBuilder<SNode>(new SJavaCompoundTypeImpl((Class<SNode>) ((Class) Object.class))).name("textGenAppendPart").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("3V2IUSqzmkO").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(name_id2uLbzznpwAh, to_idWSCumwYo$I, type_id5qM9mr9Mqo7, cellModel_id1AEWcuffMHI, textGenAppendPart_id3V2IUSqzmkO);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String name_id2uLbzznpwAh(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9099L, 0x4aaf5f3861bb96d2L, "to")), MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98052f333L, "role"));
  }
  /*package*/ static SNode to_idWSCumwYo$I(@NotNull SNode __thisNode__) {
    return SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9099L, 0x4aaf5f3861bb96d2L, "to"));
  }
  /*package*/ static SNode type_id5qM9mr9Mqo7(@NotNull SNode __thisNode__) {
    return null;
  }
  protected static Logger LOG = LogManager.getLogger(ChildDestination__BehaviorDescriptor.class);
  /*package*/ static SNode cellModel_id1AEWcuffMHI(@NotNull SNode __thisNode__, String cardinality) {
    if (eq_5ab1t5_a0a0a71_0(cardinality, "0..n") || eq_5ab1t5_a0a0a71(cardinality, "1..n")) {
      if (LOG.isInfoEnabled()) {
        LOG.info("visiting destination (child[..n])");
      }
      return _quotation_createNode_g7uedr_a1a0a3(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9099L, 0x4aaf5f3861bb96d2L, "to")));
    } else {
      if (LOG.isInfoEnabled()) {
        LOG.info("visiting destination (child)");
      }

      return _quotation_createNode_g7uedr_a2a0a0d(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9099L, 0x4aaf5f3861bb96d2L, "to")));
    }

  }
  /*package*/ static SNode textGenAppendPart_id3V2IUSqzmkO(@NotNull SNode __thisNode__, String cardinality) {
    if (LOG.isInfoEnabled()) {
      LOG.info("visiting textGen " + BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9099L, 0x4aaf5f3861bb96d2L, "to"))));
    }
    if (eq_5ab1t5_a0a1a81_0(cardinality, "0..n") || eq_5ab1t5_a0a1a81(cardinality, "1..n")) {
      if (LOG.isInfoEnabled()) {
        LOG.info("visiting destination (child[..n])");
      }
      return createCollectionAppendPart_g7uedr_a1a1a4(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9099L, 0x4aaf5f3861bb96d2L, "to")));
    } else {
      if (LOG.isInfoEnabled()) {
        LOG.info("visiting destination (child)");
      }

      return createNodeAppendPart_g7uedr_a2a0b0e(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x4aaf5f3861bb9099L, 0x4aaf5f3861bb96d2L, "to")));
    }

  }

  /*package*/ ChildDestination__BehaviorDescriptor() {
    super(REGISTRY);
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((String) name_id2uLbzznpwAh(node));
      case 1:
        return (T) ((SNode) to_idWSCumwYo$I(node));
      case 2:
        return (T) ((SNode) type_id5qM9mr9Mqo7(node));
      case 3:
        return (T) ((SNode) cellModel_id1AEWcuffMHI(node, (String) parameters[0]));
      case 4:
        return (T) ((SNode) textGenAppendPart_id3V2IUSqzmkO(node, (String) parameters[0]));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }
  private static SNode _quotation_createNode_g7uedr_a1a0a3(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eb0ad38eL, "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10964446123L, 0x10973779681L, "relationDeclaration"), (SNode) parameter_1);
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_g7uedr_a2a0a0d(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xf9eb05cdc7L, "jetbrains.mps.lang.editor.structure.CellModel_RefNode"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x10964446123L, 0x10973779681L, "relationDeclaration"), (SNode) parameter_1);
    return quotedNode_2;
  }
  private static SNode createCollectionAppendPart_g7uedr_a1a1a4(Object p0) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xb83431fe5c8f40bcL, 0x8a3665e25f4dd253L, 0x1201527819cL, "jetbrains.mps.lang.textGen.structure.CollectionAppendPart"), null, null, false);
    {
      SNode n2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression"), null, null, false);
      {
        SNode n3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xb83431fe5c8f40bcL, 0x8a3665e25f4dd253L, 0x11f411d576bL, "jetbrains.mps.lang.textGen.structure.NodeParameter"), null, null, false);
        n2.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46a4416L, "operand"), n3);
        SNode n4 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f970c119L, "jetbrains.mps.lang.smodel.structure.SLinkListAccess"), null, null, false);
        n4.setReferenceTarget(MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f970c119L, 0x108f974c962L, "link"), (SNode) p0);
        n2.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46b36c4L, "operation"), n4);
      }
      n1.addChild(MetaAdapterFactory.getContainmentLink(0xb83431fe5c8f40bcL, 0x8a3665e25f4dd253L, 0x1201527819cL, 0x120152e6dcfL, "list"), n2);
    }
    return n1;
  }
  private static SNode createNodeAppendPart_g7uedr_a2a0b0e(Object p0) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xb83431fe5c8f40bcL, 0x8a3665e25f4dd253L, 0x12015251a28L, "jetbrains.mps.lang.textGen.structure.NodeAppendPart"), null, null, false);
    {
      SNode n2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, "jetbrains.mps.baseLanguage.structure.DotExpression"), null, null, false);
      {
        SNode n3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0xb83431fe5c8f40bcL, 0x8a3665e25f4dd253L, 0x11f411d576bL, "jetbrains.mps.lang.textGen.structure.NodeParameter"), null, null, false);
        n2.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46a4416L, "operand"), n3);
        SNode n4 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f970c119L, "jetbrains.mps.lang.smodel.structure.SLinkListAccess"), null, null, false);
        n4.setReferenceTarget(MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x108f970c119L, 0x108f974c962L, "link"), (SNode) p0);
        n2.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x116b46a08c4L, 0x116b46b36c4L, "operation"), n4);
      }
      n1.addChild(MetaAdapterFactory.getContainmentLink(0xb83431fe5c8f40bcL, 0x8a3665e25f4dd253L, 0x12015251a28L, 0x120152c1030L, "value"), n2);
    }
    return n1;
  }
  private static boolean eq_5ab1t5_a0a0a71(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
  private static boolean eq_5ab1t5_a0a0a71_0(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
  private static boolean eq_5ab1t5_a0a1a81(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
  private static boolean eq_5ab1t5_a0a1a81_0(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
}
