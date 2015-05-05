package org.campagnelab.antlr.tomps.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class Mapper_Behavior {
  public static void init(SNode thisNode) {
  }
  public static SNode call_alternative_558881339903204669(SNode thisNode) {
    return SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getNodeAncestor(thisNode, MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, "org.campagnelab.antlr.tomps.structure.AlternativeMapper"), false, false), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, "org.campagnelab.antlr.tomps.structure.AlternativeMapper")), MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, 0x6a1bb02ea6062391L, "alternative"));
  }
  public static SNode call_concept_558881339903199920(SNode thisNode) {
    return AlternativeMapper_Behavior.call_visitorReturnConcept_558881339892896625(SNodeOperations.cast(SNodeOperations.getParent(thisNode), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, "org.campagnelab.antlr.tomps.structure.AlternativeMapper")));
  }
  public static void call_linkDeclarationsForConceptInterface_4068410015139836194(final SNode thisNode, final List<SNode> links, SNode concept) {
    if (LOG.isInfoEnabled()) {
      LOG.info("adding links:" + IterableUtils.join(ListSequence.fromList(links).select(new ISelector<SNode, String>() {
        public String select(SNode it) {
          return SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98052f333L, "role"));
        }
      }), " "));
    }
    ListSequence.fromList(links).addSequence(ListSequence.fromList(SLinkOperations.getChildren(concept, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0xf979c3ba6bL, "linkDeclaration"))));
    ListSequence.fromList(BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), concept, "virtual_getImmediateSuperconcepts_1222430305282", new Object[]{})).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        Mapper_Behavior.call_linkDeclarationsForConceptInterface_4068410015139836194(thisNode, links, it);
      }
    });
  }
  public static List<SNode> call_linkDeclarations_4068410015139474010(final SNode thisNode, SNode concept) {
    final List<SNode> links = new ArrayList<SNode>();
    do {
      if (LOG.isInfoEnabled()) {
        LOG.info("adding links:" + IterableUtils.join(ListSequence.fromList(links).select(new ISelector<SNode, String>() {
          public String select(SNode it) {
            return SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98052f333L, "role"));
          }
        }), " "));
      }
      ListSequence.fromList(links).addSequence(ListSequence.fromList(SLinkOperations.getChildren(concept, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0xf979c3ba6bL, "linkDeclaration"))));
      ListSequence.fromList(SLinkOperations.getChildren(concept, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0x110358d693eL, "implements"))).visitAll(new IVisitor<SNode>() {
        public void visit(SNode iconcept) {
          Mapper_Behavior.call_linkDeclarationsForConceptInterface_4068410015139836194(thisNode, links, SLinkOperations.getTarget(iconcept, MetaAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x110356fc618L, 0x110356fe029L, "intfc")));
        }
      });
      concept = SLinkOperations.getTarget(concept, MetaAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0xf979be93cfL, "extends"));
    } while (concept != null);
    return links;
  }
  public static void call_propertyDeclarationsForConceptInterface_2860118060023510633(final SNode thisNode, final List<SNode> properties, SNode concept) {
    if (LOG.isInfoEnabled()) {
      LOG.info("adding links:" + IterableUtils.join(ListSequence.fromList(properties).select(new ISelector<SNode, String>() {
        public String select(SNode it) {
          return SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98052f333L, "role"));
        }
      }), " "));
    }
    ListSequence.fromList(properties).addSequence(ListSequence.fromList(SLinkOperations.getChildren(concept, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0xf979c3ba6cL, "propertyDeclaration"))));
    ListSequence.fromList(BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), concept, "virtual_getImmediateSuperconcepts_1222430305282", new Object[]{})).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        Mapper_Behavior.call_propertyDeclarationsForConceptInterface_2860118060023510633(thisNode, properties, it);
      }
    });
  }
  public static List<SNode> call_propertyDeclarations_2860118060023510679(final SNode thisNode, SNode concept) {
    final List<SNode> properties = new ArrayList<SNode>();
    do {
      if (LOG.isInfoEnabled()) {
        LOG.info("adding links:" + IterableUtils.join(ListSequence.fromList(properties).select(new ISelector<SNode, String>() {
          public String select(SNode it) {
            return SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979bd086aL, 0xf98052f333L, "role"));
          }
        }), " "));
      }
      ListSequence.fromList(properties).addSequence(ListSequence.fromList(SLinkOperations.getChildren(concept, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x1103553c5ffL, 0xf979c3ba6cL, "propertyDeclaration"))));
      ListSequence.fromList(SLinkOperations.getChildren(concept, MetaAdapterFactory.getContainmentLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0x110358d693eL, "implements"))).visitAll(new IVisitor<SNode>() {
        public void visit(SNode iconcept) {
          Mapper_Behavior.call_propertyDeclarationsForConceptInterface_2860118060023510633(thisNode, properties, SLinkOperations.getTarget(iconcept, MetaAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0x110356fc618L, 0x110356fe029L, "intfc")));
        }
      });
      concept = SLinkOperations.getTarget(concept, MetaAdapterFactory.getReferenceLink(0xc72da2b97cce4447L, 0x8389f407dc1158b7L, 0xf979ba0450L, 0xf979be93cfL, "extends"));
    } while (concept != null);
    return properties;
  }
  protected static Logger LOG = LogManager.getLogger(Mapper_Behavior.class);
}
