package org.campagnelab.antlr.tomps.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class Source_Behavior {
  public static void init(SNode thisNode) {
  }
  public static SNode call_alternative_4068410015137938233(SNode thisNode) {
    return SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getNodeAncestor(thisNode, MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, "org.campagnelab.antlr.tomps.structure.AlternativeMapper"), false, false), MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, "org.campagnelab.antlr.tomps.structure.AlternativeMapper")), MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea606232bL, 0x6a1bb02ea6062391L, "alternative"));
  }
}
