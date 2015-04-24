package org.campagnelab.ANTLR.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;

public class LexerAlternative_Constraints extends BaseConstraintsDescriptor {
  public LexerAlternative_Constraints() {
    super(MetaIdFactory.conceptId(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x175f2668a8872629L));
  }
  @Override
  public boolean hasOwnCanBeAncestorMethod() {
    return true;
  }
  @Override
  public boolean canBeAncestor(SNode node, @Nullable SNode childNode, SNode childConcept, IOperationContext context, @Nullable CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeAnAncestor(node, childNode, childConcept, context);

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeAncesctorBreakingPoint);
    }

    return result;
  }
  public static boolean static_canBeAnAncestor(SNode node, SNode childNode, SNode childConcept, final IOperationContext operationContext) {

    SAbstractConcept[] concepts = {MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113e657fL, "org.campagnelab.ANTLR.structure.StringLiteral"), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d846L, "org.campagnelab.ANTLR.structure.Sequence"), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113b458fL, "org.campagnelab.ANTLR.structure.Alternative"), MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x1ebae6380de70d78L, "org.campagnelab.ANTLR.structure.RuleRefByName")};
    for (SAbstractConcept c : concepts) {
      if (childConcept == SNodeOperations.asNode(c)) {
        return true;
      }
    }
    return false;
  }
  private static SNodePointer canBeAncesctorBreakingPoint = new SNodePointer("r:3ea820cb-552a-4e36-be62-2f72cccd6e1d(org.campagnelab.ANTLR.constraints)", "1684107016606370918");
}
