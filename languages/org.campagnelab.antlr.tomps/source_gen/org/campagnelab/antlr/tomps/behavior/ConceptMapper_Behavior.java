package org.campagnelab.antlr.tomps.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ConceptMapper_Behavior {
  public static void init(SNode thisNode) {
  }
  public static Language call_language_7627187573640578145(SNode thisNode) {
    return ConvertToMPS_Behavior.call_getLanguage_7627187573640238110(SNodeOperations.getNodeAncestor(thisNode, MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, "org.campagnelab.antlr.tomps.structure.ConvertToMPS"), false, false));
  }
  public static SNode call_converter_558881339892985529(SNode thisNode) {
    return SNodeOperations.getNodeAncestor(thisNode, MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, "org.campagnelab.antlr.tomps.structure.ConvertToMPS"), false, false);
  }
  public static SNode call_visitorReturnConcept_558881339892987079(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x69d936b00a0eba02L, 0x69d936b00a0eba03L, "concept"));
  }
  public static SNode call_grammar_558881339893016520(SNode thisNode) {
    return SLinkOperations.getTarget(SNodeOperations.getNodeAncestor(thisNode, MetaAdapterFactory.getConcept(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, "org.campagnelab.antlr.tomps.structure.ConvertToMPS"), false, false), MetaAdapterFactory.getReferenceLink(0x932d719ce93144d5L, 0x990ce115f79b5942L, 0x6a1bb02ea6061b82L, 0x6a1bb02ea6061be9L, "grammar"));
  }
}
